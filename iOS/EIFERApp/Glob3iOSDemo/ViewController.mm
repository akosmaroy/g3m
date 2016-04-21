//
//  ViewController.m
//  Glob3iOSDemo
//
//  Created by José Miguel S N on 31/05/12.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

#import "ViewController.h"

#import <G3MiOSSDK/G3MBuilder_iOS.hpp>
#import <G3MiOSSDK/VisibleSectorListener.hpp>
#import <G3MiOSSDK/MarksRenderer.hpp>
#import <G3MiOSSDK/ShapesRenderer.hpp>
#import <G3MiOSSDK/GEORenderer.hpp>
#import <G3MiOSSDK/BusyMeshRenderer.hpp>
#import <G3MiOSSDK/MeshRenderer.hpp>
#import <G3MiOSSDK/FloatBufferBuilderFromGeodetic.hpp>
#import <G3MiOSSDK/FloatBufferBuilderFromColor.hpp>
#import <G3MiOSSDK/DirectMesh.hpp>
#import <G3MiOSSDK/WMSLayer.hpp>
#import <G3MiOSSDK/CameraSingleDragHandler.hpp>
#import <G3MiOSSDK/CameraDoubleDragHandler.hpp>
#import <G3MiOSSDK/CameraZoomAndRotateHandler.hpp>
#import <G3MiOSSDK/CameraRotationHandler.hpp>
#import <G3MiOSSDK/CameraDoubleTapHandler.hpp>
#import <G3MiOSSDK/LevelTileCondition.hpp>
#import <G3MiOSSDK/SectorTileCondition.hpp>
#import <G3MiOSSDK/AndTileCondition.hpp>
#import <G3MiOSSDK/LayerBuilder.hpp>
#import <G3MiOSSDK/PlanetRendererBuilder.hpp>
#import <G3MiOSSDK/MarkTouchListener.hpp>
#import <G3MiOSSDK/TrailsRenderer.hpp>
#import <G3MiOSSDK/Mark.hpp>
#import <G3MiOSSDK/CircleShape.hpp>
#import <G3MiOSSDK/QuadShape.hpp>
#import <G3MiOSSDK/BoxShape.hpp>
#import <G3MiOSSDK/EllipsoidShape.hpp>
#import <G3MiOSSDK/SceneJSShapesParser.hpp>
#import <G3MiOSSDK/LayoutUtils.hpp>
#import <G3MiOSSDK/IJSONParser.hpp>
#import <G3MiOSSDK/JSONGenerator.hpp>
#import <G3MiOSSDK/JSONString.hpp>
#import <G3MiOSSDK/BSONParser.hpp>
#import <G3MiOSSDK/BSONGenerator.hpp>
#import <G3MiOSSDK/MeshShape.hpp>
#import <G3MiOSSDK/IShortBuffer.hpp>
#import <G3MiOSSDK/SimpleCameraConstrainer.hpp>
#import <G3MiOSSDK/WMSBilElevationDataProvider.hpp>
#import <G3MiOSSDK/ElevationData.hpp>
#import <G3MiOSSDK/IBufferDownloadListener.hpp>
#import <G3MiOSSDK/BilParser.hpp>
#import <G3MiOSSDK/ShortBufferBuilder.hpp>
#import <G3MiOSSDK/BilinearInterpolator.hpp>
#import <G3MiOSSDK/SubviewElevationData.hpp>
#import <G3MiOSSDK/GInitializationTask.hpp>
#import <G3MiOSSDK/PeriodicalTask.hpp>
#import <G3MiOSSDK/IDownloader.hpp>
#import <G3MiOSSDK/OSMLayer.hpp>
#import <G3MiOSSDK/CartoDBLayer.hpp>
#import <G3MiOSSDK/HereLayer.hpp>
#import <G3MiOSSDK/MapQuestLayer.hpp>
#import <G3MiOSSDK/MapBoxLayer.hpp>
#import <G3MiOSSDK/GoogleMapsLayer.hpp>
#import <G3MiOSSDK/BingMapsLayer.hpp>
#import <G3MiOSSDK/BusyQuadRenderer.hpp>
#import <G3MiOSSDK/Factory_iOS.hpp>
#import <G3MiOSSDK/G3MWidget.hpp>
#import <G3MiOSSDK/GEOJSONParser.hpp>
//import <G3MiOSSDK/WMSBilElevationDataProvider.hpp>
#import <G3MiOSSDK/SingleBilElevationDataProvider.hpp>
#import <G3MiOSSDK/FloatBufferElevationData.hpp>
#import <G3MiOSSDK/GEOSymbolizer.hpp>
#import <G3MiOSSDK/GEO2DMultiLineStringGeometry.hpp>
#import <G3MiOSSDK/GEO2DLineStringGeometry.hpp>
#import <G3MiOSSDK/GEOFeature.hpp>
#import <G3MiOSSDK/JSONObject.hpp>
#import <G3MiOSSDK/GEOLine2DMeshSymbol.hpp>
#import <G3MiOSSDK/GEOMultiLine2DMeshSymbol.hpp>
#import <G3MiOSSDK/GEOLine2DStyle.hpp>
#import <G3MiOSSDK/GEO2DPointGeometry.hpp>
#import <G3MiOSSDK/GEOShapeSymbol.hpp>
#import <G3MiOSSDK/GEOMarkSymbol.hpp>
#import <G3MiOSSDK/GFont.hpp>
#import <G3MiOSSDK/CompositeElevationDataProvider.hpp>
#import <G3MiOSSDK/LayerTilesRenderParameters.hpp>
#import <G3MiOSSDK/RectangleI.hpp>
#import <G3MiOSSDK/LayerTilesRenderParameters.hpp>
#import <G3MiOSSDK/QuadShape.hpp>
#import <G3MiOSSDK/IImageUtils.hpp>
#import <G3MiOSSDK/RectangleF.hpp>
#import <G3MiOSSDK/ShortBufferElevationData.hpp>
#import <G3MiOSSDK/SGShape.hpp>
#import <G3MiOSSDK/SGNode.hpp>
#import <G3MiOSSDK/SGMaterialNode.hpp>
#import <G3MiOSSDK/MapBooOLDBuilder_iOS.hpp>
#import <G3MiOSSDK/IWebSocketListener.hpp>
#import <G3MiOSSDK/GPUProgramFactory.hpp>
#import <G3MiOSSDK/FloatBufferBuilderFromCartesian3D.hpp>
#import <G3MiOSSDK/Color.hpp>
#import <G3MiOSSDK/GEOLineRasterSymbol.hpp>
#import <G3MiOSSDK/GEOMultiLineRasterSymbol.hpp>
#import <G3MiOSSDK/GEO2DLineRasterStyle.hpp>
#import <G3MiOSSDK/GEO2DPolygonGeometry.hpp>
#import <G3MiOSSDK/GEOPolygonRasterSymbol.hpp>
#import <G3MiOSSDK/GEO2DSurfaceRasterStyle.hpp>
#import <G3MiOSSDK/GEO2DMultiPolygonGeometry.hpp>
#import <G3MiOSSDK/GPUProgramFactory.hpp>
#import <G3MiOSSDK/GenericQuadTree.hpp>
#import <G3MiOSSDK/GEOFeatureCollection.hpp>
#import <G3MiOSSDK/Angle.hpp>
#import <G3MiOSSDK/SectorAndHeightCameraConstrainer.hpp>
#import <G3MiOSSDK/HUDImageRenderer.hpp>
#import <G3MiOSSDK/ColumnCanvasElement.hpp>
#import <G3MiOSSDK/TextCanvasElement.hpp>
#import <G3MiOSSDK/URLTemplateLayer.hpp>
#import <G3MiOSSDK/JSONArray.hpp>
#import <G3MiOSSDK/SceneLighting.hpp>
#import <G3MiOSSDK/HUDRenderer.hpp>
#import <G3MiOSSDK/HUDQuadWidget.hpp>
#import <G3MiOSSDK/HUDAbsolutePosition.hpp>
#import <G3MiOSSDK/HUDRelativePosition.hpp>
#import <G3MiOSSDK/MultiTexturedHUDQuadWidget.hpp>
#import <G3MiOSSDK/HUDAbsoluteSize.hpp>
#import <G3MiOSSDK/HUDRelativeSize.hpp>
#import <G3MiOSSDK/DownloaderImageBuilder.hpp>
#import <G3MiOSSDK/LabelImageBuilder.hpp>
#import <G3MiOSSDK/CanvasImageBuilder.hpp>
#import <G3MiOSSDK/TerrainTouchListener.hpp>
#import <G3MiOSSDK/PlanetRenderer.hpp>
#import <G3MiOSSDK/G3MMeshParser.hpp>
#import <G3MiOSSDK/CoordinateSystem.hpp>
#import <G3MiOSSDK/TaitBryanAngles.hpp>
#import <G3MiOSSDK/GEOLabelRasterSymbol.hpp>
#import <G3MiOSSDK/LayerTouchEventListener.hpp>
#import <G3MiOSSDK/TiledVectorLayer.hpp>
#import <G3MiOSSDK/GEORasterSymbolizer.hpp>
#import <G3MiOSSDK/GEO2DPolygonData.hpp>
#import <G3MiOSSDK/ChessboardLayer.hpp>
#import <G3MiOSSDK/GEORectangleRasterSymbol.hpp>

