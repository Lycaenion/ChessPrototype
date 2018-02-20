package chessGame;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(int x, int y, boolean color){
        super(x, y, color);
    }

    @Override
    List<Tile> getMoves(ChessBoard chessBoard) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        Tile tile;
        if(color){
            tile = new Tile(x+1, y);
        }else {
            tile = new Tile(x-1, y);
        }
        checkMove(possibleMoves, tile, chessBoard);


        return possibleMoves;
    }

}
