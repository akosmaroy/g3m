//
//  SGGeometryNode.cpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 11/8/12.
//
//

#include "SGGeometryNode.hpp"

#include "Context.hpp"
#include "GL.hpp"

#include "IFloatBuffer.hpp"
#include "IShortBuffer.hpp"

#include "GPUProgramState.hpp"

SGGeometryNode::~SGGeometryNode() {
  delete _vertices;
  delete _colors;
  delete _uv;
  delete _normals;
  delete _indices;
}

void SGGeometryNode::rawRender(const G3MRenderContext* rc,
                               const GLState& parentState, const GPUProgramState* parentProgramState) {
  GL* gl = rc->getGL();

  GLState state(parentState);
  state.enableVerticesPosition();
  if (_colors == NULL) {
    state.disableVertexColor();
  }
  else {
    const float colorsIntensity = 1;
    state.enableVertexColor(_colors, colorsIntensity);
  }

  if (_uv != NULL) {
    state.translateTextureCoordinates((float)0.0, (float)0.0);
    state.scaleTextureCoordinates((float)1.0, (float)1.0);
    state.setTextureCoordinates(_uv, 2, 0);
  }
  
  GPUProgramState progState(parentProgramState);
  progState.setAttributeEnabled("Position", true);
  progState.setAttributeValue("Position",
                              _vertices, 4, //The attribute is a float vector of 4 elements
                              3,            //Our buffer contains elements of 3
                              0,            //Index 0
                              false,        //Not normalized
                              0);           //Stride 0
  
  //state.setVertices(_vertices, 3, 0);
  gl->drawElements(_primitive, _indices, state, *rc->getGPUProgramManager(), &progState);
}
