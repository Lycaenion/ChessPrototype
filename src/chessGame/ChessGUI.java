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

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                this.buttons[i][j] = new Button();
                buttons[i][j].getStyleClass().add("chess-space");
                if((i+j)%2 == 0){
                    buttons[i][j].getStyleClass().add("chess-space-light");
                }else{
                    buttons[i][j].getStyleClass().add("chess-space-dark");
                }
                grid.add(buttons[i][j], i, j);
            }
        }
        primaryStage.show();

        Game game = new Game(new AI(), new AI());

        game.runGame(this);
    }

    public void printBoard(ChessBoard chessBoard){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (chessBoard.board[i][j] != null)
                    buttons[i][j].setGraphic( new ImageView (chessBoard.board[i][j].image));
                else
                    buttons[i][j].setGraphic( new ImageView() );
            }
        }

    }

}
