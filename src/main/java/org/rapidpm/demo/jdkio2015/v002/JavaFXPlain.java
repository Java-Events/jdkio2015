package org.rapidpm.demo.jdkio2015.v002;

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


    private AddService addService = new AddService();
    private String2Int string2Int = new String2Int();

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
            int intA = string2Int.convert(v1);
            int intB = string2Int.convert(v2);
            int result = addService.add(intA, intB);
            String text = result + "";
            tfResult.setText(text);
        });
        hBox.getChildren().addAll(tf1, tf2, button, tfResult);
        rootNode.getChildren().add(hBox);
        final Scene scene = new Scene(rootNode, 640, 60);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}