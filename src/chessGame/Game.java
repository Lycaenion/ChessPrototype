package chessGame;

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
//        gui.printBoard();
//        while (true) {
//            playerOne.doMove(white);
//            printBoard;
//            playerTwo.doMove(black);
//            printBoard;
//        }
    }


}
