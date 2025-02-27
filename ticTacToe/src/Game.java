import java.util.*;

public class Game {
    private Board board;
    private Player player1, player2;
    private boolean player1Turn;
    private boolean gameWon;
    private int moves;

    Game(Player player1, Player player2) {
        this.board = new Board();

        this.player1 = player1;
        this.player2 = player2;

        this.player1Turn = true;
        this.gameWon = false;

        this.moves = 0;
    }

    void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameWon && moves < 9) {
            board.printBoard();

            Player currPlayer = player1Turn ? player1 : player2;
            System.out.print(currPlayer.getName() + " move: ");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (!board.makeMove(x, y, currPlayer.getSymbol())) {
                System.out.println("Invalid move! Input again.");
                continue;
            }

            moves++;

            if (board.checkWin(currPlayer.getSymbol())) {
                gameWon = true;
                board.printBoard();
                System.out.println(currPlayer.getName() + " wins!");
                return;
            }

            player1Turn = !player1Turn;
        }

        board.printBoard();
        System.out.println("Draw!");
    }
}