#import <G3MiOSSDK/DefaultInfoDisplay.hpp>
#import <G3MiOSSDK/DebugTileImageProvider.hpp>
#import <G3MiOSSDK/GEOVectorLayer.hpp>
#import <G3MiOSSDK/Info.hpp>

#import <G3MiOSSDK/NonOverlappingMarksRenderer.hpp>
#import <G3MiOSSDK/LayerSet.hpp>
#import <G3MiOSSDK/PlanetRenderer.hpp>
#import <G3MiOSSDK/ILocationModifier.hpp>
#import <G3MiOSSDK/DeviceAttitudeCameraHandler.hpp>
#import <G3MiOSSDK/CityGMLBuilding.hpp>


#include <G3MiOSSDK/IFactory.hpp>
#include <G3MiOSSDK/IXMLNode.hpp>
#include <G3MiOSSDK/IDownloader.hpp>
#include <G3MiOSSDK/IBufferDownloadListener.hpp>
#include <G3MiOSSDK/G3MContext.hpp>
#include <G3MiOSSDK/DownloadPriority.hpp>
#include <G3MiOSSDK/TimeInterval.hpp>
#include <G3MiOSSDK/IStringUtils.hpp>
#include <G3MiOSSDK/CityGMLParser.hpp>
#include <G3MiOSSDK/MeshRenderer.hpp>

