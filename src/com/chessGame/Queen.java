package com.chessGame;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    public Queen(boolean color){
        super(color);
    }


    @Override
    List<Tile> getMoves(ChessBoard chessBoard, int posX, int posY) {
        List<Tile> possibleMoves = new ArrayList<Tile>();



        return possibleMoves;
    }


}
