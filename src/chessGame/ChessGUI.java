package chessGame;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.*;


public class ChessGUI extends Application {
    Stage primaryStage;

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
        this.primaryStage = primaryStage;
        Game game = new Game(new AI(), new AI());
        ChessGUI gui = new ChessGUI();

        game.runGame(this);
    }

    public void printBoard(){
        primaryStage.setTitle("Chess Showdown");
        BorderPane root = new BorderPane();
        Scene primaryScene = new Scene(root);
        primaryStage.setScene(primaryScene);
        primaryScene.getStylesheets().add("chessGame/stylesheet.css");

        GridPane grid = new GridPane();
        root.setCenter(grid); // expects GridPane
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                Button button = new Button();
                button.getStyleClass().add("chess-space");
                if((i+j)%2 == 0){
                    button.getStyleClass().add("chess-space-light");
                }else{
                    button.getStyleClass().add("chess-space-dark");
                }
                grid.add(button, i, j);
            }
        }
        primaryStage.show();
    }

}
