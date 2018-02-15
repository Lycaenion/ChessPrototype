package chessGame;

public class Game {

    ChessBoard chessBoard;
    Player playerOne; //always white
    Player playerTwo; //always black

    public Game(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.chessBoard = new ChessBoard();
    }

    void runGame(){
        while(true){
            playerOne.doMove(chessBoard);
            playerTwo.doMove(chessBoard);
        }
    }

}
