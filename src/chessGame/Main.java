package chessGame;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new AI(), new AI());

        game.runGame();

    }
}
