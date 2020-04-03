package node.model.base;

import java.util.ArrayList;

import node.model.IOElementModel;

public abstract class NodeModel {

  private int modelID;

  private ArrayList<IOElementModel> Outputs;

  public int getModelID() {
    return modelID;
  }
  
}
