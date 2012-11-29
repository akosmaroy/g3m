package org.glob3.mobile.generated; 
//
//  SGMaterialNode.cpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 11/8/12.
//
//

//
//  SGMaterialNode.hpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 11/8/12.
//
//



public class SGMaterialNode extends SGNode
{
  private final Color _baseColor;
  private final Color _specularColor;

  private final double _specular;
  private final double _shine;
  private final double _alpha;
  private final double _emit;

//  baseColor { r: 0.0, g: 0.0, b: 0.0 }
//  specularColor { r: 0.0, g: 0.0, b: 0.0 }
//
//  specular 1
//  shine 10
//  alpha 1.0
//  emit 0.0


  protected final void prepareRender(G3MRenderContext rc)
  {
	GL gl = rc.getGL();
  
	if (_specularColor == null)
	{
	  gl.disableVertexFlatColor();
	}
	else
	{
	  final float colorsIntensity = 1F;
	  gl.enableVertexFlatColor(_specularColor, colorsIntensity);
	}
  
	super.prepareRender(rc);
  }

  protected final void cleanUpRender(G3MRenderContext rc)
  {
	GL gl = rc.getGL();
  
	gl.disableVertexFlatColor();
  
	super.cleanUpRender(rc);
  }


  public SGMaterialNode(String id, String sId, Color baseColor, Color specularColor, double specular, double shine, double alpha, double emit)
  {
	  super(id, sId);
	  _baseColor = baseColor;
	  _specularColor = specularColor;
	  _specular = specular;
	  _shine = shine;
	  _alpha = alpha;
	  _emit = emit;

  }

  public void dispose()
  {
	if (_baseColor != null)
		_baseColor.dispose();
	if (_specularColor != null)
		_specularColor.dispose();
  }

}