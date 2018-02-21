package chessGame;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(int x, int y, boolean color) {
        super(x, y, color);
    }



    @SuppressWarnings("Duplicates")
    @Override
    List<Tile> getMoves(ChessBoard chessBoard) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        for (int i = x+1; i < 8; i++){
            Tile tile = new Tile(i, y);
            checkMove(possibleMoves, tile, chessBoard);

            Piece pieceToCheck = chessBoard.board[i][y];
            if(pieceToCheck != null){
                break;
            }
        }

        for (int i = x-1; i > 0; i--){
            Tile tile = new Tile(i, y);
            checkMove(possibleMoves, tile, chessBoard);

            Piece pieceToCheck = chessBoard.board[i][y];
            if(pieceToCheck != null){
                break;
            }
        }

        for (int i = y+1 ; i < 8; i++){
            Tile tile = new Tile(x, i);
            checkMove(possibleMoves, tile, chessBoard);

            Piece pieceToCheck = chessBoard.board[x][i];
            if(pieceToCheck != null){
                break;
            }
        }

        for (int i = y-1; i > 0; i--){
            Tile tile = new Tile(x, i);
            checkMove(possibleMoves, tile, chessBoard);

            Piece pieceToCheck = chessBoard.board[x][i];
            if(pieceToCheck != null){
                break;
            }
        }

        return possibleMoves;
    }

}
