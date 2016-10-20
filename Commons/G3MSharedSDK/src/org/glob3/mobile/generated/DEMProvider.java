package org.glob3.mobile.generated; 
//
//  DEMProvider.cpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 10/13/16.
//
//

//
//  DEMProvider.hpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 10/13/16.
//
//



//class RenderState;
//class G3MContext;
//class Sector;
//class Vector2I;
//class DEMListener;


public abstract class DEMProvider extends RCObject
{
  protected final double _deltaHeight;

  protected DEMProvider(double deltaHeight)
  {
     _deltaHeight = deltaHeight;
  }

  public void dispose()
  {
    super.dispose();
  }


  public abstract RenderState getRenderState();

  public abstract void initialize(G3MContext context);

  public abstract void cancel();

  public abstract long subscribe(Sector sector, Vector2I extent, DEMListener listener);

  public abstract void unsubscribe(long subscriptionID, boolean deleteListener);

}