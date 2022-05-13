/*
Author: Bryan Burns
Last Updated March 3, 2022
Purpose: To display a multistage program about Zodiac signs and their basic descriptions.
 */

package com.example.closelab8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static javafx.geometry.Pos.TOP_CENTER;

public class closeLab8 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane g1 = new GridPane();
        Button buttonAries = new Button("Aries");
        Button buttonTaurus = new Button("Taurus");
        Button buttonGemini = new Button("Gemini");
        Button buttonCancer = new Button("Cancer");
        Button buttonLeo = new Button("Leo");
        Button buttonVirgo = new Button("Virgo");
        Button buttonLibra = new Button("Libra");
        Button buttonScorpio = new Button("Scorpio");
        Button buttonSagittarius = new Button("Sagittarius");
        Button buttonCapricorn = new Button("Capricorn");
        Button buttonAquarius = new Button("Aquarius");
        Button buttonPisces = new Button("Pisces");

        Text t1 = new Text("Please Choose You're Zodiac Sign.");

        g1.add(t1, 1, 0, 3, 1);
        g1.addRow(2, buttonAries, buttonTaurus, buttonGemini);
        g1.addRow(3, buttonCancer, buttonLeo, buttonVirgo);
        g1.addRow(4, buttonLibra, buttonScorpio, buttonSagittarius);
        g1.addRow(5, buttonCapricorn, buttonAquarius, buttonPisces);

        Scene scene1 = new Scene(g1, 500, 240);
        stage.setTitle("Zodiac Signs");
        stage.setScene(scene1);
        stage.show();

        buttonAries.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Like their fellow fire signs, Leo and Sagittarius, Aries is a passionate," +
                        "\n" +
                        " motivated, and confident leader who builds community with their cheerful disposition and " +
                        "\n" +
                        "relentless determination. Uncomplicated and direct in their approach, they often get " +
                        "\n" +
                        "frustrated by exhaustive details and unnecessary nuances.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Aries");
                stage.setScene(scene2);
            }
        });

        buttonTaurus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Taurus is an earth sign represented by the bull. Like their celestial " +
                        "\n" +
                        "spirit animal, Taureans enjoy relaxing in serene, bucolic environments, surrounded by soft " +
                        "\n" +
                        "sounds, soothing aromas, and succulent flavors. Taurus is ruled by Venus, the enchanting " +
                        "\n" +
                        "planet that governs love, beauty, and money.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Taurus");
                stage.setScene(scene2);
            }
        });

        buttonGemini.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Geminis are volatile beings that are inquisitive, intelligent, and great" +
                        "\n" +
                        " thinkers. They tend to remain in one location. They are highly competent who can quickly" +
                        "\n" +
                        " persuade others to accept their own thoughts and beliefs.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Gemini");
                stage.setScene(scene2);
            }
        });

        buttonCancer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Cancer is ruled by the moon, the celestial body that represents comfort," +
                        "\n" +
                        " self-care, and maternal energies. Accordingly, Cancers tend to be domestically oriented." +
                        "\n" +
                        " They love to create cozy, safe spaces that serve as their personal sanctuaries, then spend" +
                        "\n" +
                        " lots of time in them.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Cancer");
                stage.setScene(scene2);
            }
        });

        buttonLeo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Leo is represented by the lion, and these spirited fire signs are the kings" +
                        "\n" +
                        " and queens of the celestial jungle. They're delighted to embrace their royal status:" +
                        "\n" +
                        " Vivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate" +
                        "\n" +
                        " themselves.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Leo");
                stage.setScene(scene2);
            }
        });

        buttonVirgo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("On the appearance, Virgos are humble, self-effacing, industrious, and" +
                        "\n" +
                        " practical, but under the surface, they are frequently natural, kind, and sympathetic," +
                        "\n" +
                        " as befits their zodiac sign. Virgoans are methodical and quick thinkers, yet they have so" +
                        "\n" +
                        " much mental energy that they are frequently stressed and tense.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Virgo");
                stage.setScene(scene2);
            }
        });

        buttonLibra.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Libras are known for being charming, beautiful, and well-balanced. They" +
                        "\n" +
                        " thrive on making things orderly and aesthetically pleasing. They also crave balance," +
                        "\n" +
                        " and they can be equally as self-indulgent as they are generous.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Libra");
                stage.setScene(scene2);
            }
        });

        buttonScorpio.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Scorpios are extremely deep and emotional people, and are intense in all" +
                        "\n" +
                        " things they do. They're natural leaders and can be very serious; Scorpios are one of the" +
                        "\n" +
                        " most interesting signs because of their intensity, and there are some key Scorpio" +
                        "\n" +
                        " characteristics to be aware of that make them stand apart");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Scorpio");
                stage.setScene(scene2);
            }
        });

        buttonSagittarius.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("A Sagittarius values independence and the ability to do what they want," +
                        "\n" +
                        " when they want, above all else. They are adventurers, risk-takers," +
                        "\n" +
                        " and have a sharp business and sports mentality. Sagittarius natives are known for their" +
                        "\n" +
                        " emotional intelligence, which helps them to connect with others.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Sagittarius");
                stage.setScene(scene2);
            }
        });

        buttonCapricorn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Capricorns are the ultimate worker bees; they're ambitious, organized," +
                        "\n" +
                        " practical, goal-oriented, and they don't mind the hustle. “They're ready to give up a lot" +
                        "\n" +
                        " in order to achieve that goal,” Verk says. They also love making their own rules, which" +
                        "\n" +
                        " means they strive to reach high career positions.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Capricorn");
                stage.setScene(scene2);
            }
        });

        buttonAquarius.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Aquarius, the 11th zodiac sign, is symbolised by the Water Bearer, a" +
                        "\n" +
                        " symbol of the Gods bringing essential nutrients to the Earth. Aquarius people are" +
                        "\n" +
                        " advanced, self-reliant, clever, exceptional, and optimistic. Air is their elemental sign." +
                        "\n" +
                        " Aquarians, like air, lack a distinct form and appear to resist classification.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Aquarius");
                stage.setScene(scene2);
            }
        });

        buttonPisces.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Text text = new Text("Pisces people are known for being emotionally sensitive, gracious, and" +
                        "\n" +
                        " emotionally aware. Pisces characters are regarded for being among the most sympathetic" +
                        "\n" +
                        " of the zodiac signs, and they will go to great lengths to ensure the happiness of those" +
                        "\n" +
                        " around them. They're also creative and imaginative.");
                VBox vBox = new VBox(0, text);
                vBox.setAlignment(TOP_CENTER);
                Scene scene2 = new Scene(vBox, 500, 240);
                stage.setTitle("Pisces");
                stage.setScene(scene2);
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}