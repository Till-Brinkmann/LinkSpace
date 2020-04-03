package node;

import node.model.base.NodeModel;
import node.view.base.NodeView;

public interface NodeFactory {
  public NodeLinkingSpaceView getLinkingSpaceView();
  public NodePreviewView getPreviewView();
  public NodeReducedView getReducedView();
  public Class<? extends NodeModel> getModelClass();
}
