package com.chessGame;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(boolean color) {
        super(color);
    }



    @Override
    List<Tile> getMoves(ChessBoard chessBoard, int posX, int posY) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        Tile tile = new Tile(posX+2, posY+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX+2, posY-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX-2, posY+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX-2, posY-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX+1, posY+2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX+1, posY-2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX-1, posY+2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(posX-1, posY-2);
        checkMove(possibleMoves, tile, chessBoard);

        return possibleMoves;

    }
}
