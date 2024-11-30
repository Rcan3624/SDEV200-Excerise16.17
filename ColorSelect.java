package com.example.exercise1617;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ColorSelect extends Application {

    // Apologies, I had to abandon this exercise as my ATM Project is of the utmost importance. // Thank Ivy Tech's 8-Week class policy.

// TODO Seek out the Oracle(Pun intended) James Gosling and learn the art of Java Programming

    // The slider bar originally in the scrollbar demo has been modified for allowing up to four values which will be for the colors
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Slider colorSlider = new Slider();
        colorSlider.setOrientation(Orientation.VERTICAL);
        colorSlider.setShowTickLabels(true);
        colorSlider.setShowTickMarks(true);
        colorSlider.setValue(4);

        // Placeholder until I can figure out what to do with the text declaration on line 47
        Text text = new Text(20, 20, "Hi there, I have no purpose");

//
//       ScrollBar sbHorizontal = new ScrollBar();
//       ScrollBar sbVertical = new ScrollBar();
//       sbVertical.setOrientation(Orientation.VERTICAL);

//        //Create a text in a pane
//        Pane paneForText = new Pane();
//        paneForText.getChildren().add(text);
//
//        // Create a border pane to hold text and scroll bars
//        BorderPane pane = new BorderPane();
//        pane.setCenter(paneForText);
//        pane.setBottom(sbHorizontal);
//        pane.setRight(sbVertical);


        // TODO figure out how to replace integers in vertical sliders and implement the colors

        // Listener for vertical scroll bar value change
        colorSlider.valueProperty().addListener(ov ->
                text.setY(colorSlider.getValue() * colorSlider.getHeight() /
                        colorSlider.getMax()));



        // Create a scene and place it in the stage
        Scene scene = new Scene(colorSlider, 450, 170);
        primaryStage.setTitle("Exercise 16.17"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }


}