#include <G3MiOSSDK/EllipsoidalPlanet.hpp>
#include <G3MiOSSDK/BingMapsLayer.hpp>
#include <G3MiOSSDK/LayerSet.hpp>
#include <G3MiOSSDK/G3MWidget.hpp>
#include <G3MiOSSDK/DeviceAttitudeCameraHandler.hpp>
#include <G3MiOSSDK/PlanetRenderer.hpp>

#include <G3MiOSSDK/TerrainTouchListener.hpp>
#include <G3MiOSSDK/ColorLegend.hpp>
#include <G3MiOSSDK/BuildingDataParser.hpp>

#include <G3MiOSSDK/CameraSingleDragHandler.hpp>
#include <G3MiOSSDK/CameraDoubleDragHandler.hpp>
#include <G3MiOSSDK/CameraRotationHandler.hpp>
#include <G3MiOSSDK/CameraDoubleTapHandler.hpp>
#include <G3MiOSSDK/PeriodicalTask.hpp>

#include <G3MiOSSDK/SingleBilElevationDataProvider.hpp>
#include <G3MiOSSDK/OSMLayer.hpp>
#include <G3MiOSSDK/AbstractMesh.hpp>
#include <G3MiOSSDK/CityGMLBuildingTessellator.hpp>
#include <G3MiOSSDK/URL.hpp>

#include <G3MiOSSDK/HUDQuadWidget.hpp>
#include <G3MiOSSDK/HUDRenderer.hpp>
#include <G3MiOSSDK/HUDRelativePosition.hpp>
#include <G3MiOSSDK/HUDRelativeSize.hpp>
#include <G3MiOSSDK/LabelImageBuilder.hpp>
#include <G3MiOSSDK/DownloaderImageBuilder.hpp>
#include <G3MiOSSDK/HUDAbsolutePosition.hpp>
#include <G3MiOSSDK/GTask.hpp>
#include <G3MiOSSDK/G3MWidget.hpp>
#include <G3MiOSSDK/PeriodicalTask.hpp>
#include <G3MiOSSDK/FloatBuffer_iOS.hpp>
#include <G3MiOSSDK/GInitializationTask.hpp>

