package org.glob3.mobile.client;

<<<<<<< HEAD
import java.util.ArrayList;

import org.glob3.mobile.generated.AltitudeMode;
import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.CameraDoubleDragHandler;
import org.glob3.mobile.generated.CameraDoubleTapHandler;
import org.glob3.mobile.generated.CameraRenderer;
import org.glob3.mobile.generated.CameraRotationHandler;
import org.glob3.mobile.generated.CameraSingleDragHandler;
import org.glob3.mobile.generated.Color;
import org.glob3.mobile.generated.CompositeRenderer;
import org.glob3.mobile.generated.DirectMesh;
import org.glob3.mobile.generated.ElevationDataProvider;
import org.glob3.mobile.generated.ErrorRenderer;
import org.glob3.mobile.generated.FixedFocusSceneLighting;
import org.glob3.mobile.generated.FloatBufferBuilderFromColor;
import org.glob3.mobile.generated.FloatBufferBuilderFromGeodetic;
import org.glob3.mobile.generated.G3MContext;
import org.glob3.mobile.generated.G3MEventContext;
import org.glob3.mobile.generated.GEO2DLineRasterStyle;
import org.glob3.mobile.generated.GEO2DLineStringGeometry;
import org.glob3.mobile.generated.GEO2DMultiLineStringGeometry;
import org.glob3.mobile.generated.GEO2DMultiPolygonGeometry;
import org.glob3.mobile.generated.GEO2DPointGeometry;
import org.glob3.mobile.generated.GEO2DPolygonData;
import org.glob3.mobile.generated.GEO2DPolygonGeometry;
import org.glob3.mobile.generated.GEO2DSurfaceRasterStyle;
import org.glob3.mobile.generated.GEOGeometry;
import org.glob3.mobile.generated.GEOMultiLineRasterSymbol;
//import org.glob3.mobile.generated.GEORasterLineSymbol;
//import org.glob3.mobile.generated.GEORasterPolygonSymbol;
import org.glob3.mobile.generated.GEORenderer;
import org.glob3.mobile.generated.GEOSymbol;
import org.glob3.mobile.generated.GEOSymbolizer;
import org.glob3.mobile.generated.GEOTileRasterizer;
import org.glob3.mobile.generated.GInitializationTask;
import org.glob3.mobile.generated.GLPrimitive;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.Geodetic3D;
import org.glob3.mobile.generated.HUDErrorRenderer;
import org.glob3.mobile.generated.IBufferDownloadListener;
import org.glob3.mobile.generated.IByteBuffer;
import org.glob3.mobile.generated.ICameraActivityListener;
import org.glob3.mobile.generated.ICameraConstrainer;
import org.glob3.mobile.generated.IDownloader;
import org.glob3.mobile.generated.IImage;
import org.glob3.mobile.generated.IImageDownloadListener;
import org.glob3.mobile.generated.IImageListener;
import org.glob3.mobile.generated.IImageUtils;
import org.glob3.mobile.generated.IJSONParser;
import org.glob3.mobile.generated.IStorage;
import org.glob3.mobile.generated.IThreadUtils;
import org.glob3.mobile.generated.InitialCameraPositionProvider;
import org.glob3.mobile.generated.JSONArray;
import org.glob3.mobile.generated.JSONBaseObject;
import org.glob3.mobile.generated.GEOPolygonRasterSymbol;
import org.glob3.mobile.generated.GEORasterSymbol;
import org.glob3.mobile.generated.GEORasterSymbolizer;
import org.glob3.mobile.generated.JSONObject;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.MapBoxLayer;
import org.glob3.mobile.generated.MarksRenderer;
import org.glob3.mobile.generated.Planet;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.generated.Shape;
import org.glob3.mobile.generated.BoxShape;
import org.glob3.mobile.generated.ShapesRenderer;
import org.glob3.mobile.generated.SimpleCameraConstrainer;
import org.glob3.mobile.generated.SimpleInitialCameraPositionProvider;
import org.glob3.mobile.generated.SingleBilElevationDataProvider;
import org.glob3.mobile.generated.StrokeCap;
import org.glob3.mobile.generated.StrokeJoin;
import org.glob3.mobile.generated.TiledVectorLayer;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URL;
import org.glob3.mobile.generated.Vector2I;
import org.glob3.mobile.generated.Vector3D;
=======
import org.glob3.mobile.generated.AltitudeMode;
import org.glob3.mobile.generated.Color;
import org.glob3.mobile.generated.ColumnLayoutImageBuilder;
import org.glob3.mobile.generated.DownloaderImageBuilder;
import org.glob3.mobile.generated.G3MContext;
import org.glob3.mobile.generated.GFont;
import org.glob3.mobile.generated.GInitializationTask;
import org.glob3.mobile.generated.Geodetic3D;
import org.glob3.mobile.generated.ICanvas;
import org.glob3.mobile.generated.IImage;
import org.glob3.mobile.generated.IImageDownloadListener;
import org.glob3.mobile.generated.IImageListener;
import org.glob3.mobile.generated.LabelImageBuilder;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.MapQuestLayer;
import org.glob3.mobile.generated.NASAElevationDataProvider;
import org.glob3.mobile.generated.NonOverlappingMark;
import org.glob3.mobile.generated.NonOverlappingMarksRenderer;
import org.glob3.mobile.generated.QuadShape;
import org.glob3.mobile.generated.ShapesRenderer;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URL;
>>>>>>> purgatory
import org.glob3.mobile.specific.Downloader_WebGL;
import org.glob3.mobile.specific.G3MBuilder_WebGL;
import org.glob3.mobile.specific.G3MWidget_WebGL;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

<<<<<<< HEAD
public class G3MWebGLTestingApplication implements EntryPoint {

	private static final String _g3mWidgetHolderId = "g3mWidgetHolder";
	private G3MWidget_WebGL _g3mWidget = null;

	private native void runUserPlugin() /*-{
		$wnd.onLoadG3M();
	}-*/;

	@Override
	public void onModuleLoad() {
		final Panel g3mWidgetHolder = RootPanel.get(_g3mWidgetHolderId);

		_g3mWidget = createWidgetStreamingElevations();
		g3mWidgetHolder.add(_g3mWidget);

		// // Buenos Aires, there we go!
		// _g3mWidget.setAnimatedCameraPosition(Geodetic3D.fromDegrees(-34.615047738942699596,
		// -58.4447233540403559, 35000));

		// Canarias
		_g3mWidget.setAnimatedCameraPosition(Geodetic3D.fromDegrees(
				28.034468668529083146, -15.904092315837871752, 1634079));
	}

	private G3MWidget_WebGL createWidgetStreamingElevations() {
		final G3MBuilder_WebGL builder = new G3MBuilder_WebGL();

		final LayerSet layerSet = new LayerSet();
		layerSet.addLayer(MapQuestLayer.newOSM(TimeInterval.fromDays(30)));
		builder.getPlanetRendererBuilder().setLayerSet(layerSet);
		
		final String proxy = "/proxy.php?url=";
		builder.setDownloader(new Downloader_WebGL( //
		8, // maxConcurrentOperationCount
		10, // delayMillis
		proxy));


		NASAElevationDataProvider edp = new NASAElevationDataProvider();

		builder.getPlanetRendererBuilder().setElevationDataProvider(edp);

		return builder.createWidget();
	}

	private static NonOverlappingMark createMark(final Geodetic3D position) {
		final URL markBitmapURL = new URL("/g3m-marker.png");
		final URL anchorBitmapURL = new URL("/anchorWidget.png");

		return new NonOverlappingMark( //
				new DownloaderImageBuilder(markBitmapURL), //
				new DownloaderImageBuilder(anchorBitmapURL), //
				position);
	}

