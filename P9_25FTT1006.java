import java.util.Scanner;

public class P9_25FTT1006 {
    public static void main(String[] args) {
        // 9.1 - ProductRating.java
        // 9.2 - GradeMCQ.java
        // 9.3 - TicTacToeWithComputer.java
    }

        public static void ProductRating() {

        /*
        9.1 – ProductRating.java

        PURPOSE:
        This program stores customer product ratings in a 2D array and calculates
        the average rating per criterion (Product, Packaging, Delivery) and
        the average rating per customer, all displayed to 2 decimal places.
        
        HOW IT WORKS:
        - A 4x3 two-dimensional integer array holds ratings for 4 customers across 3 criteria.
        - A column loop calculates the average for each criterion by summing
            down each column and dividing by the number of customers.
        - A row loop calculates the average for each customer by summing
            across each row and dividing by the number of criteria.
        - All averages are printed using %.2f to enforce 2 decimal places.
        */

        // 2D integer array: rows = customers, columns = criteria (Product, Packaging, Delivery)
        int[][] ratings = {
            {4, 5, 4}, // Customer 1
            {3, 5, 3}, // Customer 2
            {4, 5, 3}, // Customer 3
            {1, 2, 1} // Customer 4
        };

        int numCustomers = ratings.length; // 4 rows
        int numCriteria  = ratings[0].length; // 3 columns

        // Display header
        System.out.println("Rating\t\tProduct\tPackage\tDelivery");

        // Calculate and display average per criterion (column traversal)
        System.out.print("Average\t\t");
        for (int col = 0; col < numCriteria; col++) {
            double sum = 0;
            for (int row = 0; row < numCustomers; row++) {
                sum += ratings[row][col];
            }
            double avg = sum / numCustomers;
            System.out.printf("%.2f\t", avg); // %.2f without %n keeps output on same line
        }
        System.out.println();   // move to next line after averages row
        System.out.println();

        // Calculate and display average per customer (row traversal)
        for (int row = 0; row < numCustomers; row++) {
            double sum = 0;
            for (int col = 0; col < numCriteria; col++) {
                sum += ratings[row][col];
            }
            double avg = sum / numCriteria;
            System.out.printf("Customer %d provide the average rating %.2f%n", row + 1, avg);
        }
    }

    public static void GradeMCQ() {

        /*
        PURPOSE:
        This program grades a 6-question MCQ test for 4 students. The lecturer
        enters the answer key, and the program compares each student's answers
        against the key, counts correct answers, and reports pass or fail.
        
        HOW IT WORKS:
        - A 4x6 two-dimensional char array stores pre-set student answers.
        - A Scanner reads the lecturer's key as a single String; a for loop with
            charAt() extracts each character into a 1D char key array.
        - A nested loop iterates over every student (outer) and every question
            (inner), incrementing a counter each time the answer matches the key.
        - A ternary operator decides "passed" or "failed" based on whether the
            correct count is >= 4 (majority correct out of 6).
        - Results are printed per student using printf for consistent formatting.
        */

        // 2D char array: rows = students, columns = answers to Q1-Q6
        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},  // Student 0
            {'C', 'D', 'D', 'A', 'B', 'D'},  // Student 1
            {'D', 'D', 'A', 'B', 'B', 'A'},  // Student 2
            {'C', 'A', 'D', 'A', 'B', 'C'}   // Student 3
        };

        int numStudents  = answers.length; // 4
        int numQuestions = answers[0].length; // 6

        // Read answer key from lecturer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the key to the MCQ: ");
        String keyInput = input.nextLine().replaceAll("\\s+", ""); // remove spaces e.g. "C D D B B A" -> "CDDBBA"

        char[] key = new char[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            key[i] = keyInput.charAt(i); // extract each character using charAt()
        }

        System.out.println();

        // Grade each student
        for (int student = 0; student < numStudents; student++) {
            int correctCount = 0;

            for (int q = 0; q < numQuestions; q++) {
                if (answers[student][q] == key[q]) {
                    correctCount++; // increment counter on correct match
                }
            }

            // Ternary operator: pass if 4 or more correct
            String result = (correctCount >= 4) ? "passed" : "failed";

            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.%n",
                              student, correctCount, result);
        }
    }

    static char[][] board = new char[3][3];  // 3x3 game board
    public static void TicTacToeWithComputer() {
        /*
        PURPOSE:
        This program implements a Tic-tac-toe game where the human player (X) goes
        first and a computer opponent (O) plays second by choosing a random empty
        cell using Math.random(). The game ends when a player wins or the board is full.
        
        HOW IT WORKS:
        - A 3x3 two-dimensional char array represents the board, initialized with spaces.
        - printBoard() loops through the array to display the current board state
            with '|' column separators and "---------" row dividers.
        - checkWin(char) checks all 3 rows, 3 columns, and 2 diagonals for three
            matching symbols, returning true if the given player has won.
        - isBoardFull() scans the entire board for any remaining empty cell.
        - On each turn the player enters a row and column; the computer randomly
            picks row and column values (0-2) via Math.random(), retrying until it
            finds an empty cell.
        - The main game loop alternates turns until checkWin() or isBoardFull()
            returns true, then prints the final result and board.
        */

        Scanner input = new Scanner(System.in);

        // Initialise every cell to a space character
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';

        printBoard();

        // Main game loop — alternates: Player then Computer
        while (true) {

            // Player's turn (X)
            System.out.println("Player's turn");
            int pRow, pCol;

            // Keep asking until the player chooses an empty cell
            while (true) {
                System.out.print("Enter a row (0,1 or 2): ");
                pRow = input.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                pCol = input.nextInt();
                if (board[pRow][pCol] == ' ') {
                    board[pRow][pCol] = 'X';
                    break;
                } else {
                    System.out.println("Cell already taken. Try again.");
                }
            }

            // Check if player wins immediately after placing X
            if (checkWin('X')) {
                System.out.println("Game ended, Player Win");
                printBoard();
                break;
            }
            if (isBoardFull()) {
                System.out.println("Game ended, Draw");
                printBoard();
                break;
            }

            // Computer's turn (O)
            int cRow, cCol;
            // Randomly pick an empty cell using Math.random()
            do {
                cRow = (int) (Math.random() * 3);   // 0, 1, or 2
                cCol = (int) (Math.random() * 3);
            } while (board[cRow][cCol] != ' ');

            board[cRow][cCol] = 'O';
            printBoard();

            // Check if computer wins
            if (checkWin('O')) {
                System.out.println("Game ended, CPU Win");
                printBoard();
                break;
            }
            if (isBoardFull()) {
                System.out.println("Game ended, Draw");
                printBoard();
                break;
            }
        }
    }

    // Prints the current board state
    static void printBoard() {
        for (int r = 0; r < 3; r++) {
            System.out.println(" " + board[r][0] + " | " + board[r][1] + " | " + board[r][2]);
            if (r < 2) System.out.println("-----------");
        }
        System.out.println();
    }

    // Returns true if the given symbol has three in a row
    static boolean checkWin(char symbol) {
        // Check all 3 rows
        for (int r = 0; r < 3; r++)
            if (board[r][0] == symbol && board[r][1] == symbol && board[r][2] == symbol)
                return true;

        // Check all 3 columns
        for (int c = 0; c < 3; c++)
            if (board[0][c] == symbol && board[1][c] == symbol && board[2][c] == symbol)
                return true;

        // Check main diagonal (top-left to bottom-right)
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        // Check anti-diagonal (top-right to bottom-left)
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    // Returns true when no empty cells remain
    static boolean isBoardFull() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == ' ') return false;
        return true;
    }

}
