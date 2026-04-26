import java.util.Scanner;
import java.util.Arrays;

public class P8_25FTT1006 {
        public static void main(String[] args) {
            // 8.1 - PrintingAlternatingAlphabet.java
            // 8.2 – ShiftingElementByInput.java
            // 8.3 – NumberGuessing.java
            // 8.4 – AssigningGrade.java
            // 8.5 – EliminateDuplicate.java
        }

    public static void PrintingAlternatingAlphabet() {
        
        /*
            8.1 - PrintingAlternatingAlphabet.java

            PURPOSE:
            This program displays the alphabet alternating from both ends simultaneously using ONE String array and ONE for loop.
            
            HOW IT WORKS:
            - A String array of 26 elements is populated with "a" through "z".
            - One for loop is used with two counters declared in the initializer section:
            'i' starts at 0 and increments, and 'j' starts at 2 and decrements.
            - Each iteration prints array[i] then array[j], producing the alternating
            pattern. The loop runs 26 times total (i < 26), printing both halves
            of the alphabet mirrored towards the center.
        */

        // populate string array with alphabet a–z
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf((char) ('a' + i));
        }

        // ONE for loop with two counters, i increments from 0, j decrements from 25
        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(alphabet[i] + " " + alphabet[j] + " ");
        }

        System.out.println(); // newline at end
    }

    public static void ShiftingElementByInput() {

        /*
        // 8.2 – ShiftingElementByInput.java

        PURPOSE:
        This program reads a user-defined list of numbers, then performs a
        user-specified number of left shifts on the array and display the result.
        
        HOW IT WORKS:
        - The user enter how many numbers they have then an int array of that size is created.
        - A loop reads each number into the array from a single space separated input line.
        - The user then enters how many left shifts to perform.
        - An outer loop repeats the shift operation that many times. Each iteration
            saves the first element, shifts every remaining
            element one position to the left, then places the saved element at the end.
        - The final shifted array is printed in one line.
        */

        Scanner input = new Scanner(System.in);

        // Read number of elements
        System.out.println("How many numbers are there?");
        int n = input.nextInt();

        // Read the elements into the array
        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Read number of left shifts
        System.out.println("Enter number of left shift:");
        int shifts = input.nextInt();

        // Perform left shifts
        for (int s = 0; s < shifts; s++) {
            int temp = numbers[0];           
            for (int i = 0; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];   
            }
            numbers[n - 1] = temp;
        }

        // Display the shifted result
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void NumberGuessing() {

        /*
        8.3 – NumberGuessing.java

        PURPOSE:
        This program creates a shuffled array of digits 0–9, then
        challenges the user to guess the first 4 numbers in their correct positions.
        The user has 10 chances. Winning requires all 4 to match exactly.
        
        HOW IT WORKS:
        - An int array with 10 integers (no duplicate) is created and shuffled once using the Fisher-Yates
            technique; for each position i from the last down to 1,
            pick a random index j in [0..i] and swap array[i] with array[j].
        - A while loop runs up to 10 times (decrementing a chances counter each round).
        - Each round, the user enters 4 guesses read via Scanner; a score counter
            (reset to 0 each round) increments whenever guess[k] == shuffled[k].
        - If score == 4, the player wins and the loop breaks with a win message.
        - If chances reach 0 before a win, the loop exits and the actual first 4
            numbers are revealed with a lose message.
        */

        // Create array 0–9 and shuffle once
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));   // random index 0..i
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
        }

        // Game loops - up to 10 chances
        Scanner input = new Scanner(System.in);
        int chances = 10;
        boolean won = false;

        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            // Count correct positions (reset each round)
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == arr[i]) {
                    score++;
                }
            }
            chances--;   // decrement before checking win/lose

            // Check win condition
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
                break;
            }

            // If out of chances, then reveal answer and lose
            if (chances == 0) {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(arr[i] + (i < 3 ? " " : ""));
                }
                System.out.println(". You Lose.");
                break;
            }

            System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
        }
    }

    public static void AssigningGrade() {

        /*
        8.4 – AssigningGrade.java
        PURPOSE:
        This program reads student scores, finds the highest (best) score, then
        assigns a letter grade to each student based on how close they are to that
        best score. Two parallel single-dimensional arrays are used.
        
        HOW IT WORKS:
        - The user enters the number of students; two parallel arrays are created:
            int[] scores and char[] grades, both of the same length.
        - A first loop reads each score from a single space-separated input line
            and simultaneously tracks the best (maximum) score seen so far.
        - A second loop compares each score against the best score using nested
            if-else to assign grades: A (>= best-10), B (>= best-20),
            C (>= best-30), D (>= best-40), F otherwise. The grade is stored
            in grades[i] at the same index as the corresponding score.
        - A final loop prints each student's score and grade from the two arrays.
        */

        Scanner input = new Scanner(System.in);

        // Read number of students and create parallel arrays
        System.out.println("Enter the number of students:");
        int n = input.nextInt();

        int[]  scores = new int[n];
        char[] grades = new char[n];

        // Read scores and find best score in the same loop
        System.out.println("Enter the " + n + " scores");
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best) {
                best = scores[i]; // track highest score
            }
        }

        // Assign grades using nested if-else
        for (int i = 0; i < n; i++) {
            if      (scores[i] >= best - 10) grades[i] = 'A';
            else if (scores[i] >= best - 20) grades[i] = 'B';
            else if (scores[i] >= best - 30) grades[i] = 'C';
            else if (scores[i] >= best - 40) grades[i] = 'D';
            else                             grades[i] = 'F';
        }

        // Display results from both parallel arrays
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " score is " + scores[i] +
                               " and grade is " + grades[i]);
        }
    }

    public static void EliminateDuplicate() {

        /*
        8.5 – EliminateDuplicate.java
        PURPOSE:
        This program reads 10 numbers (1–9) from the user, removes all duplicates
        by marking them as 0, sorts the array, then prints only the unique numbers
        in ascending order.
        
        HOW IT WORKS:
        - A loop reads 10 integers into an int array from a single input line.
        - A nested loop implements the duplicate-elimination logic:
            the outer counter i starts at 0; the inner counter j starts at i+1.
            Whenever numbers[j] == numbers[i], numbers[j] is set to 0 to mark it
            as a duplicate. This ensures the first occurrence is kept.
        - Arrays.sort() is called to sort the array ascending,
            which also moves all 0s to the front.
        - A final loop skips any element equal to 0 and prints the rest,
            producing only the distinct values in sorted order.
        */

        Scanner input = new Scanner(System.in);

        // Read 10 numbers into the array
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Nested loop — marks duplicates as 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) continue;  // skip already-zeroed slots
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    numbers[j] = 0; // mark duplicate as 0
                }
            }
        }

        // Sort the array
        Arrays.sort(numbers); // 0s move to the front
        // Print only non-zero (distinct) values
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) { // skip the 0 placeholders
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
 