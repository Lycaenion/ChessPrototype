package chessGame;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(boolean color){
        super(color);
    }

    @Override
    List<Tile> getMoves(ChessBoard chessBoard, int posX, int posY) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        return possibleMoves;
    }

}
