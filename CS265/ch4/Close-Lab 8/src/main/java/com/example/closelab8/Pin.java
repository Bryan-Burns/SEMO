/*
Author: Bryan Burns
Last Updated March 3, 2022
Purpose: To display a multistage program about Zodiac signs and their basic descriptions.
 */

package com.example.closelab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Pin extends Application {
    @Override
    public void start(Stage stage) {
        final ArrayList[] enteredPin = new ArrayList[]{new ArrayList<>(4)};
        String correctPin = "5872";
        GridPane g1 = new GridPane();
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button enterButton = new Button("Enter");
        Button backButton = new Button("Back");

        Text t1 = new Text("Enter your 4 digit pin.");

        g1.add(t1, 1, 0, 3, 1);
        g1.addRow(2, button1, button2, button3);
        g1.addRow(3, button4, button5, button6);
        g1.addRow(4, button7, button8, button9);
        g1.add(button0, 1, 5, 1, 1);
        g1.add(enterButton, 2, 5, 2, 1);

        Scene scene1 = new Scene(g1, 500, 240);
        stage.setTitle("Pin");
        stage.setScene(scene1);
        stage.show();

        button1.setOnAction(e -> enteredPin[0].add(1));

        button2.setOnAction(e -> enteredPin[0].add(2));

        button3.setOnAction(e -> enteredPin[0].add(3));

        button4.setOnAction(e -> enteredPin[0].add(4));

        button5.setOnAction(e -> enteredPin[0].add(5));

        button6.setOnAction(e -> enteredPin[0].add(6));

        button7.setOnAction(e -> enteredPin[0].add(7));

        button8.setOnAction(e -> enteredPin[0].add(8));

        button9.setOnAction(e -> enteredPin[0].add(9));

        button0.setOnAction(e -> enteredPin[0].add(0));

        enterButton.setOnAction(e -> {
            Text correctText = new Text("Correct pin.");
            Text incorrectText = new Text("Incorrect pin.");
            GridPane g2 = new GridPane();
            StringBuilder pin = new StringBuilder();
            for (int i = 0; i < 4; i++){
                pin.append(enteredPin[0].get(i));
            }
            if (pin.toString().equals(correctPin)){
                g2.add(correctText, 1, 0, 2, 1);
            }
            else {
                g2.add(incorrectText, 0, 0, 2, 3);
                g2.add(backButton, 0, 4, 1, 1);
            }

            Scene scene2 = new Scene(g2, 300, 240);
            stage.setScene(scene2);
        });

        backButton.setOnAction(e -> {
            stage.setScene(scene1);
            enteredPin[0] = new ArrayList<>(4);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}