#include <G3MiOSSDK/CityGMLRenderer.hpp>

#import <QuartzCore/QuartzCore.h>


#include <typeinfo>

class TimeEvolutionTask: public GTask{
  
  AbstractMesh* _abstractMesh;
  
  float _delta;
  int _step;
  
  float* _initialColors;
  ViewController* _vc;
public:
  
  TimeEvolutionTask(AbstractMesh* abstractMesh,
                    ViewController* vc):
  _abstractMesh(abstractMesh),
  _delta(0.0),
  _step(0),
  _vc(vc)
  {
    
    IFloatBuffer* colors = _abstractMesh->getColorsFloatBuffer();
    _initialColors = new float[colors->size()];
    
    for (size_t i = 0; i < colors->size(); i++) {
      _initialColors[i] = colors->get(i);
    }
    
    
  }
  
  void run(const G3MContext* context){
    
    IFloatBuffer* colors = _abstractMesh->getColorsFloatBuffer();
    const IMathUtils* mu = IMathUtils::instance();
    
    double factor = (1.0f + mu->sin(_delta)) / 2.0;
    _delta += 0.1;
    
    FloatBuffer_iOS fb(colors->size());
    float *newColors = fb.getPointer();
    
    for (size_t i = 0; i < colors->size(); i+=4) {
      float r = _initialColors[i];
      float g = _initialColors[i+1];
      float b = _initialColors[i+2];
      float a = _initialColors[i+3];
      
      r *= factor;
      r = mu->clamp(r, 0.0f, 1.0f);
      
      g *= factor;
      g = mu->clamp(g, 0.0f, 1.0f);
      
      b *= 1.0f / factor;
      b = mu->clamp(b, 0.0f, 1.0f);
      
      newColors[i] = r;
      newColors[i+1] = g;
      newColors[i+2] = b;
      newColors[i+3] = a;
    }
    
    colors->put(0, &fb);
    
    
    //Label
    _step++;
    int min = _step % 60;
    int hour = (_step / 60) % 24;
    std::string s = context->getStringUtils()->toString(hour) + ":" + context->getStringUtils()->toString(min);
    
    [[_vc _timeLabel] setText:[NSString stringWithUTF8String:s.c_str()]];
  }
  
};

class ColorChangingMeshTask: public GTask{
  
  AbstractMesh* _abstractMesh;
  int _step;
  std::vector<IFloatBuffer*> _colors;
public:
  
  ColorChangingMeshTask(AbstractMesh* abstractMesh, std::vector<IFloatBuffer*> colors):
  _abstractMesh(abstractMesh),
  _step(0),
  _colors(colors)
  {
    IFloatBuffer* meshColors = _abstractMesh->getColorsFloatBuffer();
    
    for (size_t i = 0; i < _colors.size(); i++) {
      if (colors[i]->size() != meshColors->size()){
        THROW_EXCEPTION("WRONG NUMBER OF COLORS");
      }
    }
  }
  
  void run(const G3MContext* context){
    IFloatBuffer* colors = _abstractMesh->getColorsFloatBuffer();
    IFloatBuffer* newColors = _colors[_step];
    
    colors->put(0, newColors);
    
    _step++; //Advance
  }
  
};


class PointCloudBDL : public IBufferDownloadListener {
private:
  ViewController* _demo;
public:
  PointCloudBDL(ViewController* demo) :
  _demo(demo)
  {
  }
  
  void onDownload(const URL& url,
                  IByteBuffer* buffer,
                  bool expired) {
    
    std::string s = buffer->getAsString();
    delete buffer;
    [_demo createPointCloudWithDescriptor:s];
  }
  
  void onError(const URL& url) {
    ILogger::instance()->logError("Error downloading \"%s\"", url.getPath().c_str());
  }
  
  void onCancel(const URL& url) {
    // do nothing
  }
  
  void onCanceledDownload(const URL& url,
                          IByteBuffer* buffer,
                          bool expired) {
    // do nothing
  }
  
};

