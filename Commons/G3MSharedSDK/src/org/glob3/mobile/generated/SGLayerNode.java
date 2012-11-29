package org.glob3.mobile.generated; 
//
//  SGLayerNode.cpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 11/9/12.
//
//

//
//  SGLayerNode.hpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 11/9/12.
//
//



//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class IGLTextureId;
//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class IImage;

public class SGLayerNode extends SGNode
{
  private final String _uri;

  private final String _applyTo;
  private final String _blendMode;
  private final boolean _flipY;

  private final String _magFilter;
  private final String _minFilter;
  private final String _wrapS;
  private final String _wrapT;

  private boolean _textureBound;


  //void SGLayerNode::setURI(const std::string& uri) {
  //  if (_uri.compare(uri) == 0) {
  //    return;
  //  }
  //
  //  _uri = uri;
  //
  //  if (_requestInProgress != -1) {
  //    if (_context != NULL) {
  //      _context->getDownloader()->cancelRequest(_requestInProgress);
  //      _requestInProgress = -1;
  //    }
  //  }
  //
  //  int __release_texture_id_uploaded;
  //}
  
  private IGLTextureId getTextureId(G3MRenderContext rc)
  {
	if (_textureId == null)
	{
	  if (_downloadedImage != null)
	  {
		final boolean hasMipMap = false;
		_textureId = rc.getTexturesHandler().getGLTextureId(_downloadedImage, GLFormat.rgba(), getURL().getPath(), hasMipMap);
  
		if (_downloadedImage != null)
			_downloadedImage.dispose();
		_downloadedImage = null;
	  }
	}
	return _textureId;
  }

  private IImage _downloadedImage;
  private void requestImage()
  {
	if (_uri.compareTo("") == 0)
	{
	  return;
	}
  
	if (_context == null)
	{
	  return;
	}
  
	_context.getDownloader().requestImage(getURL(), DefineConstants.TEXTURES_DOWNLOAD_PRIORITY, new ImageDownloadListener(this), true);
  }

  private final IGLTextureId _textureId;

//C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in Java:
//ORIGINAL LINE: URL getURL() const
  private URL getURL()
  {
	IStringBuilder isb = IStringBuilder.newStringBuilder();
	isb.addString(_shape.getURIPrefix());
	isb.addString(_uri);
	final String path = isb.getString();
	if (isb != null)
		isb.dispose();
  
	return new URL(path, false);
  }


  public SGLayerNode(String id, String sId, String uri, String applyTo, String blendMode, boolean flipY, String magFilter, String minFilter, String wrapS, String wrapT)
  {
	  super(id, sId);
	  _uri = uri;
	  _applyTo = applyTo;
	  _blendMode = blendMode;
	  _flipY = flipY;
	  _magFilter = magFilter;
	  _minFilter = minFilter;
	  _wrapS = wrapS;
	  _wrapT = wrapT;
	  _textureBound = false;
	  _downloadedImage = null;
	  _textureId = null;

  }


  //void TextureDownloadListener::onDownload(const URL& url,
  //                                         const IImage* image) {
  //  _layerNode->onImageDownload(image);
  //}
  
  public final void onImageDownload(IImage image)
  {
	if (_downloadedImage != null)
	{
	  if (_downloadedImage != null)
		  _downloadedImage.dispose();
	}
	_downloadedImage = image.shallowCopy();
  }

  public final void initialize(G3MContext context, SGShape shape)
  {
	super.initialize(context, shape);
  
	requestImage();
  }

  public final void prepareRender(G3MRenderContext rc)
  {
	super.prepareRender(rc);
  
	//  SGShape* shape = getShape();
  
	final IGLTextureId texId = getTextureId(rc);
	_textureBound = (texId != null);
	if (_textureBound)
	{
	  GL gl = rc.getGL();
  
	  //    if (_transparent) {
	  //      gl->enableBlend();
	  //    }
  
	  gl.enableTextures();
	  gl.enableTexture2D();
  
	  //    _textureMapping->bind(rc);
	  //    gl->transformTexCoords(_scale, _translation);
	  gl.bindTexture(texId);
	  //    gl->setTextureCoordinates(2, 0, _texCoords);
	}
  }

  public final void cleanUpRender(G3MRenderContext rc)
  {
	if (_textureBound)
	{
	  GL gl = rc.getGL();
  
	  gl.disableTexture2D();
	  gl.disableTextures();
  
	  //    if (_transparent) {
	  //      gl->disableBlend();
	  //    }
  
	  _textureBound = false;
	}
  
	super.cleanUpRender(rc);
  }

}