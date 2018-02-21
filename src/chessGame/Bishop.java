package chessGame;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    public Bishop(int x, int y, boolean color) {
        super(x, y, color);
    }



    @SuppressWarnings("Duplicates")
    @Override
    List<Tile> getMoves(ChessBoard chessBoard) {
       List<Tile> possibleMoves = new ArrayList<Tile>();

        for (int i = 1; i < 8; i++){
            Tile tile = new Tile(x+i, y+i);
            checkMove(possibleMoves, tile, chessBoard);

            if(outOfBounds(x+i, y+i)){
                break;
            }

            Piece pieceToCheck = chessBoard.board[x+i][y+i];
            if(pieceToCheck != null) {
                break;
            }
        }

        for (int i = 1; i < 8; i++){
            Tile tile = new Tile(x-i, y-i);
            checkMove(possibleMoves, tile, chessBoard);

            if(outOfBounds(x-i, y-i)){
                break;
            }
            Piece pieceToCheck = chessBoard.board[x-i][y-i];
            if(pieceToCheck != null) {
                break;
            }
        }

        for (int i = 1; i < 8; i++){
            Tile tile = new Tile(x+i, y-i);
            checkMove(possibleMoves, tile, chessBoard);

            if(outOfBounds(x+i, y-i)){
                break;
            }

            Piece pieceToCheck = chessBoard.board[x+i][y-i];
            if(pieceToCheck != null) {
                break;
            }
        }

        for (int i = 1; i < 8; i++){
            Tile tile = new Tile(x-i, y+i);
            checkMove(possibleMoves, tile, chessBoard);

            if(outOfBounds(x-i, y+i)){
                break;
            }

            Piece pieceToCheck = chessBoard.board[x-i][y+i];
            if(pieceToCheck != null) {
                break;
            }
        }

        return possibleMoves;
    }

}