class MyEDListener: public IElevationDataListener{
  
  
private:
  ViewController* _demo;
  const IThreadUtils* _threadUtils;
  
public:
  
  MyEDListener(ViewController* demo, const IThreadUtils* threadUtils):_demo(demo), _threadUtils(threadUtils){}
  
  virtual void onData(const Sector& sector,
                      const Vector2I& extent,
                      ElevationData* elevationData){
    
    _demo.cityGMLRenderer->setElevationData(elevationData);
    
    [_demo setElevationData:elevationData];
    
    [_demo requestPointCloud];
    [_demo loadCityModelWithThreadUtils];
  }
  
  virtual void onError(const Sector& sector,
                       const Vector2I& extent){
    
  }
  
  virtual void onCancel(const Sector& sector,
                        const Vector2I& extent){
    
  }
};

class MyCityGMLBuildingTouchedListener : public CityGMLBuildingTouchedListener{
public:
  virtual ~MyCityGMLBuildingTouchedListener(){}
  virtual void onBuildingTouched(CityGMLBuilding* building){
    
  }
  
};


///////////////////

@implementation ViewController

@synthesize G3MWidget;
@synthesize meshRenderer;
@synthesize marksRenderer;
@synthesize cityGMLRenderer;
@synthesize elevationData;
@synthesize _timeLabel;

- (void)didReceiveMemoryWarning
{
  [super didReceiveMemoryWarning];
  // Release any cached data, images, etc that aren't in use.
}

- (void)viewDidLoad
{
  [super viewDidLoad];
  
  elevationData = NULL;
  meshRenderer = NULL;
  marksRenderer = NULL;
  
  _waitingMessageView.layer.cornerRadius = 5;
  _waitingMessageView.layer.masksToBounds = TRUE;
  
  G3MWidget.autoresizingMask = UIViewAutoresizingFlexibleWidth | UIViewAutoresizingFlexibleHeight | UIViewAutoresizingFlexibleBottomMargin |
  UIViewAutoresizingFlexibleLeftMargin | UIViewAutoresizingFlexibleRightMargin |
  UIViewAutoresizingFlexibleTopMargin | UIViewAutoresizingFlexibleBottomMargin;
  
  _pickerArray = @[@"Random Colors", @"Heat Demand", @"Volume", @"QCL", @"SOM Cluster", @"Field 2"];
  
  _cityGMLFiles.push_back("file:///innenstadt_ost_4326_lod2.gml");
  _cityGMLFiles.push_back("file:///innenstadt_west_4326_lod2.gml");
//  _cityGMLFiles.push_back("file:///hagsfeld_4326_lod2.gml");
//  _cityGMLFiles.push_back("file:///durlach_4326_lod2_PART_1.gml");
//  _cityGMLFiles.push_back("file:///durlach_4326_lod2_PART_2.gml");
//  _cityGMLFiles.push_back("file:///hohenwettersbach_4326_lod2.gml");
//  _cityGMLFiles.push_back("file:///bulach_4326_lod2.gml");
//  _cityGMLFiles.push_back("file:///daxlanden_4326_lod2.gml");
  //  _cityGMLFiles.push_back("file:///knielingen_4326_lod2_PART_1.gml");
  //  _cityGMLFiles.push_back("file:///knielingen_4326_lod2_PART_2.gml");
  //  _cityGMLFiles.push_back("file:///knielingen_4326_lod2_PART_3.gml");
  _modelsLoadedCounter = 0;
  
  _pointCloudFiles.push_back("file:///SolarRadiation.geojson");
  _pointCloudsLoaded = 0;
  
  [_progressBar setProgress:0.0f];
  
  _useDem = true;
  [self initEIFERG3m:_useDem];
  
  //HIDING MENU
  [self showMenuButtonPressed:_showMenuButton];
  
  
  [[self G3MWidget] startAnimation];
  [G3MWidget widget]->setCameraPosition(Geodetic3D::fromDegrees(28.0990178, -15.4203257, 19995.736280033790536));
  [G3MWidget widget]->setCameraPitch(Angle::fromDegrees(-53.461659));
  
}


class MyInitTask: public GInitializationTask{
  bool _useDEM;
  ViewController* _vc;
public:
  
  MyInitTask(ViewController* vc, bool useDEM):_useDEM(useDEM), _vc(vc){
    
  }
  
