package chessGame;

import java.util.List;

abstract class Piece {
    public static final boolean WHITE_COLOR = true;
    public static final boolean BLACK_COLOR = false;
    public boolean color;

    public Piece(boolean color){
        this.color = color;

    }
    abstract List<Tile> getMoves(ChessBoard chessBoard, int posX, int posY);

    static boolean outOfBounds(int x, int y){
        if(x > 7 || x < 0 || y > 7 || y < 0){
            return true;
        } else {
            return false;
        }
    }

    void checkMove(List<Tile> possibleMoves, Tile tile, ChessBoard chessBoard){
        if(!Piece.outOfBounds(tile.x, tile.y)){
            Piece pieceToCheck = chessBoard.board[tile.x][tile.y];
            if(pieceToCheck == null || pieceToCheck.color != this.color){
                possibleMoves.add(tile);
            }
        }

    }
}
