package com.example.examstuff;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class jFxTest extends Application {
    @Override
    public void start(Stage stage) {
        GridPane g1 = new GridPane();
        Text tRadius = new Text("Radius:");
        TextField tfRadius = new TextField();
        Text tHeight = new Text("Height:");
        TextField tfHeight = new TextField();
        Button btCalculate = new Button("Calculate");
        g1.addRow(0, tRadius, tfRadius, tHeight, tfHeight, btCalculate);
        Scene s1 = new Scene(g1, 500, 500);
        stage.setTitle("Exam");
        stage.setScene(s1);
        stage.show();
        TextArea trCylinderArea = new TextArea();
        TextArea trCylinderVolume = new TextArea();

        btCalculate.setOnAction(e -> {
            double area = (2.0 * Math.PI * Double.parseDouble(tfRadius.getText())
                    * Double.parseDouble(tfHeight.getText())) + (2
                    * Math.PI * Math.pow(Double.parseDouble(tfRadius.getText()), 2));
            double volume = Math.PI * Math.pow(Double.parseDouble(tfRadius.getText()), 2)
                    * Double.parseDouble(tfHeight.getText());

            trCylinderArea.setText(String.format("%.2f", area));
            trCylinderVolume.setText(String.format("%.2f", volume));
            trCylinderArea.setEditable(false);
            trCylinderVolume.setEditable(false);
            g1.add(trCylinderArea, 0,1, 2, 1);
            g1.add(trCylinderVolume, 2, 1, 2,1);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