  void run(const G3MContext* context){
    if (_useDEM){
      Sector karlsruheSector = Sector::fromDegrees(48.9397891179, 8.27643508429, 49.0930546874, 8.5431344933);
      SingleBilElevationDataProvider* edp = new SingleBilElevationDataProvider(URL("file:///ka_31467.bil"),
                                                                               karlsruheSector,
                                                                               Vector2I(308, 177));
      [_vc.G3MWidget widget]->getPlanetRenderer()->setElevationDataProvider(edp, true);
      edp->requestElevationData(karlsruheSector, Vector2I(308, 177), new MyEDListener(_vc, context->getThreadUtils()), true);
    } else{
      [_vc requestPointCloud];
      [_vc loadCityModelWithThreadUtils];
    }
  }
  
  bool isDone(const G3MContext* context){
    return true;
  }
  
};

- (void)initEIFERG3m:(BOOL) useDEM
{
  
  G3MBuilder_iOS builder([self G3MWidget]);
  LayerSet* layerSet = new LayerSet();
  layerSet->addLayer(MapQuestLayer::newOSM(TimeInterval::fromDays(30)));
  builder.getPlanetRendererBuilder()->setLayerSet(layerSet);
  
  //  BingMapsLayer* layer = new BingMapsLayer(BingMapType::Aerial(),
  //                                           "AnU5uta7s5ql_HTrRZcPLI4_zotvNefEeSxIClF1Jf7eS-mLig1jluUdCoecV7jc",
  //                                           TimeInterval::fromDays(30));
  
  OSMLayer* layer = new OSMLayer(TimeInterval::fromDays(30));
  
  layerSet->addLayer(layer);
  
  _planet = EllipsoidalPlanet::createEarth();
  builder.setPlanet(_planet);
  
  _hudRenderer = new HUDRenderer();
  
  builder.addRenderer(_hudRenderer);
  
  meshRenderer = new MeshRenderer();
  marksRenderer = new MarksRenderer(false);
  cityGMLRenderer = new CityGMLRenderer(meshRenderer, marksRenderer);
  cityGMLRenderer->setTouchListener(new MyCityGMLBuildingTouchedListener());
  
  builder.addRenderer(cityGMLRenderer);
  
  builder.setInitializationTask(new MyInitTask(self, useDEM));
  
  
  builder.initializeWidget();
}

-(void) createPointCloudWithDescriptor:(const std::string&) pointCloudDescriptor {
  
  Mesh* m = BuildingDataParser::createSolarRadiationMesh(pointCloudDescriptor, _planet, elevationData);
  meshRenderer->addMesh(m);
  _pointClouds.push_back(m);
  
  [self onPointCloudLoaded];
}

-(void) requestPointCloud{
  for (size_t i = 0; i < _pointCloudFiles.size(); i++) {
    [G3MWidget widget]->getG3MContext()
    ->getDownloader()->requestBuffer(URL(_pointCloudFiles[i]), 1000, TimeInterval::forever(), true,
                                     new PointCloudBDL(self),
                                     true);
  }
}

class MyCityGMLRendererListener: public CityGMLRendererListener{
  ViewController* _vc;
public:
  MyCityGMLRendererListener(ViewController* vc):_vc(vc){}
  virtual void onBuildingsLoaded(const std::vector<CityGMLBuilding*>& buildings){
    [_vc onCityModelLoaded];
  }
  
};

-(void) onCityModelLoaded{
  _modelsLoadedCounter++;
  if (_modelsLoadedCounter == _cityGMLFiles.size()){
    cityGMLRenderer->addBuildingDataFromURL(URL("file:///karlsruhe_data.geojson"));
  }
  [self onProgress];
}

-(void) onPointCloudLoaded{
  _pointCloudsLoaded++;
  [self onProgress];
}


-(void) loadCityModelWithThreadUtils{
  
  for (size_t i = 0; i < _cityGMLFiles.size(); i++) {
    cityGMLRenderer->addBuildingsFromURL(URL(_cityGMLFiles[i]),
                                         new MyCityGMLRendererListener(self),
                                         true);
  }
}

