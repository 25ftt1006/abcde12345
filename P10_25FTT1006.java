import java.util.Scanner;

public class P10_25FTT1006 {
    public static void main(String[] args) {
        // 10.1 - GreatestCommonDivisor.java
        // 10.2 - IsPalindromeReverse.java
    }

    public static void GreatestCommonDivisor() {
        /*
        10.1 – GreatestCommonDivisor.java

        PURPOSE:
        This program prompts the user to enter two integers and display
        their greatest common divisor using the Euclidean algorithm
        implemented inside a dedicated gcd() method.

        HOW IT WORKS:
        - A Scanner reads two integers from the user.
        - The gcd(int firstInteger, int secondInteger) method applies the Euclidean algorithm:
            repeatedly replace the larger value with the remainder of
            dividing the two values (firstInteger % secondInteger) until secondInteger reaches 0, at which
            point firstInteger holds the GCD.
        - The result is printed in the required format.
        */

        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = input.nextInt();

        // Call gcd() method and display result
        int result = gcd(firstInteger, secondInteger);
        System.out.println("The greatest common divisor for " + firstInteger + " and " + secondInteger + " is " + result);
    }

    // Euclidean algorithm: returns the GCD of two integers
    public static int gcd(int firstInteger, int secondInteger) {
        while (secondInteger != 0) {
            int temp = secondInteger; // store current secondInteger before overwriting
            secondInteger = firstInteger % secondInteger; // new secondInteger is the remainder
            firstInteger = temp; // new firstInteger is the old secondInteger
        }
        return firstInteger; // when secondInteger == 0, firstInteger contains the GCD`
    }

    public static void IsPalindromeReverse() {

        /*
        10.2 – IsPalindromeReverse.java

        PURPOSE:
        This program generates a random 3-digit number (100–999), prompts
        the user to enter its reverse, validates that the input is exactly
        3 digits, then reports whether the input is a palindrome of the
        generated number.

        HOW IT WORKS:
        - Math.random() generates a random integer in the range [100, 999].
        - The user is asked to enter the reverse of that number.
        - If the entered number is not a 3-digit number
            the program keeps prompting until a valid 3-digit number is entered.
        - reverse(int number): accepts the generated number, extracts each
            digit using % 10 and / 10 in a while loop, rebuilds the digits
            in reverse order, and returns the reversed integer.
        - isPalindrome(int number, int reverse): compares the user's input
            digit-by-digit against the reversed number using a nested loop
            and a counter; returns true only when all 3 digits match.
        - The final result is printed using the required output format.
        */

        Scanner input = new Scanner(System.in);

        // Generate a random 3-digit number between 100 and 999 inclusive
        int generatedNumber = (int) (Math.random() * 900) + 100;  // 100 + [0-899]

        // Prompt user for the reverse of the generated number
        System.out.print("Enter the reverse of " + generatedNumber + ": ");
        int userInput = input.nextInt();

        // keep asking until a 3-digit number is entered
        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + generatedNumber + ": ");
            userInput = input.nextInt();
        }

        // Compute the actual reverse of the generated number
        int reversed = reverse(generatedNumber);

        // Check if the user's input is a palindrome of the generated number
        boolean result = isPalindrome(userInput, reversed);

        System.out.println();
        System.out.println("The digit " + userInput + " is palindrome of " + generatedNumber + " is " + result + ".");
    }

    // Reverses the digits of the given number and returns the reversed integer
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // extract the last digit
            reversed = reversed * 10 + digit; // shift left and append digit
            number /= 10; // remove the last digit
        }
        return reversed;
    }

    // Returns true if userInput matches the reversed number digit-by-digit
    // Using a nested loop and a counter
    public static boolean isPalindrome(int userInput, int reversed) {
        // Convert both numbers to digit arrays for comparison
        int[] userDigits = new int[3];
        int[] reversedDigits = new int[3];

        // Extract digits from right to left (index 2 to 0)
        int tempUser = userInput;
        int tempReversed = reversed;

        for (int i = 2; i >= 0; i--) {
            userDigits[i]= tempUser % 10;
            reversedDigits[i] = tempReversed % 10;
            tempUser/= 10;
            tempReversed/= 10;
        }

        // Nested loop with counter: count how many digits match positionally
        int matchCount = 0;
        for (int i = 0; i < 3; i++) { // outer loop: digit positions
            for (int j = i; j <= i; j++) { // inner loop to compare same position of digits
                if (userDigits[j] == reversedDigits[j]) {
                    matchCount++; // increment counter on each match
                }
            }
        }
        // All 3 digits must match for the input to be a true palindrome
        return matchCount == 3;
    }
}