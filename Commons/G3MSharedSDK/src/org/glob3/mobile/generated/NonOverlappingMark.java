package org.glob3.mobile.generated; 
public class NonOverlappingMark
{
  private float _springLengthInPixels;

  private Vector3D _cartesianPos;
  private Geodetic3D _geoPosition ;

  private float _dX; //Velocity vector (pixels per second)
  private float _dY;
  private float _fX; //Applied Force
  private float _fY;

  private MarkWidget _widget;// = new MarkWidget();
  private MarkWidget _anchorWidget;// = new MarkWidget();

  private final float _springK;
  private final float _maxSpringLength;
  private final float _minSpringLength;
  private final float _electricCharge;
  private final float _anchorElectricCharge;
  private final float _maxWidgetSpeedInPixelsPerSecond;
  private final float _resistanceFactor;
  private final float _minWidgetSpeedInPixelsPerSecond;


  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength, float electricCharge, float anchorElectricCharge, float maxWidgetSpeedInPixelsPerSecond, float minWidgetSpeedInPixelsPerSecond)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, minSpringLength, electricCharge, anchorElectricCharge, maxWidgetSpeedInPixelsPerSecond, minWidgetSpeedInPixelsPerSecond, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength, float electricCharge, float anchorElectricCharge, float maxWidgetSpeedInPixelsPerSecond)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, minSpringLength, electricCharge, anchorElectricCharge, maxWidgetSpeedInPixelsPerSecond, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength, float electricCharge, float anchorElectricCharge)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, minSpringLength, electricCharge, anchorElectricCharge, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength, float electricCharge)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, minSpringLength, electricCharge, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, minSpringLength, 30000.0f, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, maxSpringLength, 5.0f, 30000.0f, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, springK, 100.0f, 5.0f, 30000.0f, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, springLengthInPixels, 1.0f, 100.0f, 5.0f, 30000.0f, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position)
  {
     this(imageBuilderWidget, imageBuilderAnchor, position, 10.0f, 1.0f, 100.0f, 5.0f, 30000.0f, 20000.0f, 1000.0f, 35.0f, 0.95f);
  }
  public NonOverlappingMark(IImageBuilder imageBuilderWidget, IImageBuilder imageBuilderAnchor, Geodetic3D position, float springLengthInPixels, float springK, float maxSpringLength, float minSpringLength, float electricCharge, float anchorElectricCharge, float maxWidgetSpeedInPixelsPerSecond, float minWidgetSpeedInPixelsPerSecond, float resistanceFactor)
  {
     _geoPosition = new Geodetic3D(position);
     _springLengthInPixels = springLengthInPixels;
     _cartesianPos = null;
     _dX = 0F;
     _dY = 0F;
     _fX = 0F;
     _fY = 0F;
     _widget = new MarkWidget(imageBuilderWidget);
     _anchorWidget = new MarkWidget(imageBuilderAnchor);
     _springK = springK;
     _maxSpringLength = maxSpringLength;
     _minSpringLength = minSpringLength;
     _electricCharge = electricCharge;
     _maxWidgetSpeedInPixelsPerSecond = maxWidgetSpeedInPixelsPerSecond;
     _anchorElectricCharge = anchorElectricCharge;
     _resistanceFactor = resistanceFactor;
     _minWidgetSpeedInPixelsPerSecond = minWidgetSpeedInPixelsPerSecond;
  
  }

  public void dispose()
  {
    if (_cartesianPos != null)
       _cartesianPos.dispose();
  }

  public final Vector3D getCartesianPosition(Planet planet)
  {
    if (_cartesianPos == null)
    {
      _cartesianPos = new Vector3D(planet.toCartesian(_geoPosition));
    }
    return _cartesianPos;
  }

  public final void computeAnchorScreenPos(Camera cam, Planet planet)
  {
  
    Vector2F sp = new Vector2F(cam.point2Pixel(getCartesianPosition(planet)));
    _anchorWidget.setScreenPos(sp._x, sp._y);
  
    if (_widget.getScreenPos().isNaN())
    {
      _widget.setScreenPos(sp._x, sp._y + 0.01f);
    }
  }

  public final Vector2F getScreenPos()
  {
     return _widget.getScreenPos();
  }
  public final Vector2F getAnchorScreenPos()
  {
     return _anchorWidget.getScreenPos();
  }

  public final void render(G3MRenderContext rc, GLState glState)
  {
  
    if (_widget.isReady() && _anchorWidget.isReady())
    {
      _widget.render(rc, glState);
      _anchorWidget.render(rc, glState);
    }
    else
    {
      _widget.init(rc, rc.getCurrentCamera().getViewPortWidth(), rc.getCurrentCamera().getViewPortHeight());
      _anchorWidget.init(rc, rc.getCurrentCamera().getViewPortWidth(), rc.getCurrentCamera().getViewPortHeight());
    }
  }

  public final void applyCoulombsLaw(NonOverlappingMark that)
  {
  
    Vector2F d = getScreenPos().sub(that.getScreenPos());
    double distance = d.length() + 0.001;
    Vector2F direction = d.div((float)distance);
  
    float strength = (float)(this._electricCharge * that._electricCharge / (distance * distance));
  
    Vector2F force = direction.times(strength);
  
    this.applyForce(force._x, force._y);
    that.applyForce(-force._x, -force._y);
  
    //  var d = point1.p.subtract(point2.p);
    //  var distance = d.magnitude() + 0.1; // avoid massive forces at small distances (and divide by zero)
    //  var direction = d.normalise();
    //
    //  // apply force to each end point
    //  point1.applyForce(direction.multiply(this.repulsion).divide(distance * distance * 0.5));
    //  point2.applyForce(direction.multiply(this.repulsion).divide(distance * distance * -0.5));
  
  }
  public final void applyCoulombsLawFromAnchor(NonOverlappingMark that)
  {
  
    Vector2F dAnchor = getScreenPos().sub(that.getAnchorScreenPos());
    double distanceAnchor = dAnchor.length() + 0.001;
    Vector2F directionAnchor = dAnchor.div((float)distanceAnchor);
  
    float strengthAnchor = (float)(this._electricCharge * that._anchorElectricCharge / (distanceAnchor * distanceAnchor));
  
    this.applyForce(directionAnchor._x * strengthAnchor, directionAnchor._y * strengthAnchor);
  }

  public final void applyHookesLaw()
  {
  
    Vector2F d = getScreenPos().sub(getAnchorScreenPos());
    double mod = d.length();
    double displacement = _springLengthInPixels - mod;
    Vector2F direction = d.div((float)mod);
  
    float force = (float)(_springK * displacement);
  
    applyForce((float)(direction._x * force), (float)(direction._y * force));
  
    //  var d = spring.point2.p.subtract(spring.point1.p); // the direction of the spring
    //  var displacement = spring.length - d.magnitude();
    //  var direction = d.normalise();
    //
    //  // apply force to each end point
    //  spring.point1.applyForce(direction.multiply(spring.k * displacement * -0.5));
    //  spring.point2.applyForce(direction.multiply(spring.k * displacement * 0.5));
  }

  public final void applyForce(float x, float y)
  {
    _fX += x;
    _fY += y;
  }

  public final void updatePositionWithCurrentForce(double elapsedMS, float viewportWidth, float viewportHeight)
  {
  
    Vector2D oldVelocity = new Vector2D(_dX, _dY);
    Vector2D force = new Vector2D(_fX, _fY);
  
    //Assuming Widget Mass = 1.0
    float time = (float)(elapsedMS / 1000.0);
    Vector2D velocity = oldVelocity.add(force.times(time)).times(_resistanceFactor); //Resistance force applied as x0.85
  
    //Force has been applied and must be reset
    _fX = 0F;
    _fY = 0F;
  
    //Clamping Velocity
    double velocityPPS = velocity.length();
    if (velocityPPS > _maxWidgetSpeedInPixelsPerSecond)
    {
      _dX = (float)(velocity._x * (_maxWidgetSpeedInPixelsPerSecond / velocityPPS));
      _dY = (float)(velocity._y * (_maxWidgetSpeedInPixelsPerSecond / velocityPPS));
    }
    else
    {
      if (velocityPPS < _minWidgetSpeedInPixelsPerSecond)
      {
        _dX = 0.0F;
        _dY = 0.0F;
      }
      else
      {
        //Normal case
        _dX = (float)velocity._x;
        _dY = (float)velocity._y;
      }
    }
  
    //Update position
    Vector2F position = _widget.getScreenPos();
  
    float newX = position._x + (_dX * time);
    float newY = position._y + (_dY * time);
  
    Vector2F anchorPos = _anchorWidget.getScreenPos();
  
    Vector2F spring = new Vector2F(newX,newY).sub(anchorPos).clampLength(_minSpringLength, _maxSpringLength);
    Vector2F finalPos = anchorPos.add(spring);
  
    _widget.setScreenPos(finalPos._x, finalPos._y);
    _widget.clampPositionInsideScreen((int)viewportWidth, (int)viewportHeight, 5); // 5 pixels of margin
  
  }

  public final void onResizeViewportEvent(int width, int height)
  {
    _widget.onResizeViewportEvent(width, height);
    _anchorWidget.onResizeViewportEvent(width, height);
  }

  public final void resetWidgetPositionVelocityAndForce()
  {
     _widget.resetPosition();
     _dX = 0F;
     _dY = 0F;
     _fX = 0F;
     _fY = 0F;
  }

}