-(void) onProgress {
  //N MODELS + 1 POINT CLOUD
  float p = (float)(_modelsLoadedCounter + _pointCloudsLoaded) / ((float)_cityGMLFiles.size() + 1);
  [_progressBar setProgress: p animated:TRUE];
  
  if (p == 1){
    [self onAllDataLoaded];
  }
}

-(void) onAllDataLoaded{
  ILogger::instance()->logInfo("City Model Loaded");
  
  for (size_t i = 0; i < _pointClouds.size(); i++) {
    
    [G3MWidget widget]->addPeriodicalTask(new PeriodicalTask(TimeInterval::fromSeconds(0.1),
                                                             new TimeEvolutionTask((AbstractMesh*)_pointClouds[i], self)));
  }
  
  
  //Whole city!
  [G3MWidget widget]->setAnimatedCameraPosition(TimeInterval::fromSeconds(5),
                                                Geodetic3D::fromDegrees(49.07139214735035182, 8.134019638291379195, 22423.46165080198989),
                                                Angle::fromDegrees(-109.452892),
                                                Angle::fromDegrees(-44.938813)
                                                );
  
  //NO WAITING ANYMORE
  _waitingMessageView.hidden = TRUE;
}

-(IBAction)switchVR:(id)sender{
  
  bool usingVR = [((UISwitch*) sender) isOn];
  
  CameraRenderer* cameraRenderer = [G3MWidget widget]->getCameraRenderer();
  cameraRenderer->clearHandlers();
  
  class AltitudeFixerLM: public ILocationModifier{
    Geodetic3D modify(const Geodetic3D& location){
      return Geodetic3D::fromDegrees(location._latitude._degrees, location._longitude._degrees, 3);
    }
  };
  
  if (usingVR){
    
    bool fixAltitude = !_useDem;
    
    ILocationModifier * lm = NULL;
    if (fixAltitude){
      lm = new AltitudeFixerLM();
    }
    
    DeviceAttitudeCameraHandler* dac = new DeviceAttitudeCameraHandler(true, lm);
    cameraRenderer->addHandler(dac);
    
    [G3MWidget widget]->getNextCamera()->forceZNear(1.0);
    
  } else{
    const bool useInertia = true;
    cameraRenderer->addHandler(new CameraSingleDragHandler(useInertia));
    cameraRenderer->addHandler(new CameraDoubleDragHandler());
    cameraRenderer->addHandler(new CameraRotationHandler());
    cameraRenderer->addHandler(new CameraDoubleTapHandler());
    
    
    [G3MWidget widget]->getNextCamera()->forceZNear(NAND);
  }
}


- (void)viewDidUnload
{
  G3MWidget = nil;
  [super viewDidUnload];
  // Release any retained subviews of the main view.
  // e.g. self.myOutlet = nil;
}

- (void)viewWillAppear:(BOOL)animated
{
  [super viewWillAppear:animated];
}

- (void)viewDidAppear:(BOOL)animated
{
  [super viewDidAppear:animated];
}

- (void)viewWillDisappear:(BOOL)animated
{
  [super viewWillDisappear:animated];
}

- (void)viewDidDisappear:(BOOL)animated
{
  [G3MWidget stopAnimation];
  [super viewDidDisappear:animated];
}

- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation
{
  // Return YES for supported orientations
  if ([[UIDevice currentDevice] userInterfaceIdiom] == UIUserInterfaceIdiomPhone) {
    return (interfaceOrientation != UIInterfaceOrientationPortraitUpsideDown);
  } else {
    return YES;
  }
}

//// MENU


- (IBAction)showMenuButtonPressed:(id)sender {
  
  if (_menuHeightConstraint.constant == 0){
    
    UIImage* image = [UIImage imageNamed:@"down"];
    [_showMenuButton setImage:image forState:UIControlStateNormal];
    
    _menuHeightConstraint.constant = - _menuView.bounds.size.height + _showMenuButton.bounds.size.height;
  } else{
    UIImage* image = [UIImage imageNamed:@"up"];
    [_showMenuButton setImage:image forState:UIControlStateNormal];
    _menuHeightConstraint.constant = 0;
  }
  
  [UIView animateWithDuration:1 animations:^{
    [self.view layoutIfNeeded];
  }];
}



/////PICKER VIEW

// The number of columns of data
- (int)numberOfComponentsInPickerView:(UIPickerView *)pickerView
{
  return 1;
}

