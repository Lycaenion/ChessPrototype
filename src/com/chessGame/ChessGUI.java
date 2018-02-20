package com.chessGame;

import com.chessGame.Game;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.*;


public class ChessGUI extends Application {

    public static void main(String[] args) {
        try {
            launch(args);
            System.exit(0);
        } catch (Exception error) {
            error.printStackTrace();
            System.exit(0);
        }
    }

    public void start(Stage primaryStage) {
        Game game = new Game(new AI(), new AI());

        game.runGame();

        primaryStage.setTitle("Chess Showdown");
        BorderPane root = new BorderPane();
        Scene primaryScene = new Scene(root);
        primaryStage.setScene(primaryScene);
        primaryScene.getStylesheets().add("assets/stylesheet.css");

        GridPane grid = new GridPane();
        root.setCenter(grid); // expects GridPane


        Button button = new Button();
        //button.getStyleClass().add("chess-space");
        grid.add(button, 1, 0);
        button.setPrefHeight(100);


        primaryStage.show();
    }

}
