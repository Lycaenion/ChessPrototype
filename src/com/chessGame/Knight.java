package com.chessGame;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    List<Tile> getMoves(ChessBoard chessBoard) {
        List<Tile> possibleMoves = new ArrayList<Tile>();

        // creates a tile with the desired coordinates and checks whether it is free or not, if so it gets added to
        // possibleMoves list

        Tile tile = new Tile(this.x+2, this.y+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x+2, this.y-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x-2, this.y+1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x-2, this.y-1);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x+1, this.y+2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x+1, this.y-2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x-1, this.y+2);
        checkMove(possibleMoves, tile, chessBoard);

        tile = new Tile(this.x-1, this.y-2);
        checkMove(possibleMoves, tile, chessBoard);

        return possibleMoves;

    }
}
