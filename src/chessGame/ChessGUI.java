package chessGame;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

public class ChessGUI extends Application {
    Stage primaryStage;
    Button[][] buttons = new Button[ChessBoard.NUMBER_OF_ROWS][ChessBoard.NUMBER_OF_COLUMNS];

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
        primaryStage.setTitle("Chess Showdown");

        BorderPane root = new BorderPane();
        Scene primaryScene = new Scene(root);
        primaryStage.setScene(primaryScene);
        primaryScene.getStylesheets().add("chessGame/stylesheet.css");
        this.primaryStage = primaryStage;
        GridPane grid = new GridPane();
        root.setCenter(grid); // expects GridPane

        for (int row = 0; row < ChessBoard.NUMBER_OF_ROWS; row++){
            for (int column = 0; column < ChessBoard.NUMBER_OF_COLUMNS; column++){
                this.buttons[row][column] = new Button();
                buttons[row][column].getStyleClass().add("chess-space");
                if((row+column)%2 == 0){
                    buttons[row][column].getStyleClass().add("chess-space-light");
                }else{
                    buttons[row][column].getStyleClass().add("chess-space-dark");
                }
                grid.add(buttons[row][column], row, column);
            }
        }
        primaryStage.show();

        Game game = new Game(new AI(), new AI());

        game.runGame(this);
    }

    public void printBoard(ChessBoard chessBoard){
        for (int row = 0; row < ChessBoard.NUMBER_OF_ROWS; row++){
            for (int column = 0; column < ChessBoard.NUMBER_OF_COLUMNS; column++){
                if (chessBoard.board[column][row] != null)
                    buttons[row][column].setGraphic(new ImageView(chessBoard.board[column][row].image));
                else
                    buttons[row][column].setGraphic(new ImageView());
            }
        }
    }
}