// The number of rows of data
- (int)pickerView:(UIPickerView *)pickerView numberOfRowsInComponent:(NSInteger)component
{
  return (int)_pickerArray.count;
}

// The data to return for the row and component (column) that's being passed in
- (NSString*)pickerView:(UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component
{
  return _pickerArray[row];
}

// Catpure the picker view selection
- (void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component
{
  if (row == 0){
    RandomBuildingColorPicker* rcp = new RandomBuildingColorPicker();
    cityGMLRenderer->colorBuildings(rcp);
    delete rcp;
  }
  
  
  if (row == 1){
    
    std::vector<ColorLegend::ColorAndValue*> legend;
    legend.push_back(new ColorLegend::ColorAndValue(Color::blue(), 6336.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::red(), 70000.0));
    ColorLegend* cl = new ColorLegend(legend);
    CityGMLBuildingColorProvider* colorProvider = new BuildingDataColorProvider("Heat_Dem_1", cl);
    cityGMLRenderer->colorBuildings(colorProvider);
    delete colorProvider;
    
  }
  
  if (row == 2){
    
    std::vector<ColorLegend::ColorAndValue*> legend;
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(213,62,79, 255), 2196.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(252,141,89, 255), 6816.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(254,224,139, 255), 17388.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(230,245,152, 255), 33165.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(153,213,148, 255), 62472.0));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(50,136,189, 255), 122553.0));
    ColorLegend* cl = new ColorLegend(legend);
    
    BuildingDataColorProvider* colorProvider = new BuildingDataColorProvider("Bui_Volu_1", cl);
    cityGMLRenderer->colorBuildings(colorProvider);
    delete colorProvider;
  }
  
  if (row == 3){
    
    int nClasses = 18;
    int colors[] = {103,0,31,
      178,24,43,
      214,96,77,
      244,165,130,
      253,219,199,
      247,247,247,
      209,229,240,
      146,197,222,
      67,147,195,
      33,102,172,
      5,48,97,
      171,221,164,
      102,194,165,
      50,136,189,
      94,79,162,
      227,26,28,
      253,191,111,
      255,127,0};
    
    std::vector<ColorLegend::ColorAndValue*> legend;
    for (int i = 0; i < nClasses;i++) {
      legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(colors[i*3],
                                                                         colors[i*3+1],
                                                                         colors[i*3+2],
                                                                         255),
                                                      (double)(i+1)));
    }
    
    ColorLegend* cl = new ColorLegend(legend);
    CityGMLBuildingColorProvider* colorProvider = new BuildingDataColorProvider("QCL_1", cl);
    cityGMLRenderer->colorBuildings(colorProvider);
    delete colorProvider;
    
  }
  
  if (row == 4){
    
    std::vector<ColorLegend::ColorAndValue*> legend;
    
    int nClasses = 15;
    int colors[] = {103,0,31,
      178,24,43,
      214,96,77,
      244,165,130,
      253,219,199,
      247,247,247,
      209,229,240,
      146,197,222,
      67,147,195,
      33,102,172,
      5,48,97,
      166,219,160,
      90,174,97,
      27,120,55,
      0,68,27};
    
    for (int i = 0; i < nClasses;i++) {
      legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(colors[i*3],
                                                                         colors[i*3+1],
                                                                         colors[i*3+2],
                                                                         255),
                                                      (double)(i+1)));
    }
    
    ColorLegend* cl = new ColorLegend(legend);
    CityGMLBuildingColorProvider* colorProvider = new BuildingDataColorProvider("SOMcluster", cl);
    cityGMLRenderer->colorBuildings(colorProvider);
    delete colorProvider;
    
  }
  
  if (row == 5){
    
    std::vector<ColorLegend::ColorAndValue*> legend;
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(213,62,79, 255), -0.05));
    legend.push_back(new ColorLegend::ColorAndValue(Color::fromRGBA255(252,141,89, 255), 0.05));
    
    ColorLegend* cl = new ColorLegend(legend);
    CityGMLBuildingColorProvider* colorProvider = new BuildingDataColorProvider("Field2_12", cl);
    cityGMLRenderer->colorBuildings(colorProvider);
    delete colorProvider;
    
  }
}

@end