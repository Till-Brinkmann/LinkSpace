package node.view.base;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import node.model.IOElementModel;
import node.model.base.NodeModel;
import utility.HashMapUniqueValues;

public abstract class NodeLinkingSpaceView extends Node {

  public abstract NodeLinkingSpaceView(Node model) {
    Map<IOElementModel, Pane> ioPaneMapping = init(model.GetInputs(), model.GetOuputs());
    for (Entry<IOElementModel, Pane> ioEntry : ioPaneMapping.entrySet()) {

    }
  }

  public default void initMovement(Pane pane) {
    pane.setOnMouseDragged(event -> drag(event));

  }

  public void drag(MouseEvent event) {
    Node n = (Node) event.getSource();
    n.setTranslateX(n.getTranslateX() + event.getX());
    n.setTranslateY(n.getTranslateY() + event.getY());
  }

  public abstract HashMapUniqueValues<node.model.IOElementModel, Pane> init(ArrayList<node.model.IOElementModel> inputs,
      ArrayList<node.model.IOElementModel> outputs);

  punli
  
  public abstract Pane getReducedView();
  
  public abstract Pane getPreviewView();

}
