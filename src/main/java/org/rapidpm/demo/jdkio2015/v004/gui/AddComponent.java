package org.rapidpm.demo.jdkio2015.v004.gui;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Created by sven on 19.01.15.
 */
public class AddComponent extends HBox {

    private Controller controller = new Controller();
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField();
    private TextField tfResult = new TextField();
    final Button button = new Button();

    {
        tf1.setId("tf1");
        tf2.setId("tf2");
        tfResult.setId("tfResult");
        button.setId("btnAdd");
        button.setText("Ohhh press me..");
        button.setOnAction(event -> {
            String v1 = tf1.getText();
            String v2 = tf2.getText();
            String result = controller.add(v1, v2);
            tfResult.setText(result);
        });
        this.getChildren().addAll(tf1, tf2, button, tfResult);
    }

}
