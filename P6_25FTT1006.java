import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6_25FTT1006 {
    public static void main(String[] args) {
        // 6.1 - RockPaperScissor.java
        // 6.2 - AddFourNumber.java
        // 6.3 - SimpleLoginValidation.java
        // 6.4 - GuessBirthMonth.java
        // 6.5 - SimpleCalculatorUsingSwitch.java
    }

    public static void rockPaperScissor() {
        // 6.1 - RockPaperScissor.java

        // PURPOSE: 
        // A program that plays the Rock-Paper-Scissors game.
        // Where a scissor can cut a paper, a rock can break a scissor and paper can wrap a rock.

        // DESCRIPTION HOW IT WORKS:
        // The program generates a random choice for the computer using Math.random()*1000 to generate a big number then use modulus to convert the generated number to 0, 1 or 2 to have a fair probability of outputting either rock, paper or scissor.
        // The program then prompts user to enter their choice of rock (0), paper (1) or scissor (2) and display the computer and user choices 
        // and determine the winner by using if statements to check all nine possible combinations of computer and user choices and output whether the user wins, loses or draws.

        Scanner input = new Scanner(System.in);
        int computerChoice = (int)(Math.random()*1000) % 3; // Using int Math.random()*1000 to generate random number between 0 and 999, then using modulus to get either 0, 1 or 2 for computer choice.
        System.out.println("Enter rock (0), paper (1), scissor (2)"); // Print instructions for user to enter their choice
        int userChoice = input.nextInt();

        // Create conditions and output for computer choice
        if (computerChoice == 0) System.out.print("The computer is scissor. ");
        if (computerChoice == 1) System.out.print("The computer is rock. ");
        if (computerChoice == 2) System.out.print("The computer is paper. ");

        // Create conditions and output for user choice
        if (userChoice == 0) System.out.print("You are scissor. ");
        if (userChoice == 1) System.out.print("You are rock. ");
        if (userChoice == 2) System.out.print("You are paper. ");

        // Create user win, lose and draw conditions and output
        if (userChoice == 0 && computerChoice == 0) System.out.println("It is a draw.");
        if (userChoice == 0 && computerChoice == 1) System.out.println("You Lose.");
        if (userChoice == 0 && computerChoice == 2) System.out.println("You Win.");
        if (userChoice == 1 && computerChoice == 0) System.out.println("You Win.");
        if (userChoice == 1 && computerChoice == 1) System.out.println("It is a draw.");
        if (userChoice == 1 && computerChoice == 2) System.out.println("You Lose.");
        if (userChoice == 2 && computerChoice == 0) System.out.println("You Lose.");
        if (userChoice == 2 && computerChoice == 1) System.out.println("You Win.");
        if (userChoice == 2 && computerChoice == 2) System.out.println("It is a draw.");
    }
    public static void addFourNumber() {
        // 6.2 - AddFourNumber.java

        // PURPOSE: A program that generates four random numbers between 0 to 99, 
        // then asks the user to enter the sum of those four numbers and checks if the user's answer is correct.

        // DESCRIPTION HOW IT WORKS:
        // The program generates four random numbers between 0 to 99 using Math.random()*100 and casts it to int to get whole number.
        // Create a variable to calculate the sum of the four random numbers generated.
        // The program then asks user to enter the sum of the four numbers and checks if the user's answer is correct by comparing the user's input with the calculated sum,
        // and then output whether the user is correct or not and if not, display the correct sum.
        
        Scanner input = new Scanner(System.in);

        int a = (int)((Math.random())*100);
        int b = (int)((Math.random())*100);
        int c = (int)((Math.random())*100);
        int d = (int)((Math.random())*100);
        int sum = a + b + c + d;

        System.out.println("What is " + a + " + " + b + " + " + c + " + " + d + "? ");
        int answer = input.nextInt();

        if(answer == sum) {
            System.out.println("Well done, you are correct!");
        }else {
            System.out.println("Nice try, the sum should be " + sum);
        }
    }

    public static void simpleLoginValidation() {
        // 6.3 - SimpleLoginValidation.java

        // PURPOSE: A simple login validation program that checks if the entered username and password match the predefined username and password.
        
        // DESCRIPTION HOW IT WORKS:
        // The program defines a predefined username and password as strings.
        // It then prompts the user to enter their username and password.
        // The program checks if the entered username matches the predefined username using the String.equals() method.
        // If it does not match, it outputs an error message for invalid username. 
        // If the username matches, it then checks if the entered password matches the predefined password using String.equals() method.
        // If the password does not match, it outputs an error message for password mismatch.
        // If both username and password match, it gets the current time using SimpleDateFormat and Date classes, 
        // then formats it to a readable format and outputs a welcome message along with the formatted current time.

        final String usernameString = "Ahmad Ali";
        final String passwordString = "12345";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        String inputUsername = input.nextLine();

        System.out.print("Please enter the password: ");
        String inputPassword = input.nextLine();

        if (!inputUsername.equals(usernameString)) {
            System.out.println("Error: Invalid Username.");
        } else {
            if (!inputPassword.equals(passwordString)) {
                System.out.println("Error: Password does not match.");
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String currentTime = sdf.format(new Date());
                System.out.println("Welcome, " + usernameString + ". The time now is " + currentTime);
            }
        }

    }
    public static void guessBirthMonth() {
        // 6.4 - GuessBirthMonth.java

        // PURPOSE: A program that guesses the user's birth month by asking a series of questions about whether the birth month is in certain sets of months.

        // DESCRIPTION HOW IT WORKS:
        // The program initializes an integer variable month to 0. Display the Sets to user, and for each set, it prompts the user to enter 0 for No and 1 for Yes if their birth month is in that set.
        // For each set, if the user answers Yes (1), it adds a specific value to the month variable (add 1 for Set 1, 2 for Set 2, 4 for Set 3, and 8 for Set 4). 
        // After asking all four sets, the program uses a switch statement to determine the month name based on the final value of the month variable, 
        // which will be a number between 1 and 12 corresponding to the user's birth month. Finally, it outputs the guessed birth month to the user.

        Scanner input = new Scanner(System.in);
        int month = 0;
        int answer;

        System.out.println("Is your birth month in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) {
            month += 1;
        }

        System.out.println("Is your birth month in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) {
            month += 2;
        }

        System.out.println("Is your birth month in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) {
            month += 4;
        }

        System.out.println("Is your birth month in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1) {
            month += 8;
        }

        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        System.out.println("You are born in " + monthName);
    }
    public static void simpleCalculatorUsingSwitch() {
        // 6.5 - SimpleCalculatorUsingSwitch.java

        // PURPOSE: A simple calculator program that takes an arithmetic expression as input and performs the calculation based on the operator provided.

        // DESCRIPTION HOW IT WORKS:
        // The program prompts the user to enter an arithmetic expression in the format of "number operator number" (e.g., "3 + 4" or "3+4").
        // It then replaces if the input expression contains operators without spaces with spaces around them to ensure that the expression can be parsed correctly.
        // The program uses a Scanner to parse the modified expression string, extracting the first number, the operator, and the second number. 
        // It then uses a switch statement to determine which arithmetic operation to perform based on the operator. For addition, subtraction, and multiplication, it performs the respective operation and outputs the result.
        // For division, it first checks if the second number (divisor) is zero to avoid division by zero error. If the divisor is zero, it outputs an error message. Otherwise, it performs the division and outputs the result.
        // A special double variable (divisionAnswer) is used to store the result of division to handle cases where the result is not an integer.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        String expressionString = input.nextLine() // Captures the user input expression as a string.
            .replace("+", " + ")
            .replace("-", " - ")
            .replace("*", " * ")
            .replace("/", " / "); // Replace the operators with no spaces around them to ensure correct parsing of the expression.
        Scanner expressionScanner = new Scanner(expressionString); // Scanner to parse the modified arithmetic expression string.
        int num1 = expressionScanner.nextInt(); // Extracts the first number from the expression string.
        String operator = expressionScanner.next(); // Extracts the operator from the expression string.
        int num2 = expressionScanner.nextInt();// Extracts the second number from the expression string.
        expressionScanner.close();
        double divisionAnswer = ((double)num1/(double)num2); // Double variable to calculate the division answer as a double to handle cases where the answer is not an integer.

        switch (operator) {
            case "+": // If the operator is "+", perform addition and output the result.
                System.out.println("The sum is " + (num1 + num2));
                break;
            case "-": // If the operator is "-", perform subtraction and output the result.
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case "*": // If the operator is "*", perform multiplication and output the result.
                System.out.println("The multiplication is " + (num1 * num2));
                break;
            case "/":   // If the operator is "/", check if the second number (divisor) is zero to avoid division by zero error. 
                        // If it is zero, output an error message. Otherwise, perform division and output the result.
                if (num2 == 0) {
                    System.out.println("Math error: The divisor cant be Zero");
                } else {
                    System.out.println("The division is " + divisionAnswer);
                }
                break;
        }
    }
}