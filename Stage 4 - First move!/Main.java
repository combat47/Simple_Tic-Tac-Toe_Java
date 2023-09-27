package tictactoe;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stage 3: User Input for initial board state
        System.out.print("Enter the initial board state: ");
        String input = scanner.nextLine();

        // Create a 3x3 array to hold the board state
        char[][] board = new char[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = input.charAt(index++);
            }
        }

        // Display the board
        printBoard(board);

        // Stage 4: User's Turn
        while (true) {
            System.out.print("Enter the coordinates: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 1 || x > 3 || y < 1 || y > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (board[x - 1][y - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                board[x - 1][y - 1] = 'X';
                break;
            }
        }

        // Display the updated board
        printBoard(board);
    }
    private static void printBoard(char[][] board) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
