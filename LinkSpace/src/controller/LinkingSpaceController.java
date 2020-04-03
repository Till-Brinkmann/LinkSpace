package controller;

import java.util.Dictionary;
import java.util.Map;

import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import jfxtras.labs.scene.layout.ScalableContentPane;

public class LinkingSpaceController {

  ScalableContentPane scalableContentPane;

  public LinkingSpaceController(ScalableContentPane linkingSpace) {
    this.scalableContentPane = linkingSpace;
  }

}
