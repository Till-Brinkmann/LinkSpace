package node.model;

public abstract class IOElementModel {
  enum IOSpecifier {
    Input, Output
  };

  private IOSpecifier ioSpec;

  public IOElementModel(IOSpecifier ioSpec, Object type, int id, String name) {

  }

  private IOSpecifier getIOSpecifier() {
    return ioSpec;
  }
}
