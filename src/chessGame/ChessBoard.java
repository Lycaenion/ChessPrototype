package chessGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChessBoard {
    private final int NUMBER_OF_ROWS = 8; // determined by x
    private final int NUMBER_OF_COLUMNS = 8; // determined by

    Piece[][] board;

    public ChessBoard() {
        board = new Piece[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];

        // Rooks
        board[0][0] = new Rook(0, 0, Piece.WHITE_COLOR);
        board[0][7] = new Rook(0, 7, Piece.WHITE_COLOR);
        board[7][0] = new Rook(7, 0, Piece.BLACK_COLOR);
        board[7][7] = new Rook(7, 7, Piece.BLACK_COLOR);

        // Knights
        board[0][1] = new Knight(0, 1, Piece.WHITE_COLOR);
        board[0][6] = new Knight(0, 6, Piece.WHITE_COLOR);
        board[7][1] = new Knight(7, 1, Piece.BLACK_COLOR);
        board[7][6] = new Knight(7, 6, Piece.BLACK_COLOR);

        //Bishops
        board[0][2] = new Bishop(0, 2, Piece.WHITE_COLOR);
        board[0][5] = new Bishop(0, 5, Piece.WHITE_COLOR);
        board[7][2] = new Bishop(7, 2, Piece.BLACK_COLOR);
        board[7][5] = new Bishop(7, 5, Piece.BLACK_COLOR);

        //Queens
        board[0][3] = new Queen(0, 3, Piece.WHITE_COLOR);
        board[7][3] = new Queen(7, 3, Piece.BLACK_COLOR);

        //Kings
        board[0][4] = new King(0, 4, Piece.WHITE_COLOR);
        board[7][4] = new King(7, 4, Piece.BLACK_COLOR);

        //Pawns
        for (int column = 0; column < NUMBER_OF_COLUMNS; column++) {
            board[1][column] = new Pawn(1, column, Piece.WHITE_COLOR);
            board[6][column] = new Pawn(6, column, Piece.BLACK_COLOR);
        }


        getMovablePieces(Piece.WHITE_COLOR).stream()
                .forEach(piece -> System.out.println(piece));

    }

    public List<Piece> toList(){
        List<Piece> pieces = new ArrayList<Piece>();
        for (Piece[] array : board) {
            pieces.addAll(Arrays.asList(array));
        }
        return pieces;
    }

    public List<Piece> getMovablePieces(boolean color){
        return toList().stream()
                .filter(piece -> piece != null)
                .filter(piece -> piece.color == color)
                .filter(piece -> !piece.getMoves(this).isEmpty())
                .collect(Collectors.toList());
    }
}
