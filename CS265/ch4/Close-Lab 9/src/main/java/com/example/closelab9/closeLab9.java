package com.example.closelab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class closeLab9 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        Text loanAmtText = new Text("Loan Amount: ");
        Text loanYrsText = new Text(" Number of Years: ");
        TextField loanAmt = new TextField();
        TextField loanYrs = new TextField();
        Button button = new Button("Show Table");
        gridPane.add(loanAmtText, 0, 0, 1, 1);
        gridPane.add(loanAmt, 1, 0, 1, 1);
        gridPane.add(loanYrsText, 2, 0, 1, 1);
        gridPane.add(loanYrs, 3, 0, 1, 1);
        gridPane.add(button, 4, 0, 1, 1);
        Scene scene = new Scene(gridPane, 1000, 1000);
        stage.setTitle("Interest Rate");
        stage.setScene(scene);
        stage.show();

        button.setOnAction(e -> {
            String loanText = loanAmt.getText();
            String yearsText = loanYrs.getText();
            double loan = Double.parseDouble(loanText);
            double years = Double.parseDouble(yearsText);
//            Text interestRate = new Text("Interest Rate ");
//            Text monthlyPaymentText = new Text("Monthly Payment ");
//            Text interestPaymentText = new Text("Interest Payment ");
            TextArea area = new TextArea();
            area.setPrefColumnCount(25);
            area.setPrefRowCount(30);
            StringBuilder str = new StringBuilder();
            str.append("Interest Rate\tMonthly Payment\tInterest Payment\n");

//            gridPane.add(interestRate, 0, 1, 1, 1);
//            gridPane.add(monthlyPaymentText, 2, 1, 1 , 1);
//            gridPane.add(interestPaymentText, 4, 1, 1, 1);
//            int count = 2;
            for (double i = 5; i < 8.125; i+=0.125) {
//                Text t1 = new Text(i + "");
//                gridPane.add(t1, 0, count, 1, 1);
                double numMonths = years * 12;
                double monthlyPayment = ((loan/numMonths) * (1.0 + (i/100)));
                double interestPayment = (monthlyPayment * (numMonths));
                str.append(String.format("%.3f\t\t\t%.2f\t\t\t\t%.2f\n", i, monthlyPayment, interestPayment));
//                Text t2 = new Text(String.format("%.2f", monthlyPayment));
//                Text t3 = new Text(String.format("%.2f", interestPayment));
//                gridPane.add(t2, 2, count, 1, 1);
//                gridPane.add(t3, 4, count, 1, 1);
//                count++;
            }
            area.setText(str.toString());
            area.setEditable(false);
            gridPane.add(area, 0, 1, 3, 1);
        });

    }

    public static void main(String[] args) {
        launch();
    }
}