package org.rapidpm.demo.jdkio2015.v004;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.rapidpm.demo.jdkio2015.v004.gui.AddComponent;

/**
 * Created by sven on 19.01.15.
 */
public class JavaFXPlain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final AnchorPane rootNode = new AnchorPane();
        rootNode.getChildren().add(new AddComponent());
        final Scene scene = new Scene(rootNode, 640, 60);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}