	private static NonOverlappingMark createMark(final String label,
			final Geodetic3D position) {
		final URL markBitmapURL = new URL("/g3m-marker.png");
		final URL anchorBitmapURL = new URL("/anchorWidget.png");

		final ColumnLayoutImageBuilder imageBuilderWidget = new ColumnLayoutImageBuilder( //
				new DownloaderImageBuilder(markBitmapURL), //
				new LabelImageBuilder(label, GFont.monospaced()) //
		);

		return new NonOverlappingMark( //
				imageBuilderWidget, //
				new DownloaderImageBuilder(anchorBitmapURL), //
				position);
	}

	private static G3MWidget_WebGL createWidget() {
		final G3MBuilder_WebGL builder = new G3MBuilder_WebGL();

		final LayerSet layerSet = new LayerSet();
		layerSet.addLayer(MapQuestLayer.newOSM(TimeInterval.fromDays(30)));

		builder.getPlanetRendererBuilder().setLayerSet(layerSet);

		final String proxy = null; // "http://galileo.glob3mobile.com/" +
									// "proxy.php?url="
		builder.setDownloader(new Downloader_WebGL( //
				8, // maxConcurrentOperationCount
				10, // delayMillis
				proxy));

		final NonOverlappingMarksRenderer renderer = new NonOverlappingMarksRenderer(
				30);
		builder.addRenderer(renderer);

		renderer.addMark(createMark("Label #1",
				Geodetic3D.fromDegrees(28.131817, -15.440219, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(28.947345,
				-13.523105, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(28.473802,
				-13.859360, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(28.467706,
				-16.251426, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(28.701819,
				-17.762003, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(28.086595,
				-17.105796, 0)));
		renderer.addMark(createMark(Geodetic3D.fromDegrees(27.810709,
				-17.917639, 0)));

		final boolean testCanvas = false;
		if (testCanvas) {
			final ShapesRenderer shapesRenderer = new ShapesRenderer();
			builder.addRenderer(shapesRenderer);

			builder.setInitializationTask(new GInitializationTask() {
				@Override
				public void run(final G3MContext context) {

					final IImageDownloadListener listener = new IImageDownloadListener() {
						@Override
						public void onError(final URL url) {
						}

						@Override
						public void onDownload(final URL url,
								final IImage image, final boolean expired) {
							final ICanvas canvas = context.getFactory()
									.createCanvas();
							final int width = 1024;
							final int height = 1024;
							canvas.initialize(width, height);

							canvas.setFillColor(Color
									.fromRGBA(1f, 1f, 0f, 0.5f));
							canvas.fillRectangle(0, 0, width, height);
							canvas.setLineWidth(4);
							canvas.setLineColor(Color.black());
							canvas.strokeRectangle(0, 0, width, height);

							final int steps = 8;
							final float leftStep = (float) width / steps;
							final float topStep = (float) height / steps;

							canvas.setLineWidth(1);
							canvas.setFillColor(Color.fromRGBA(0f, 0f, 0f,
									0.75f));
							for (int i = 1; i < steps; i++) {
								canvas.fillRectangle(0, topStep * i, width, 1);
								canvas.fillRectangle(leftStep * i, 0, 1, height);
							}

							canvas.setFont(GFont.monospaced());
							canvas.setFillColor(Color.black());
							// canvas.fillText("0,0", 0, 0);
							// canvas.fillText("w,h", width, height);
							for (int i = 0; i < steps; i++) {
								canvas.fillText("Hellow World", leftStep * i,
										topStep * i);
							}

							final float width8 = (float) width / 8;
							final float height8 = (float) height / 8;
							canvas.drawImage(image, width8, height8); // ok
							canvas.drawImage(image, width8 * 3, height8, 0.5f); // ok

							final int imageWidth = image.getWidth();
							final int imageHeight = image.getHeight();
							canvas.drawImage(image, width8, height8 * 3,
									imageWidth * 2, imageHeight * 2); // ok
							canvas.drawImage(image, width8 * 3, height8 * 3,
									imageWidth * 2, imageHeight * 2, 0.5f); // ok

							// ok
							canvas.drawImage(
									image, //
									0, 0, imageWidth,
									imageHeight, //
									width8 * 5, height8 * 5, imageWidth * 2,
									imageHeight * 2);
							// ok
							canvas.drawImage(
									image, //
									0, 0, imageWidth,
									imageHeight, //
									width8 * 7, height8 * 7, imageWidth * 2,
									imageHeight * 2, //
									0.5f);

							canvas.createImage(new IImageListener() {
								@Override
								public void imageCreated(
										final IImage canvasImage) {
									final QuadShape quad = new QuadShape(
											//
											Geodetic3D.fromDegrees(
													-34.615047738942699596,
													-58.4447233540403559, 1000), //
											AltitudeMode.ABSOLUTE, //
											canvasImage, //
											canvasImage.getWidth() * 15.0f, //
											canvasImage.getHeight() * 15.0f, //
											true);

									shapesRenderer.addShape(quad);
								}
							}, true);

							canvas.dispose();

							image.dispose();
						}

						@Override
						public void onCanceledDownload(final URL url,
								final IImage image, final boolean expired) {
						}

						@Override
						public void onCancel(final URL url) {
						}
					};

					context.getDownloader().requestImage( //
							new URL("/g3m-marker.png"), //
							1, // priority, //
							TimeInterval.zero(), //
							false, //
							listener, //
							true);
				}

				@Override
				public boolean isDone(final G3MContext context) {
					return true;
				}
			});
		}

		return builder.createWidget();
	}
=======

public class G3MWebGLTestingApplication
implements
EntryPoint {

   private static final String _g3mWidgetHolderId = "g3mWidgetHolder";
   private G3MWidget_WebGL     _g3mWidget         = null;


   private native void runUserPlugin() /*-{
        $wnd.onLoadG3M();
   }-*/;


   @Override
   public void onModuleLoad() {
<<<<<<< HEAD
	   /*
      Scheduler.get().scheduleDeferred(new ScheduledCommand() {

         @Override
         public void execute() {
            runUserPlugin();
         }

      });*/


      if (_widget == null) {

         // initialize a customized widget without using any builder
         // initWithoutBuilder();

         // initialize a default widget by using a builder
         //initDefaultWithBuilder();
    	  
    	  testBranch_zrender_touchhandlers();
    	  
         // initialize a customized widget by using a builder
         //initCustomizedWithBuilder();

         final Panel g3mWidgetHolder = RootPanel.get(_g3mWidgetHolderId);
         g3mWidgetHolder.add(_widget);
      }
   }

=======
>>>>>>> purgatory
      final Panel g3mWidgetHolder = RootPanel.get(_g3mWidgetHolderId);

      _g3mWidget = createWidget();
      g3mWidgetHolder.add(_g3mWidget);

<<<<<<< HEAD
      //      final LayerSet layerSet = new LayerSet();
      //      layerSet.addLayer(MapQuestLayer.newOpenAerial(TimeInterval.fromDays(30)));
      //      builder.getPlanetRendererBuilder().setLayerSet(layerSet);

      /*
      final MeshRenderer meshRenderer = new MeshRenderer();
      meshRenderer.addMesh(createPointsMesh(builder.getPlanet()));
      builder.addRenderer(meshRenderer);*/

      //		if (true) {
      //			final Sector spain = Sector.fromDegrees(27.3174927, -18.5284423, 45.0299024, 5.4084426);
      //			builder.setShownSector(spain);
      //		}

      /*
      final boolean useMarkers = true;
      if (useMarkers) {
         // marks renderer
         final boolean readyWhenMarksReady = false;
         final MarksRenderer marksRenderer = new MarksRenderer(readyWhenMarksReady);

         marksRenderer.setMarkTouchListener(new MarkTouchListener() {
            @Override
            public boolean touchedMark(final Mark mark) {
               Window.alert("Touched on mark: " + mark.getLabel());
               return true;
            }
         }, true);

         final Mark m1 = new Mark("Label", new URL("http://glob3m.glob3mobile.com/icons/markers/g3m.png", false), //
                  new Geodetic3D(Angle.fromDegrees(28.05), Angle.fromDegrees(-14.36), 0), AltitudeMode.RELATIVE_TO_GROUND);
         // m1->addTouchListener(listener);
         marksRenderer.addMark(m1);

         final Mark m2 = new Mark( //
                  "Las Palmas", //
                  new URL("http://glob3m.glob3mobile.com/icons/markers/g3m.png", false), //
                  new Geodetic3D(Angle.fromDegrees(28.05), Angle.fromDegrees(-15.36), 0), //
                  AltitudeMode.RELATIVE_TO_GROUND, 0, //
                  false);
         // m2->addTouchListener(listener);
         marksRenderer.addMark(m2);

         final Mark m3 = new Mark( //
                  "Washington, DC", //
                  new Geodetic3D(Angle.fromDegreesMinutesSeconds(38, 53, 42.24), Angle.fromDegreesMinutesSeconds(-77, 2, 10.92),
                           100), //
                  AltitudeMode.RELATIVE_TO_GROUND, 0);
         marksRenderer.addMark(m3);

         final boolean randomMarkers = false;
         if (randomMarkers) {
            for (int i = 0; i < 500; i++) {
               final Angle latitude = Angle.fromDegrees((Random.nextInt() % 180) - 90);
               final Angle longitude = Angle.fromDegrees((Random.nextInt() % 360) - 180);
               // NSLog(@"lat=%f, lon=%f", latitude.degrees(),
               // longitude.degrees());

               marksRenderer.addMark(new Mark(
               //
                        "Random", //
                        new URL("http://glob3m.glob3mobile.com/icons/markers/g3m.png", false), //
                        new Geodetic3D(latitude, longitude, 0), AltitudeMode.RELATIVE_TO_GROUND));
            }
         }
         builder.addRenderer(marksRenderer);
      }

      // builder.setInitializationTask(createMarkersInitializationTask());

      final String proxy = "";
      final Downloader_WebGL downloader = new Downloader_WebGL(8, 10, proxy);
      builder.setDownloader(downloader);

      // test bson parser and 3D model
      final ShapesRenderer shapeRenderer = new ShapesRenderer();
      builder.addRenderer(shapeRenderer);

      final QuadShape quad = new QuadShape(new Geodetic3D(Angle.fromDegrees(28.116956), Angle.fromDegrees(-15.440453), 2000), //
               AltitudeMode.RELATIVE_TO_GROUND, 10000, 10000, Color.red(), true);

      final QuadShape quad2 = new QuadShape(
               new Geodetic3D(Angle.fromDegrees(28), Angle.fromDegrees(-15.440453), 2000), //
               AltitudeMode.RELATIVE_TO_GROUND, new URL("http://serdis.dis.ulpgc.es/~a044526/android/glob3.png", false), 10000,
               10000, true);

      shapeRenderer.addShape(quad);
      shapeRenderer.addShape(quad2);

      quad.setPitch(Angle.fromDegrees(90));
      quad.setHeading(Angle.fromDegrees(0));
      quad.setAnimatedPosition( //
               TimeInterval.fromSeconds(60), //
               new Geodetic3D(Angle.fromDegrees(28.127222), Angle.fromDegrees(-15.431389), 10000), //
               Angle.fromDegrees(90), //
               Angle.fromDegrees(720), Angle.zero());

      quad2.setPitch(Angle.fromDegrees(90));
      quad2.setHeading(Angle.fromDegrees(0));
      quad2.setAnimatedPosition( //
               TimeInterval.fromSeconds(60), //
               new Geodetic3D(Angle.fromDegrees(28), Angle.fromDegrees(-15.431389), 10000), //
               Angle.fromDegrees(90), //
               Angle.fromDegrees(720), //
               Angle.zero());*/

 /*     final GEOSymbolizer defaultSymbolizer = new GEOSymbolizer() {
         @Override
         public ArrayList<GEOSymbol> createSymbols(final GEO2DPointGeometry geometry) {
            return new ArrayList<GEOSymbol>(0);
         }


         private GEO2DLineRasterStyle createLineRasterStyle(final GEOGeometry geometry) {
            final JSONObject properties = geometry.getFeature().getProperties();

            final String type = properties.getAsString("type", "");

            final float dashLengths[] = { 1, 12 };
            final int dashCount = 2;

            final Color color = type.equalsIgnoreCase("Water Indicator") //
                                                                        ? Color.fromRGBA(1, 1, 1, 0.9f) //
                                                                        : Color.fromRGBA(1, 1, 0, 0.9f);

            return new GEO2DLineRasterStyle( //
                     color, //
                     8, //
                     StrokeCap.CAP_ROUND, //
                     StrokeJoin.JOIN_ROUND, //
                     1, dashLengths, //
                     dashCount, //
                     0);
         }


         @Override
         public ArrayList<GEOSymbol> createSymbols(final GEO2DLineStringGeometry geometry) {
            final ArrayList<GEOSymbol> symbols = new ArrayList<GEOSymbol>();
            symbols.add(new GEORasterLineSymbol(geometry.getCoordinates(), createLineRasterStyle(geometry)));
            return symbols;
         }


         @Override
         public ArrayList<GEOSymbol> createSymbols(final GEO2DMultiLineStringGeometry geometry) {
            final ArrayList<GEOSymbol> symbols = new ArrayList<GEOSymbol>();
            symbols.add(new GEOMultiLineRasterSymbol(geometry.getCoordinatesArray(), createLineRasterStyle(geometry)));
            return symbols;
         }


         private GEO2DLineRasterStyle createPolygonLineRasterStyle(final GEOGeometry geometry) {
            final JSONObject properties = geometry.getFeature().getProperties();

            final int colorIndex = (int) properties.getAsNumber("mapcolor7", 0);

            final Color color = Color.fromRGBA(0.7f, 0, 0, 0.5f).wheelStep(7, colorIndex).muchLighter().muchLighter();

            final float dashLengths[] = {};
            final int dashCount = 0;

            return new GEO2DLineRasterStyle(color, 2, StrokeCap.CAP_ROUND, StrokeJoin.JOIN_ROUND, 1, dashLengths, dashCount, 0);
         }


         private GEO2DSurfaceRasterStyle createPolygonSurfaceRasterStyle(final GEOGeometry geometry) {
            final JSONObject properties = geometry.getFeature().getProperties();

            final int colorIndex = (int) properties.getAsNumber("mapcolor7", 0);

            final Color color = Color.fromRGBA(0.7f, 0, 0, 0.5f).wheelStep(7, colorIndex);

            return new GEO2DSurfaceRasterStyle(color);
         }


         @Override
         public ArrayList<GEOSymbol> createSymbols(final GEO2DPolygonGeometry geometry) {
            final ArrayList<GEOSymbol> symbols = new ArrayList<GEOSymbol>(0);

            symbols.add(new GEORasterPolygonSymbol(geometry.getPolygonData(), createPolygonLineRasterStyle(geometry),
                     createPolygonSurfaceRasterStyle(geometry)));

            return symbols;
         }


         @Override
         public ArrayList<GEOSymbol> createSymbols(final GEO2DMultiPolygonGeometry geometry) {
            final ArrayList<GEOSymbol> symbols = new ArrayList<GEOSymbol>(0);

            final GEO2DLineRasterStyle lineStyle = createPolygonLineRasterStyle(geometry);
            final GEO2DSurfaceRasterStyle surfaceStyle = createPolygonSurfaceRasterStyle(geometry);

            final ArrayList<GEO2DPolygonData> polygonsData = geometry.getPolygonsData();
            final int polygonsDataSize = polygonsData.size();

            for (int i = 0; i < polygonsDataSize; i++) {
               final GEO2DPolygonData polygonData = polygonsData.get(i);
               symbols.add(new GEORasterPolygonSymbol(polygonData, lineStyle, surfaceStyle));

            }

            return symbols;
         }
      };
      
      
      final GEOTileRasterizer geoTileRasterizer = new GEOTileRasterizer();

      final ShapesRenderer shapesRenderer = null;
      final MarksRenderer marksRenderer = null;
      final GEORenderer geoRenderer = new GEORenderer( //
               defaultSymbolizer, //
               meshRenderer, //
               shapesRenderer, //
               marksRenderer, //
               geoTileRasterizer);

      builder.addRenderer(geoRenderer);

      builder.getPlanetRendererBuilder().addTileRasterizer(geoTileRasterizer);
      */


      //      final GInitializationTask initializationTask = new GInitializationTask() {
      //
      //         private boolean done = false;
      //
      //
      //         @Override
      //         public void run(final G3MContext context) {
      //            // meshRenderer.addMesh(createPointsMesh(context.getPlanet()));
      //
      //            context.getDownloader().requestBuffer( //
      //                     new URL("http://glob3m.glob3mobile.com/test/aircraft-A320/A320.bson", false), //
      //                     0, //
      //                     TimeInterval.forever(), //
      //                     true, //
      //                     new IBufferDownloadListener() {
      //
      //                        @Override
      //                        public void onError(final URL url) {
      //                           ILogger.instance().logError("error downloading A320.bson");
      //                           done = true;
      //                        }
      //
      //
      //                        @Override
      //                        public void onDownload(final URL url,
      //                                               final IByteBuffer buffer,
      //                                               final boolean expired) {
      //                           final Shape aircraft = SceneJSShapesParser.parseFromBSON( //
      //                                    buffer, //
      //                                    "http://glob3m.glob3mobile.com/test/aircraft-A320/textures-A320/", //
      //                                    false, //
      //                                    new Geodetic3D( //
      //                                             Angle.fromDegreesMinutesSeconds(38, 53, 42.24), //
      //                                             Angle.fromDegreesMinutesSeconds(-77, 2, 10.92), //
      //                                             10000), // Washington, DC
      //                                    AltitudeMode.ABSOLUTE);
      //
      //                           if (aircraft != null) {
      //                              final double scale = 200;
      //                              aircraft.setScale(scale, scale, scale);
      //                              aircraft.setPitch(Angle.fromDegrees(90));
      //                              shapeRenderer.addShape(aircraft);
      //                           }
      //                           done = true;
      //                        }
      //
      //
      //                        @Override
      //                        public void onCanceledDownload(final URL url,
      //                                                       final IByteBuffer data,
      //                                                       final boolean expired) {
      //                           done = true;
      //                        }
      //
      //
      //                        @Override
      //                        public void onCancel(final URL url) {
      //                           done = true;
      //                        }
      //                     }, false);
      //
      //            final IBufferDownloadListener listener = new IBufferDownloadListener() {
      //
      //               @Override
      //               public void onDownload(final URL url,
      //                                      final IByteBuffer buffer,
      //                                      final boolean expired) {
      //                  final GEOObject geoObject = GEOJSONParser.parseJSON(buffer);
      //                  if (geoObject != null) {
      //                     geoRenderer.addGEOObject(geoObject);
      //                  }
      //               }
      //
      //
      //               @Override
      //               public void onError(final URL url) {
      //                  ILogger.instance().logError("Error downloading: " + url.description());
      //               }
      //
      //
      //               @Override
      //               public void onCancel(final URL url) {
      //                  ILogger.instance().logError("Canceled download: " + url.description());
      //               }
      //
      //
      //               @Override
      //               public void onCanceledDownload(final URL url,
      //                                              final IByteBuffer buffer,
      //                                              final boolean expired) {
      //                  // do nothing
      //               }
      //            };
      //
      //            // final URL geoJSONURL = new
      //            // URL("http://127.0.0.1:8888/countries-50m.geojson", false);
      //            final URL geoJSONURL = new URL("/countries-50m.geojson", false);
      //            // final URL geoJSONURL = new
      //            // URL("file:///boundary_lines_land.geojson", false);
      //            context.getDownloader().requestBuffer( //
      //                     geoJSONURL, //
      //                     DownloadPriority.HIGHER, //
      //                     TimeInterval.fromDays(30), //
      //                     true, //
      //                     listener, //
      //                     true);
      //
      //            if (true) {
      //               final URL planeFilePath = new URL("http://serdis.dis.ulpgc.es/~a044526/seymour-plane.json", false);
      //               final IBufferDownloadListener listenerPlane = new IBufferDownloadListener() {
      //
      //                  @Override
      //                  public void onDownload(final URL url,
      //                                         final IByteBuffer buffer,
      //                                         final boolean expired) {
      //
      //                     final Shape plane = SceneJSShapesParser.parseFromJSON( //
      //                              buffer, //
      //                              "http://serdis.dis.ulpgc.es/~a044526/", //
      //                              false, //
      //                              new Geodetic3D(Angle.fromDegrees(28.127222), Angle.fromDegrees(-15.431389), 10000), //
      //                              AltitudeMode.ABSOLUTE);
      //
      //                     final double scale = 1000;
      //                     plane.setScale(scale, scale, scale);
      //                     plane.setPitch(Angle.fromDegrees(90));
      //                     plane.setHeading(Angle.fromDegrees(0));
      //                     plane.setAnimatedPosition( //
      //                              TimeInterval.fromSeconds(60), //
      //                              new Geodetic3D(Angle.fromDegrees(28.127222), Angle.fromDegrees(-15.431389), 10000), //
      //                              Angle.fromDegrees(90), //
      //                              Angle.fromDegrees(720), //
      //                              Angle.zero());
      //
      //                     _shapesRenderer.addShape(plane);
      //                     ILogger.instance().logInfo("PLANE SHOWN");
      //                  }
      //
      //
      //                  @Override
      //                  public void onError(final URL url) {
      //                     ILogger.instance().logError("NO SEYMOUR");
      //                  }
      //
      //
      //                  @Override
      //                  public void onCancel(final URL url) {
      //                     // DO Nothing
      //                  }
      //
      //
      //                  @Override
      //                  public void onCanceledDownload(final URL url,
      //                                                 final IByteBuffer data,
      //                                                 final boolean expired) {
      //                     // Do Nothing
      //                  }
      //               };
      //
      //               downloader.requestBuffer(planeFilePath, 1000, TimeInterval.fromHours(1.0), true, listenerPlane, true);
      //            }
      //         }
      //
      //
      //         @Override
      //         public boolean isDone(final G3MContext context) {
      //            return done;
      //         }
      //      };
      //      builder.setInitializationTask(initializationTask);

      /*
      builder.getPlanetRendererBuilder().setLayerSet(createLayerSet());
=======
>>>>>>> purgatory

      // // Buenos Aires, there we go!
      // _g3mWidget.setAnimatedCameraPosition(Geodetic3D.fromDegrees(-34.615047738942699596, -58.4447233540403559, 35000));

<<<<<<< HEAD
      _widget = builder.createWidget();
      g3mWidgetHolder.add(_widget);*/

/*
   private LayerSet createLayerSet() {
      final LayerSet layerSet = new LayerSet();
      //      layerSet.addLayer(MapQuestLayer.newOSM(TimeInterval.fromDays(30)));

      layerSet.addLayer(new MapBoxLayer("examples.map-9ijuk24y", TimeInterval.fromDays(30)));


      final String urlTemplate = "http://192.168.1.2/ne_10m_admin_0_countries-Levels10/{level}/{y}/{x}.geojson";
      final int firstLevel = 2;
      final int maxLevel = 10;

      final GEORasterSymbolizer symbolizer = new SampleRasterSymbolizer();

      final TiledVectorLayer tiledVectorLayer = TiledVectorLayer.newMercator( //
               symbolizer, //
               urlTemplate, //
               Sector.fullSphere(), // sector
               firstLevel, //
               maxLevel, //
               TimeInterval.fromDays(30), // timeToCache
               true, // readExpired
               1, // transparency
               null // condition
      );
      layerSet.addLayer(tiledVectorLayer);


      return layerSet;
   }*/

   /*
   private static class SampleRasterSymbolizer
            extends
               GEORasterSymbolizer {

   public void initWithoutBuilder() {

      final Panel g3mWidgetHolder = RootPanel.get(_g3mWidgetHolderId);

      g3mWidgetHolder.setWidth("640px");
      g3mWidgetHolder.setHeight("480px");

      _widget = new G3MWidget_WebGL();

      if (_widget.isSupported()) {

         final IStorage storage = null;

         final int delayMillis = 10;
         final String proxy = "";
         final IDownloader downloader = new Downloader_WebGL(8, delayMillis, proxy);

         final IThreadUtils threadUtils = new ThreadUtils_WebGL(delayMillis);

         final Planet planet = Planet.createEarth();

         final ArrayList<ICameraConstrainer> cameraConstraints = new ArrayList<ICameraConstrainer>();
         cameraConstraints.add(new SimpleCameraConstrainer());

         final CameraRenderer cameraRenderer = new CameraRenderer();
         final boolean useInertia = true;
         cameraRenderer.addHandler(new CameraSingleDragHandler(useInertia));
         final boolean allowRotationInDoubleDrag = false;
         cameraRenderer.addHandler(new CameraDoubleDragHandler(allowRotationInDoubleDrag));
         cameraRenderer.addHandler(new CameraRotationHandler());
         cameraRenderer.addHandler(new CameraDoubleTapHandler());

         final CompositeRenderer mainRenderer = new CompositeRenderer();

         final LayerSet layerSet = new LayerSet();

         final boolean testingTransparencies = true;
         if (testingTransparencies) {
            final WMSLayer blueMarble = new WMSLayer("bmng200405", new URL("http://www.nasa.network.com/wms?", false),
                     WMSServerVersion.WMS_1_1_0, Sector.fullSphere(), "image/jpeg", "EPSG:4326", "", false,
                     new LevelTileCondition(0, 6), TimeInterval.fromDays(30), true, new LayerTilesRenderParameters(
                              Sector.fullSphere(), 2, 4, 0, 6, LayerTilesRenderParameters.defaultTileTextureResolution(),
                              LayerTilesRenderParameters.defaultTileMeshResolution(), false));
            layerSet.addLayer(blueMarble);

            final WMSLayer i3Landsat = new WMSLayer("esat", new URL("http://data.worldwind.arc.nasa.gov/wms?", false),
                     WMSServerVersion.WMS_1_1_0, Sector.fullSphere(), "image/jpeg", "EPSG:4326", "", false,
                     new LevelTileCondition(7, 100), TimeInterval.fromDays(30), true, new LayerTilesRenderParameters(
                              Sector.fullSphere(), 2, 4, 0, 12, LayerTilesRenderParameters.defaultTileTextureResolution(),
                              LayerTilesRenderParameters.defaultTileMeshResolution(), false));
            layerSet.addLayer(i3Landsat);

            final WMSLayer pnoa = new WMSLayer("PNOA", new URL("http://www.idee.es/wms/PNOA/PNOA", false),
                     WMSServerVersion.WMS_1_1_0, Sector.fromDegrees(21, -18, 45, 6), "image/png", "EPSG:4326", "", true, null,
                     TimeInterval.fromDays(30), true, null, (float) 0.5);
            layerSet.addLayer(pnoa);
         }

         final boolean blueMarble = false;
         if (blueMarble) {
            final WMSLayer blueMarbleL = new WMSLayer( //
                     "bmng200405", //
                     new URL("http://www.nasa.network.com/wms?", false), //
                     WMSServerVersion.WMS_1_1_0, //
                     Sector.fullSphere(), //
                     "image/jpeg", //
                     "EPSG:4326", //
                     "", //
                     false, //
                     // new LevelTileCondition(0, 6),
                     null, //
                     TimeInterval.fromDays(30), //
                     true);
            layerSet.addLayer(blueMarbleL);
         }

         final boolean useOrtoAyto = false;
         if (useOrtoAyto) {

            final LayerTilesRenderParameters ltrp = new LayerTilesRenderParameters(Sector.fullSphere(), 2, 4, 0, 19,
                     new Vector2I(256, 256), LayerTilesRenderParameters.defaultTileMeshResolution(), false);

            final WMSLayer ortoAyto = new WMSLayer(
            //
                     "orto_refundida", //
                     new URL("http://195.57.27.86/wms_etiquetas_con_orto.mapdef?", false), //
                     WMSServerVersion.WMS_1_1_0, //
                     new Sector(new Geodetic2D(Angle.fromDegrees(39.350228), Angle.fromDegrees(-6.508713)), new Geodetic2D(
                              Angle.fromDegrees(39.536351), Angle.fromDegrees(-6.25946))), //
                     "image/jpeg", //
                     "EPSG:4326", //
                     "", //
                     false, //
                     new LevelTileCondition(4, 19), //
                     TimeInterval.fromDays(30), //
                     true, //
                     ltrp);
            layerSet.addLayer(ortoAyto);
         }

         final boolean useBing = false;
         if (useBing) {
            final WMSLayer bing = new WMSLayer( //
                     "ve", //
                     new URL("http://worldwind27.arc.nasa.gov/wms/virtualearth?", false), //
                     WMSServerVersion.WMS_1_1_0, //
                     Sector.fullSphere(), //
                     "image/png", //
                     "EPSG:4326", //
                     "", //
                     false, //
                     null, //
                     TimeInterval.fromDays(30), //
                     true);
            layerSet.addLayer(bing);
         }
         final boolean useOSMLatLon = false;
         if (useOSMLatLon) {
            // final WMSLayer osm = new WMSLayer( //
            // "osm", //
            // new URL("http://wms.latlon.org/", false), //
            // WMSServerVersion.WMS_1_1_0, //
            // Sector.fromDegrees(-85.05, -180.0, 85.5, 180.0), //
            // "image/jpeg", //
            // "EPSG:4326", //
            // "", //
            // false, //
            // null);
            // layerSet.addLayer(osm);

            final WMSLayer osm = new WMSLayer( //
                     "osm_auto:all", //
                     new URL("http://129.206.228.72/cached/osm", false), //
                     WMSServerVersion.WMS_1_1_0, //
                     // Sector.fromDegrees(-85.05, -180.0, 85.05, 180.0), //
                     Sector.fullSphere(), //
                     "image/jpeg", //
                     "EPSG:4326", //
                     "", //
                     false, //
                     // new LevelTileCondition(3, 100));
                     null, //
                     TimeInterval.fromDays(30), //
                     true);
            layerSet.addLayer(osm);
         }

         final boolean usePnoa = false;
         if (usePnoa) {
            final WMSLayer pnoa = new WMSLayer( //
                     "PNOA", //
                     new URL("http://www.idee.es/wms/PNOA/PNOA", false), //
                     WMSServerVersion.WMS_1_1_0, Sector.fromDegrees(21, -18, 45, 6), //
                     "image/png", //
                     "EPSG:4326", //
                     "", //
                     true, //
                     null, //
                     TimeInterval.fromDays(30), //
                     true);
            layerSet.addLayer(pnoa);
         }

         final boolean testURLescape = false;
         if (testURLescape) {
            final WMSLayer ayto = new WMSLayer(URL.escape("Ejes de via"), //
                     new URL("http://sig.caceres.es/wms_callejero.mapdef?", false), //
                     WMSServerVersion.WMS_1_1_0,//
                     Sector.fullSphere(), //
                     "image/png", //
                     "EPSG:4326", //
                     "", //
                     true, //
                     null, //
                     TimeInterval.fromDays(30), //
                     true);
            layerSet.addLayer(ayto);
         }

         final PlanetRendererBuilder tlBuilder = new PlanetRendererBuilder();
         tlBuilder.setLayerSet(layerSet);
         tlBuilder.setRenderDebug(true);
         final PlanetRenderer planetRenderer = tlBuilder.create();
         mainRenderer.addRenderer(planetRenderer);

         final boolean useQuadShapes = true;
         if (useQuadShapes) {
            final ShapesRenderer shapesRenderer = new ShapesRenderer();

            // final String textureFileName = "g3m-marker.png";
            // final IImage textureImage =
            // IFactory.instance().createImageFromFileName(textureFileName);
            //
            // final QuadShape quad = new QuadShape( //
            // new Geodetic3D(Angle.fromDegrees(37.78333333), //
            // Angle.fromDegrees(-122.41666666666667), //
            // 10000), //
            // textureImage, //
            // true, //
            // textureFileName, //
            // 500000, //
            // 500000);
            // quad.setHeading(Angle.fromDegrees(0));
            // quad.setPitch(Angle.fromDegrees(0));
            // shapesRenderer.addShape(quad);

            final Geodetic3D circlePosition = new Geodetic3D( //
                     Angle.fromDegrees(37.78333333), //
                     Angle.fromDegrees(-122.41666666666667), //
                     8000);

            // circle.setHeading(Angle.fromDegrees(45));
            // circle.setPitch(Angle.fromDegrees(45));
            // circle.setScale(2.0, 0.5, 1);
            // circle.setRadius(circleRadius);

            final Color circleColor = Color.newFromRGBA(1, 1, 0, 0.5f);
            final Shape circle = new CircleShape(circlePosition, AltitudeMode.RELATIVE_TO_GROUND, 50000, circleColor);
            shapesRenderer.addShape(circle);

            final Geodetic3D boxPosition = new Geodetic3D(Angle.fromDegrees(37.78333333), //
                     Angle.fromDegrees(-122.41666666666667), //
                     45000);
            final Vector3D size = new Vector3D(20000, 30000, 50000);
            final Color boxColor = Color.newFromRGBA(0, 1, 0, 0.5f);
            final Color edgeColor = Color.newFromRGBA(0.75f, 0, 0, 0.75f);
            final Shape box = new BoxShape(boxPosition, AltitudeMode.RELATIVE_TO_GROUND, size, 2, boxColor, edgeColor);
            shapesRenderer.addShape(box);

      private static final Color FROM_COLOR = Color.fromRGBA(0.7f, 0, 0, 0.5f);
=======
      // Canarias
      _g3mWidget.setAnimatedCameraPosition(Geodetic3D.fromDegrees(28.034468668529083146, -15.904092315837871752, 1634079));
   }


   private static NonOverlappingMark createMark(final Geodetic3D position) {
      final URL markBitmapURL = new URL("/g3m-marker.png");
      final URL anchorBitmapURL = new URL("/anchorWidget.png");

      return new NonOverlappingMark( //
               new DownloaderImageBuilder(markBitmapURL), //
               new DownloaderImageBuilder(anchorBitmapURL), //
               position);
   }

>>>>>>> purgatory

   private static NonOverlappingMark createMark(final String label,
                                                final Geodetic3D position) {
      final URL markBitmapURL = new URL("/g3m-marker.png");
      final URL anchorBitmapURL = new URL("/anchorWidget.png");

<<<<<<< HEAD


            final boolean testingImagesCombine = false;
            if (testingImagesCombine) {
               class DL
                        extends
                           IImageDownloadListener {

                  @Override
                  public void onDownload(final URL url,
                                         final IImage image,
                                         final boolean expired) {

                     final int w = image.getWidth();
                     final int h = image.getHeight();

                     final java.util.ArrayList<IImage> images = new ArrayList<IImage>();
                     images.add(image);
                     images.add(image);

                     final java.util.ArrayList<RectangleF> srcRs = new ArrayList<RectangleF>();
                     srcRs.add(new RectangleF(0, 0, image.getWidth(), image.getHeight()));
                     srcRs.add(new RectangleF(10, 0, image.getWidth() - 10, image.getHeight()));

                     final java.util.ArrayList<RectangleF> destRs = new ArrayList<RectangleF>();
                     destRs.add(new RectangleF(0, 0, 256, 256));
                     destRs.add(new RectangleF(50, 20, 256, 70));

                     final java.util.ArrayList<Float> transparencies = new ArrayList<Float>();
                     transparencies.add((float) 1.0);
                     transparencies.add((float) 0.5);

                     class QuadListener
                              extends
                                 IImageListener {
                        ShapesRenderer _sr;


                        public QuadListener(final ShapesRenderer sr) {
                           _sr = sr;
                        }


                        @Override
                        public void imageCreated(final IImage image2) {
                           final Shape quadImages = new QuadShape(new Geodetic3D(Angle.fromDegrees(28.410728),
                                    Angle.fromDegrees(-16.339417), 8000), AltitudeMode.RELATIVE_TO_GROUND, image2, 50000, 50000,
                                    true);

                           _sr.addShape(quadImages);
                        }
                     }

                     IImageUtils.combine(new Vector2I(256, 256), images, srcRs, destRs, transparencies, new QuadListener(
                              shapesRenderer), true);

                  }


                  @Override
                  public void onError(final URL url) {
                  }


                  @Override
                  public void onCancel(final URL url) {
                  }


                  @Override
                  public void onCanceledDownload(final URL url,
                                                 final IImage image,
                                                 final boolean expired) {
                  }

               }

               downloader.requestImage( //
                        new URL(
                                 "http://www.nasa.network.com/wms?REQUEST=GetMap&SERVICE=WMS&VERSION=1.1.1&WIDTH=256&HEIGHT=256&BBOX=-45.0,-90.0,0.0,-45.0&LAYERS=bmng200405&FORMAT=image/jpeg&SRS=EPSG:4326&STYLES=&TRANSPARENT=FALSE",
                                 false), //
                        100000, //
                        TimeInterval.fromDays(1), //
                        true, //
                        new DL(), //
                        true);

            }

         }

         final BusyMeshRenderer busyRenderer = new BusyMeshRenderer(Color.newFromRGBA(0, 0, 0, 1));

         final Color backgroundColor = Color.fromRGBA(0, (float) 0.1, (float) 0.2, 1);

         final boolean logFPS = false;

         final boolean logDownloaderStatistics = false;

         final GInitializationTask initializationTask = null;

         final boolean autoDeleteInitializationTask = true;

         final ArrayList<PeriodicalTask> periodicalTasks = new ArrayList<PeriodicalTask>();

         final WidgetUserData userData = null;

         final SceneLighting lighting = new FixedFocusSceneLighting();

         final ICameraActivityListener cameraActivityListener = null;

         final InitialCameraPositionProvider initialCameraPositionProvider = new SimpleInitialCameraPositionProvider();


         //            public static final G3MWidget create(final GL gl,
         //                                                 final IStorage storage,
         //                                                 final IDownloader downloader,
         //                                                 final IThreadUtils threadUtils,
         //                                                 final ICameraActivityListener cameraActivityListener,
         //                                                 final Planet planet,
         //                                                 final java.util.ArrayList<ICameraConstrainer> cameraConstrainers,
         //                                                 final CameraRenderer cameraRenderer,
         //                                                 final Renderer mainRenderer,
         //                                                 final Renderer busyRenderer,
         //                                                 final ErrorRenderer errorRenderer,
         //                                                 final Color backgroundColor,
         //                                                 final boolean logFPS,
         //                                                 final boolean logDownloaderStatistics,
         //                                                 final GInitializationTask initializationTask,
         //                                                 final boolean autoDeleteInitializationTask,
         //                                                 final java.util.ArrayList<PeriodicalTask> periodicalTasks,
         //                                                 final GPUProgramManager gpuProgramManager,
         //                                                 final SceneLighting sceneLighting,
         //                                                 final InitialCameraPositionProvider initialCameraPositionProvider);


         final ErrorRenderer errorRenderer = new HUDErrorRenderer();
         final Renderer hudRenderer = null;
         _widget.initWidget(//
                  storage, //
                  downloader, //
                  threadUtils, //
                  cameraActivityListener, //
                  planet, //
                  cameraConstraints, //
                  cameraRenderer, //
                  mainRenderer, //
                  busyRenderer, //
                  errorRenderer, //
                  hudRenderer, //
                  backgroundColor, //
                  logFPS, //
                  logDownloaderStatistics, //
                  initializationTask, //
                  autoDeleteInitializationTask, //
                  periodicalTasks, //
                  userData, //
                  lighting, //
                  initialCameraPositionProvider, null);

      private static GEO2DLineRasterStyle createPolygonLineRasterStyle(final GEOGeometry geometry) {
         final JSONObject properties = geometry.getFeature().getProperties();
         final int colorIndex = (int) properties.getAsNumber("mapcolor7", 0);
         final Color color = FROM_COLOR.wheelStep(7, colorIndex).muchLighter().muchLighter();
         final float dashLengths[] = {};
         final int dashCount = 0;
         return new GEO2DLineRasterStyle(color, 2, StrokeCap.CAP_ROUND, StrokeJoin.JOIN_ROUND, 1, dashLengths, dashCount, 0);

      }


      private static GEO2DSurfaceRasterStyle createPolygonSurfaceRasterStyle(final GEOGeometry geometry) {
         final JSONObject properties = geometry.getFeature().getProperties();
         final int colorIndex = (int) properties.getAsNumber("mapcolor7", 0);
         final Color color = FROM_COLOR.wheelStep(7, colorIndex);
         return new GEO2DSurfaceRasterStyle(color);
      }



      //final LayerSet layerSet = new LayerSet();

      /*
       * final boolean blueMarble = false; if (blueMarble) { final WMSLayer
       * blueMarbleL = new WMSLayer( // "bmng200405", // new
       * URL("http://www.nasa.network.com/wms?", false), //
       * WMSServerVersion.WMS_1_1_0, // Sector.fullSphere(), // "image/jpeg",
       * // "EPSG:4326", // "", // false, // //new LevelTileCondition(0, 6),
       * null, // TimeInterval.fromDays(30), // true);
       * layerSet.addLayer(blueMarbleL);
       * blueMarbleL.addTerrainTouchEventListener(new
       * TerrainTouchEventListener() {
       * 
       * @Override public boolean onTerrainTouch(G3MEventContext context,
       * TerrainTouchEvent ev) { Window.alert("touching terrain blueMarble");
       * return false; }
       * 
       * @Override public void dispose() {} }); }
       */

  /*    final boolean useOrtoAyto = false;
      if (useOrtoAyto) {

         final LayerTilesRenderParameters ltrp = new LayerTilesRenderParameters(Sector.fullSphere(), 2, 4, 0, 19, new Vector2I(
                  256, 256), LayerTilesRenderParameters.defaultTileMeshResolution(), false);

         final WMSLayer ortoAyto = new WMSLayer( //
                  "orto_refundida", //
                  new URL("http://195.57.27.86/wms_etiquetas_con_orto.mapdef?", false), //
                  WMSServerVersion.WMS_1_1_0, //
                  new Sector( //
                           new Geodetic2D(Angle.fromDegrees(39.350228), Angle.fromDegrees(-6.508713)), //
                           new Geodetic2D(Angle.fromDegrees(39.536351), Angle.fromDegrees(-6.25946))), //
                  "image/jpeg", //
                  "EPSG:4326", //
                  "", //
                  false, //
                  new LevelTileCondition(4, 19), //
                  TimeInterval.fromDays(30), //
                  true, //
                  ltrp);
         layerSet.addLayer(ortoAyto);

      @Override
      public GEORasterSymbolizer copy() {
         return new SampleRasterSymbolizer();
      }
=======
      final ColumnLayoutImageBuilder imageBuilderWidget = new ColumnLayoutImageBuilder( //
               new DownloaderImageBuilder(markBitmapURL), //
               new LabelImageBuilder(label, GFont.monospaced()) //
               );
>>>>>>> purgatory

      return new NonOverlappingMark( //
               imageBuilderWidget, //
               new DownloaderImageBuilder(anchorBitmapURL), //
               position);
   }


   private static G3MWidget_WebGL createWidget() {
      final G3MBuilder_WebGL builder = new G3MBuilder_WebGL();

      final LayerSet layerSet = new LayerSet();
      layerSet.addLayer(MapQuestLayer.newOSM(TimeInterval.fromDays(30)));

      builder.getPlanetRendererBuilder().setLayerSet(layerSet);

<<<<<<< HEAD

      final boolean testingTransparencies = false;
      if (testingTransparencies) {
         final WMSLayer blueMarble = new WMSLayer("bmng200405", new URL("http://www.nasa.network.com/wms?", false),
                  WMSServerVersion.WMS_1_1_0, Sector.fullSphere(), "image/jpeg", "EPSG:4326", "", false, new LevelTileCondition(
                           0, 6), TimeInterval.fromDays(30), true, new LayerTilesRenderParameters(Sector.fullSphere(), 2, 4, 0,
                           6, LayerTilesRenderParameters.defaultTileTextureResolution(),
                           LayerTilesRenderParameters.defaultTileMeshResolution(), false));
         layerSet.addLayer(blueMarble);

         final WMSLayer i3Landsat = new WMSLayer("esat", new URL("http://data.worldwind.arc.nasa.gov/wms?", false),
                  WMSServerVersion.WMS_1_1_0, Sector.fullSphere(), "image/jpeg", "EPSG:4326", "", false, new LevelTileCondition(
                           7, 100), TimeInterval.fromDays(30), true, new LayerTilesRenderParameters(Sector.fullSphere(), 2, 4, 0,
                           12, LayerTilesRenderParameters.defaultTileTextureResolution(),
                           LayerTilesRenderParameters.defaultTileMeshResolution(), false));
         layerSet.addLayer(i3Landsat);

         final WMSLayer pnoa = new WMSLayer("PNOA", new URL("http://www.idee.es/wms/PNOA/PNOA", false),
                  WMSServerVersion.WMS_1_1_0, Sector.fromDegrees(21, -18, 45, 6), "image/png", "EPSG:4326", "", true, null,
                  TimeInterval.fromDays(30), true, null, (float) 0.5);
         layerSet.addLayer(pnoa);
      }*/

      //builder.getPlanetRendererBuilder().setLayerSet(layerSet);

      /*
       * final WMSLayer political = new WMSLayer("topp:cia", new
       * URL("http://worldwind22.arc.nasa.gov/geoserver/wms?", false),
       * WMSServerVersion.WMS_1_1_0, Sector.fullSphere(), "image/png",
       * "EPSG:4326", "countryboundaries", true, null,
       * TimeInterval.fromDays(30), true); layerSet.addLayer(political);
       */

   /*
      @Override
      public ArrayList<GEORasterSymbol> createSymbols(final GEO2DMultiLineStringGeometry geometry) {
         return null;
      }



      @Override
      public ArrayList<GEORasterSymbol> createSymbols(final GEO2DPolygonGeometry geometry) {
         final ArrayList<GEORasterSymbol> symbols = new ArrayList<GEORasterSymbol>();
         final GEOPolygonRasterSymbol symbol = new GEOPolygonRasterSymbol( //
                  geometry.getPolygonData(), //
                  createPolygonLineRasterStyle(geometry), //
                  createPolygonSurfaceRasterStyle(geometry) //
         );
         symbols.add(symbol);
         return symbols;
=======
      final String proxy = null; // "http://galileo.glob3mobile.com/" + "proxy.php?url="
      builder.setDownloader(new Downloader_WebGL( //
               8, // maxConcurrentOperationCount
               10, // delayMillis
               proxy));


      final NonOverlappingMarksRenderer renderer = new NonOverlappingMarksRenderer(30);
      builder.addRenderer(renderer);

      renderer.addMark(createMark("Label #1", Geodetic3D.fromDegrees(28.131817, -15.440219, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(28.947345, -13.523105, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(28.473802, -13.859360, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(28.467706, -16.251426, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(28.701819, -17.762003, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(28.086595, -17.105796, 0)));
      renderer.addMark(createMark(Geodetic3D.fromDegrees(27.810709, -17.917639, 0)));


      final boolean testCanvas = false;
      if (testCanvas) {
         final ShapesRenderer shapesRenderer = new ShapesRenderer();
         builder.addRenderer(shapesRenderer);


         builder.setInitializationTask(new GInitializationTask() {
            @Override
            public void run(final G3MContext context) {

               final IImageDownloadListener listener = new IImageDownloadListener() {
                  @Override
                  public void onError(final URL url) {
                  }


                  @Override
                  public void onDownload(final URL url,
                                         final IImage image,
                                         final boolean expired) {
                     final ICanvas canvas = context.getFactory().createCanvas();
                     final int width = 1024;
                     final int height = 1024;
                     canvas.initialize(width, height);

                     canvas.setFillColor(Color.fromRGBA(1f, 1f, 0f, 0.5f));
                     canvas.fillRectangle(0, 0, width, height);
                     canvas.setLineWidth(4);
                     canvas.setLineColor(Color.black());
                     canvas.strokeRectangle(0, 0, width, height);

                     final int steps = 8;
                     final float leftStep = (float) width / steps;
                     final float topStep = (float) height / steps;

                     canvas.setLineWidth(1);
                     canvas.setFillColor(Color.fromRGBA(0f, 0f, 0f, 0.75f));
                     for (int i = 1; i < steps; i++) {
                        canvas.fillRectangle(0, topStep * i, width, 1);
                        canvas.fillRectangle(leftStep * i, 0, 1, height);
                     }

                     canvas.setFont(GFont.monospaced());
                     canvas.setFillColor(Color.black());
                     // canvas.fillText("0,0", 0, 0);
                     // canvas.fillText("w,h", width, height);
                     for (int i = 0; i < steps; i++) {
                        canvas.fillText("Hellow World", leftStep * i, topStep * i);
                     }


                     final float width8 = (float) width / 8;
                     final float height8 = (float) height / 8;
                     canvas.drawImage(image, width8, height8); // ok
                     canvas.drawImage(image, width8 * 3, height8, 0.5f); // ok

                     final int imageWidth = image.getWidth();
                     final int imageHeight = image.getHeight();
                     canvas.drawImage(image, width8, height8 * 3, imageWidth * 2, imageHeight * 2); // ok
                     canvas.drawImage(image, width8 * 3, height8 * 3, imageWidth * 2, imageHeight * 2, 0.5f); //ok

                     // ok
                     canvas.drawImage(image, //
                              0, 0, imageWidth, imageHeight, //
                              width8 * 5, height8 * 5, imageWidth * 2, imageHeight * 2);
                     // ok
                     canvas.drawImage(image, //
                              0, 0, imageWidth, imageHeight, //
                              width8 * 7, height8 * 7, imageWidth * 2, imageHeight * 2, //
                              0.5f);


                     canvas.createImage(new IImageListener() {
                        @Override
                        public void imageCreated(final IImage canvasImage) {
                           final QuadShape quad = new QuadShape( //
                                    Geodetic3D.fromDegrees(-34.615047738942699596, -58.4447233540403559, 1000), //
                                    AltitudeMode.ABSOLUTE, //
                                    canvasImage, //
                                    canvasImage.getWidth() * 15.0f, //
                                    canvasImage.getHeight() * 15.0f, //
                                    true);

                           shapesRenderer.addShape(quad);
                        }
                     }, true);

                     canvas.dispose();

                     image.dispose();
                  }


                  @Override
                  public void onCanceledDownload(final URL url,
                                                 final IImage image,
                                                 final boolean expired) {
                  }


                  @Override
                  public void onCancel(final URL url) {
                  }
               };


               context.getDownloader().requestImage( //
                        new URL("/g3m-marker.png"), //
                        1, // priority, //
                        TimeInterval.zero(), //
                        false, //
                        listener, //
                        true);
            }


            @Override
            public boolean isDone(final G3MContext context) {
               return true;
            }
         });
>>>>>>> purgatory
      }


      return builder.createWidget();
   }
*/
   
	public CameraRenderer createCameraRenderer()
	{
	  CameraRenderer cameraRenderer = new CameraRenderer();
	  final boolean useInertia = true;
	  cameraRenderer.addHandler(new CameraSingleDragHandler(useInertia));
	  final boolean allowRotationInDoubleDrag = false;
	  cameraRenderer.addHandler(new CameraDoubleDragHandler(allowRotationInDoubleDrag));
	  //cameraRenderer.addHandler(new CameraZoomAndRotateHandler());

	  cameraRenderer.addHandler(new CameraRotationHandler());
	  cameraRenderer.addHandler(new CameraDoubleTapHandler());
	  
	  return cameraRenderer;
	}

	
   public void testBranch_zrender_touchhandlers() {
	   final G3MBuilder_WebGL builder = new G3MBuilder_WebGL();

	   //const Planet* planet = Planet::createEarth();
	   final Planet planet = Planet.createSphericalEarth();
	   //final Planet planet = Planet.createFlatEarth();
	   builder.setPlanet(planet);
	   	   
	   // create shape
	   ShapesRenderer shapesRenderer = new ShapesRenderer();
	   Shape box = new BoxShape(new Geodetic3D(Angle.fromDegrees(28.4),
			   Angle.fromDegrees(-16.4),
			   0),
			   AltitudeMode.ABSOLUTE,
			   new Vector3D(3000, 3000, 20000),
			   2,
			   Color.fromRGBA(1.0f, 1.0f, 0.0f, 0.5f),
			   Color.newFromRGBA(0.0f, 0.75f, 0.0f, 0.75f));
	   shapesRenderer.addShape(box);
	   builder.addRenderer(shapesRenderer);

	   // create elevations for Tenerife from bil file
	   Sector sector = Sector.fromDegrees (27.967811065876,                  // min latitude
			   -17.0232177085356,                // min longitude
			   28.6103464294992,                 // max latitude
			   -16.0019401695656);               // max longitude
	   Vector2I extent = new Vector2I(256, 256);                             // image resolution
	   URL url = new URL("http://serdis.dis.ulpgc.es/~atrujill/glob3m/IGO/Tenerife-256x256.bil", false);
	   ElevationDataProvider elevationDataProvider = new SingleBilElevationDataProvider(url, sector, extent);
	   builder.getPlanetRendererBuilder().setElevationDataProvider(elevationDataProvider);	  
	   builder.getPlanetRendererBuilder().setVerticalExaggeration(4.0f);

	   _widget = builder.createWidget();
	   
	   // set camera looking at Tenerife
	   Geodetic3D position = new Geodetic3D(Angle.fromDegrees(27.60), Angle.fromDegrees(-16.54), 55000.0);
	   _widget.setCameraPosition(position);
	   _widget.setCameraPitch(Angle.fromDegrees(-50.0));
  }

>>>>>>> zrender-touchhandlers

}
