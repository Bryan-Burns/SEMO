package com.example.project2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class project2 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        Text interestAmtText = new Text(" Investment Amount: ");
        Text yearsText = new Text(" Years: ");
        Text annualInterestRateText = new Text(" Annual Interest Rate: ");
        Text futureValueText = new Text(" Future Value: ");
        TextField interestAmt = new TextField();
        TextField interestYrs = new TextField();
        TextField annualInterestRate = new TextField();
        TextField futureValue = new TextField();
        Button calculateButton = new Button("Calculate");
        gridPane.add(interestAmtText, 0, 0, 1, 1);
        gridPane.add(yearsText, 0, 1, 1, 1);
        gridPane.add(annualInterestRateText, 0, 2, 1, 1);
        gridPane.add(interestAmt, 1, 0, 1, 1);
        gridPane.add(interestYrs, 1, 1, 1, 1);
        gridPane.add(annualInterestRate, 1, 2, 1, 1);
        gridPane.add(calculateButton, 1, 4, 1, 1);
        Scene scene = new Scene(gridPane, 300, 240);
        stage.setTitle("Investment");
        stage.setScene(scene);
        stage.show();

        calculateButton.setOnAction(e -> {
            double interestAmount = Double.parseDouble(interestAmt.getText());
            int years = Integer.parseInt(interestYrs.getText());
            double interestRate = Double.parseDouble(annualInterestRate.getText());
            futureValue.setText(calculateInterest(interestAmount, years, interestRate) + "");
            gridPane.add(futureValueText, 0, 3, 1, 1);
            gridPane.add(futureValue, 1, 3, 1, 1);
        });

    }

    private double calculateInterest(double principal, int years, double annualInterestRate) {
        return (principal * Math.pow(1 + annualInterestRate/1200, years * 12));
    }

    public static void main(String[] args) {
        launch();
    }
}