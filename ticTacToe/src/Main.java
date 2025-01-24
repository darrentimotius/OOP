import java.util.*;

class ticTacToe {
    char[][] board = new char[3][3];
    char empty = '-';
    char player1 = 'O', player2 = 'X';

    int x, y;

    boolean player1Turn = true;
    boolean gameWon = false;
    int move = 0;

    void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = empty;
            }
        }
    }

    void printBoard() {
        for (char[] x : board) {
            for (char y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void inp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + (player1Turn ? "1" : "2") + " move: ");

        x = scanner.nextInt();
        y = scanner.nextInt();
    }

    boolean checkWin() {
        char symbol = player1Turn ? player1 : player2;

        // cek baris
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        // cek kolom
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        // cek diagonal
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    void boardLogic() {
        fillBoard();
        while (!gameWon && move <= 9) {
            printBoard();
            inp();
            
            if (x < 0 || x > 2 || y < 0 || y > 2 || board[y][x] != empty) {
                System.out.println("Invalid move! Input again.");
                continue;
            }
            
            board[y][x] = player1Turn ? player1 : player2;
            move++;

            if (checkWin()) {
                gameWon = true;
                printBoard();
                System.out.println("Player " + (player1Turn ? "1" : "2") + " wins!");
            } else {
                player1Turn = !player1Turn;
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("Draw!");
        }
    }
}


public class Main { 
    public static void main(String[] args) {
        ticTacToe ticTacToe = new ticTacToe();
        ticTacToe.boardLogic();
    }
}