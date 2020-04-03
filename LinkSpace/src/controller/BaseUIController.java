package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import jfxtras.labs.scene.layout.ScalableContentPane;

public class BaseUIController {
  @FXML
  VBox projectExplorer;

  @FXML
  VBox elementSelection;

  @FXML
  HBox menuBar;

  @FXML
  ScalableContentPane linkingSpace;

  public void initalize() {
  }
}
