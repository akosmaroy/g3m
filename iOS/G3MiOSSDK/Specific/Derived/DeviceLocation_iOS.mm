//
//  DeviceLocation_iOS.mm
//  G3MiOSSDK
//
//  Created by Jose Miguel SN on 25/6/15.
//
//

#include "DeviceLocation_iOS.hpp"

@implementation LocationDelegate

#pragma mark Location Delegate

-(void) startTrackingLocation{
  _locationManager = [[CLLocationManager alloc] init];
  _locationManager.delegate = self;
  _locationManager.desiredAccuracy = kCLLocationAccuracyBest;
  _locationManager.distanceFilter = kCLDistanceFilterNone;
  [_locationManager startUpdatingLocation];
}

-(void) stopTrackingLocation{
  [_locationManager stopUpdatingLocation];
  _lastLocation = nil;
}

- (void)locationManager:(CLLocationManager *)manager didUpdateLocations:(NSArray *)locations{
  _lastLocation = [locations lastObject];
}

- (Geodetic3D) getLocation{
  if (_lastLocation != NULL){
    return Geodetic3D::fromDegrees(_lastLocation.coordinate.latitude, _lastLocation.coordinate.longitude, _lastLocation.altitude);
  }
  return Geodetic3D::nan();
}

- (void)locationManager:(CLLocationManager *)manager didFailWithError:(NSError *)error{
  ILogger::instance()->logError("DeviceLocation_iOS produced an error.");
}

@end


DeviceLocation_iOS::DeviceLocation_iOS(){
  _delegate = [[LocationDelegate alloc] init];
  _isTracking = false;
}

bool DeviceLocation_iOS::startTrackingLocation(){  
  [_delegate startTrackingLocation];
  _isTracking = true;
  return _isTracking;
}

void DeviceLocation_iOS::stopTrackingLocation(){
  [_delegate stopTrackingLocation];
  _isTracking = false;
}

bool DeviceLocation_iOS::isTrackingLocation(){
  return _isTracking;
}

Geodetic3D  DeviceLocation_iOS::getLocation(){
  return [_delegate getLocation];
}