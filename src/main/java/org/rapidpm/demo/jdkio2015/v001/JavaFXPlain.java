package org.rapidpm.demo.jdkio2015.v001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static java.lang.Integer.valueOf;

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
        HBox hBox = new HBox();
        final TextField tf1 = new TextField(), tf2 = new TextField(), tfResult = new TextField();
        final Button button = new Button();
        button.setText("Ohhh press me..");
        button.setOnAction(event -> {
            String v1 = tf1.getText();
            String v2 = tf2.getText();
            int result = valueOf(v1) + valueOf(v2);
            tfResult.setText(result+"");
        });
        hBox.getChildren().addAll(tf1, tf2, button, tfResult);
        rootNode.getChildren().add(hBox);
        final Scene scene = new Scene(rootNode, 640, 60);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}