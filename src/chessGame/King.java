package chessGame;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {


    public King(int x, int y, boolean color) {
        super(x, y, color);
    }



    @Override
    List<Tile> getMoves(ChessBoard chessBoard) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        Tile tile = new Tile(x+1, y);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x-1, y);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x, y+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x, y-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x+1, y+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x-1, y-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x+1, y-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(x-1, y+1);
        checkMove(possibleMoves, tile, chessBoard);




        return possibleMoves;
    }


}
