//package com.example.closelab8;
//
//import javafx.application.*;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.*;
//import javafx.geometry.Pos;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.SubScene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Text;
//import javafx.stage.*;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.EventListener;
//
//public class cLab8 extends Application {
//
//    @Override
//    public void start(Stage stage) throws IOException {
////        Button button1 = new Button("Button 1");
////        Button button2 = new Button("Button 2");
////        Button button3 = new Button("Button 3");
////        Button button4 = new Button("Button 4");
////        Button button5 = new Button("Button 5");
////        Button button6 = new Button("Button 6");
//
//        GridPane gridPane = new GridPane();
//        GridPane gridPane2 = new GridPane();
//
////        gridPane.add(button1, 0, 0, 1, 1);
////        gridPane.add(button2, 1, 0, 1, 1);
////        gridPane.add(button3, 2, 0, 1, 1);
////        gridPane.add(button4, 0, 1, 1, 1);
////        gridPane.add(button5, 1, 1, 1, 1);
////        gridPane.add(button6, 2, 1, 1, 1);
//
//        for (int i = 0; i < 6; i++) {
//            if (i < 3){
//                gridPane.add(new Button(String.format("Button%d", i + 1)), (i), 0, 1, 1);
//            }else
//                gridPane.add(new Button(String.format("Button%d", i + 1)), (i%3), 1, 1, 1);
//        }
//
//        for (int i = 0; i < 6; i++) {
//            if (i < 3){
//                gridPane2.add(new Button(String.format("Button%d", i + 7)), (i), 0, 1, 1);
//            }else
//                gridPane2.add(new Button(String.format("Button%d", i + 7)), (i%3), 1, 1, 1);
//        }
//
//        GridPane grid = new GridPane();
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                actiontarget.setFill(Color.FIREBRICK);
//                actiontarget.setText("Sign in button pressed");
//            }
//        });
//
//        btn.setOnAction(e->{
//            actiontarget.setFill(Color.FIREBRICK);
//            actiontarget.setText("Sign in button pressed");
//        })
//
//
//
////        FXMLLoader fxmlLoader = new FXMLLoader(cLab8.class.getResource("hello-view.fxml"));
//        Scene sceneG = new Scene(grid, 320, 240);
//        stage.setScene(sceneG);
//        stage.show();
//        /*
//        Scene scene = new Scene(gridPane, 320, 240);
//        stage.setTitle("Grid");
//        stage.setScene(scene);
//        stage.show();
//        Scene scene2 = new Scene(gridPane2, 320, 240);
//        stage.setScene(scene2);
//        stage.show();
//         */
//
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//
//}
