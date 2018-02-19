package com.chessGame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {
    private final int NUMBER_OF_ROWS = 8; // determined by x
    private final int NUMBER_OF_COLUMNS = 8; // determined by

    Piece[][] board;

    public ChessBoard() {
        board = new Piece[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
        chessGUI.ChessBoard GUIBoard = new chessGUI.ChessBoard();

        // Rooks
        board[0][0] = new Rook(Piece.WHITE_COLOR);
        board[0][7] = new Rook(Piece.WHITE_COLOR);
        board[7][0] = new Rook(Piece.BLACK_COLOR);
        board[7][7] = new Rook(Piece.BLACK_COLOR);

        // Knights
        board[0][1] = new Knight(Piece.WHITE_COLOR);
        board[0][6] = new Knight(Piece.WHITE_COLOR);
        board[7][1] = new Knight(Piece.BLACK_COLOR);
        board[7][6] = new Knight(Piece.BLACK_COLOR);

        //Bishops
        board[0][2] = new Bishop(Piece.WHITE_COLOR);
        board[0][5] = new Bishop(Piece.WHITE_COLOR);
        board[7][2] = new Bishop(Piece.BLACK_COLOR);
        board[7][5] = new Bishop(Piece.BLACK_COLOR);

        //Queens
        board[0][3] = new Queen(Piece.WHITE_COLOR);
        board[7][3] = new Queen(Piece.BLACK_COLOR);

        //Kings
        board[0][4] = new King(Piece.WHITE_COLOR);
        board[7][4] = new King(Piece.BLACK_COLOR);

        //Pawns
        for (int column = 0; column < NUMBER_OF_COLUMNS; column++) {
            board[1][column] = new Pawn(Piece.WHITE_COLOR);
            board[6][column] = new Pawn(Piece.BLACK_COLOR);
        }


        this.toList().stream()
                .filter(p -> p != null)
                .map(p -> p.getClass().getSimpleName())
                .forEach(System.out::println);

    }

    public List<Piece> toList(){
        List<Piece> piecesAlive = new ArrayList<Piece>();
        for (Piece[] array : board) {
            piecesAlive.addAll(Arrays.asList(array));
        }
        return piecesAlive;
    }

    public List<Piece> getMovablePieces(boolean color){
        List<Piece> movablePieces = new ArrayList<Piece>();

        toList().stream()
                .filter(piece -> piece != null)
                .filter(piece -> piece.color == color)
                .filter(piece -> piece.getMoves().isEmpty() == false)



        return movablePieces;
    }
}
