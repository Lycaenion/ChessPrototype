package chessGame;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Game {

    ChessBoard chessBoard;
    Player playerOne; //always white
    Player playerTwo; //always black

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.chessBoard = new ChessBoard();
    }

    public void runGame(ChessGUI gui) {
        gui.printBoard();
//        while(true){
//            playerOne.doMove(chessBoard);
//            playerTwo.doMove(chessBoard);
//        }
    }


}
