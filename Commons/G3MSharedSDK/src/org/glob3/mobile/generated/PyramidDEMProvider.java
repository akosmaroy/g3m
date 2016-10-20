package org.glob3.mobile.generated; 
//
//  PyramidDEMProvider.cpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 10/19/16.
//
//

//
//  PyramidDEMProvider.hpp
//  G3MiOSSDK
//
//  Created by Diego Gomez Deck on 10/19/16.
//
//




//class DEMGrid;
//class DEMPyramidNode;


public abstract class PyramidDEMProvider extends DEMProvider
{

  private final int _rootNodesCount;
  private java.util.ArrayList<DEMPyramidNode> _rootNodes;

  private java.util.ArrayList<DEMPyramidNode> getRootNodes()
  {
    if (_rootNodes == null)
    {
      _rootNodes = new java.util.ArrayList<DEMPyramidNode>();
      for (int i = 0; i < _rootNodesCount; i++)
      {
        DEMPyramidNode rootNode = createNode(null, i);
        _rootNodes.add(rootNode);
      }
    }
    return _rootNodes;
  }



  protected final void insertGrid(int z, int x, int y, DEMGrid grid, boolean sticky)
  {
    java.util.ArrayList<DEMPyramidNode> rootNodes = getRootNodes();
    for (int i = 0; i < _rootNodesCount; i++)
    {
      DEMPyramidNode rootNode = rootNodes.get(i);
      if (rootNode.insertGrid(z, x, y, grid, sticky, this))
      {
        return;
      }
    }
    throw new RuntimeException("can't insert grid");
  }

  protected PyramidDEMProvider(double deltaHeight, int rootNodesCount)
  {
     super(deltaHeight);
     _rootNodesCount = rootNodesCount;
     _rootNodes = null;
  }

  public void dispose()
  {
    if (_rootNodes != null)
    {
      for (int i = 0; i < _rootNodesCount; i++)
      {
        DEMPyramidNode rootNode = _rootNodes.get(i);
        if (rootNode != null)
           rootNode.dispose();
      }
      _rootNodes = null;
    }
    super.dispose();
  }



  public abstract DEMPyramidNode createNode(DEMPyramidNode parent, int childID);

  public final long subscribe(Sector sector, Vector2I extent, DEMListener listener)
  {
    throw new RuntimeException("Not yet done");
  }

  public final void unsubscribe(long subscriptionID, boolean deleteListener)
  {
    throw new RuntimeException("Not yet done");
  }

}