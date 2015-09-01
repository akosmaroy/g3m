//
//  DeviceAttitudeCameraConstrainer.cpp
//  G3MiOSSDK
//
//  Created by Jose Miguel SN on 7/5/15.
//
//

#include "DeviceAttitudeCameraConstrainer.hpp"

#include "IDeviceAttitude.hpp"
#include "IDeviceLocation.hpp"
#include "IFactory.hpp"

DeviceAttitudeCameraConstrainer::DeviceAttitudeCameraConstrainer(bool updateLocation, double heightOffset):
_updateLocation(updateLocation),
_heightOffset(heightOffset),
_lastLocationUpdateTimeInMS(0),
_timer(NULL)
{
  
}

DeviceAttitudeCameraConstrainer::~DeviceAttitudeCameraConstrainer(){
  IDeviceAttitude::instance()->stopTrackingDeviceOrientation();
  IDeviceLocation::instance()->stopTrackingLocation();
  
  delete _timer;
}

bool DeviceAttitudeCameraConstrainer::onCameraChange(const Planet* planet,
                                                     const Camera* previousCamera,
                                                     Camera* nextCamera) const{
  
  
  IDeviceAttitude* devAtt = IDeviceAttitude::instance();
  
  if (devAtt == NULL){
    ILogger::instance()->logError("IDeviceAttitude not initilized");
    return false;
  }
  
  if (!devAtt->isTracking()){
    devAtt->startTrackingDeviceOrientation();
  }
  
  //Getting Global Rotation
  IDeviceAttitude::instance()->copyValueOfRotationMatrix(_attitudeMatrix);
  if (!_attitudeMatrix.isValid()){
    return false;
  }
  
  Geodetic3D camPosition = nextCamera->getGeodeticPosition();
  
  //Getting interface orientation
  InterfaceOrientation ori = IDeviceAttitude::instance()->getCurrentInterfaceOrientation();
  
  //Getting Attitude Matrix
  CoordinateSystem camCS = IDeviceAttitude::instance()->getCameraCoordinateSystemForInterfaceOrientation(ori);
  
  //Transforming global rotation to local rotation
  CoordinateSystem local = planet->getCoordinateSystemAt(camPosition);
  local.copyValueOfRotationMatrix(_localRM);
  _camRM.copyValueOfMultiplication(_localRM, _attitudeMatrix);
  
  //Applying to Camera CS
  CoordinateSystem finalCS = camCS.applyRotation(_camRM);
  nextCamera->setCameraCoordinateSystem(finalCS);
  
  if (_updateLocation){
    
    if (_timer == NULL){
      _timer = IFactory::instance()->createTimer();
    }
    
    long long t = _timer->nowInMilliseconds();
    
    if ((t - _lastLocationUpdateTimeInMS > 5000) || (_lastLocationUpdateTimeInMS == 0)){
      
      
      IDeviceLocation* loc = IDeviceLocation::instance();
      if (!loc->isTrackingLocation()){
        loc->startTrackingLocation();
      }
      
      Geodetic3D g = loc->getLocation();
      if (!g.isNan()){
        _lastLocationUpdateTimeInMS = t;
        
        nextCamera->setGeodeticPosition(Geodetic3D::fromDegrees(g._latitude._degrees,
                                                                g._longitude._degrees,
                                                                g._height + _heightOffset));
      }
    }
    
  }
  
  return true;
}