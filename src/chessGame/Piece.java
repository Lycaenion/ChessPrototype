package chessGame;

import javafx.scene.image.Image;

import java.util.List;

abstract class Piece {
    public static final boolean WHITE_COLOR = true;
    public static final boolean BLACK_COLOR = false;
    protected int x;
    protected int y;
    public boolean color;
    Image image;

    public Piece(int x, int y, boolean color) {
        this.x = x;
        this.y = y;
        this.color = color;
        String location = "chessImages/";
        String filename = getColor(this.color) + "_" + this.getClass().getSimpleName() + ".png";
        this.image = new Image(location + filename);
    }

    public String getColor(boolean color){
        if(color){
            return "white";
        }else{
            return "black";
        }
    }

    abstract List<Tile> getMoves(ChessBoard chessBoard);

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
