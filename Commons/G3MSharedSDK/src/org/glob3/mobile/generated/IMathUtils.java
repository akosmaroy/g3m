package org.glob3.mobile.generated; 
//
//  IMathUtils.cpp
//  G3MiOSSDK
//
//  Created by José Miguel S N on 29/08/12.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

//
//  IMathUtils.hpp
//  G3MiOSSDK
//
//  Created by José Miguel S N on 24/08/12.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//



//This declaration creates an converter issue
///#ifdef GMath
//  TODO_GMATH_PREDEFINED!!!!
///#endif

//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
//#define GMath IMathUtils.instance()

public abstract class IMathUtils
{


  private static IMathUtils _instance = null;

  public static void setInstance(IMathUtils math)
  {
	if (_instance != null)
	{
	  ILogger.instance().logWarning("IMathUtils instance already set!");
	  if (_instance != null)
		  _instance.dispose();
	}
	_instance = math;
  }

  public static IMathUtils instance()
  {
	return _instance;
  }

  public void dispose()
  {
  }

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double pi() const = 0;
  public abstract double pi();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double halfPi() const = 0;
  public abstract double halfPi();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual boolean isNan(double v) const = 0;
  public abstract boolean isNan(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual boolean isNan(float v) const = 0;
  public abstract boolean isNan(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double NanD() const = 0;
  public abstract double NanD();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float NanF() const = 0;
  public abstract float NanF();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double sin(double v) const = 0;
  public abstract double sin(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float sin(float v) const = 0;
  public abstract float sin(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double asin(double v) const = 0;
  public abstract double asin(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float asin(float v) const = 0;
  public abstract float asin(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double cos(double v) const = 0;
  public abstract double cos(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float cos(float v) const = 0;
  public abstract float cos(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double acos(double v) const = 0;
  public abstract double acos(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float acos(float v) const = 0;
  public abstract float acos(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double tan(double v) const = 0;
  public abstract double tan(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float tan(float v) const = 0;
  public abstract float tan(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double atan(double v) const = 0;
  public abstract double atan(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float atan(float v) const = 0;
  public abstract float atan(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double atan2(double u, double v) const = 0;
  public abstract double atan2(double u, double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float atan2(float u, float v) const = 0;
  public abstract float atan2(float u, float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double round(double v) const = 0;
  public abstract double round(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float round(float v) const = 0;
  public abstract float round(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual int abs(int v) const = 0;
  public abstract int abs(int v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double abs(double v) const = 0;
  public abstract double abs(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float abs(float v) const = 0;
  public abstract float abs(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double sqrt(double v) const = 0;
  public abstract double sqrt(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float sqrt(float v) const = 0;
  public abstract float sqrt(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double pow(double v, double u) const = 0;
  public abstract double pow(double v, double u);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float pow(float v, float u) const = 0;
  public abstract float pow(float v, float u);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double exp(double v) const = 0;
  public abstract double exp(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float exp(float v) const = 0;
  public abstract float exp(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double log10(double v) const = 0;
  public abstract double log10(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float log10(float v) const = 0;
  public abstract float log10(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double log(double v) const = 0;
  public abstract double log(double v);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float log(float v) const = 0;
  public abstract float log(float v);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual int maxInt32() const = 0;
  public abstract int maxInt32();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual int minInt32() const = 0;
  public abstract int minInt32();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual long maxInt64() const = 0;
  public abstract long maxInt64();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual long minInt64() const = 0;
  public abstract long minInt64();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double maxDouble() const = 0;
  public abstract double maxDouble();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double minDouble() const = 0;
  public abstract double minDouble();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float maxFloat() const = 0;
  public abstract float maxFloat();
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual float minFloat() const = 0;
  public abstract float minFloat();

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual int toInt(double value) const = 0;
  public abstract int toInt(double value);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual int toInt(float value) const = 0;
  public abstract int toInt(float value);

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double min(double d1, double d2) const = 0;
  public abstract double min(double d1, double d2);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double max(double d1, double d2) const = 0;
  public abstract double max(double d1, double d2);

  public double lerp(double from, double to, double alpha)
  {
	return from + ((to - from) * alpha);
  }

  public float lerp(float from, float to, float alpha)
  {
	return from + ((to - from) * alpha);
  }

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual long doubleToRawLongBits(double value) const = 0;
  public abstract long doubleToRawLongBits(double value);
//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: virtual double rawLongBitsToDouble(long value) const = 0;
  public abstract double rawLongBitsToDouble(long value);

}