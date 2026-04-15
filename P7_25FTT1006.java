import java.util.Scanner;

public class P7_25FTT1006 {
        public static void main(String[] args) {
            // 7.1 – LoopsLoopsLoops.java
            // 7.2 – RockPaperScissorLoop.java
            // 7.3 - CountingNumbers.java
            // 7.4 – FibonacciNumber.java
            // 7.5 – OccurrenceOfMaxNumbers.java
        }

        public static void LoopsLoopsLoops() {
        // 7.1 – LoopsLoopsLoops.java

        // PURPOSE: A program that generate the number 1 to 20 using while loop, 
        // generate the number decreasing from 50 to 35 using dowhile loop, 
        // and generate the alphabet a to z using a for loop and one char datatype.

        // HOW IT WORKS: The program uses three different loops to generate the required outputs.
        // The while loop is used to generate the number 1 to 20, it checks if the number is less than 20 by using a boolean condition, 
        // if it is, it increments the int number variable and prints it.
        // The dowhile loop is used to generate the number decreasing from 50 to 35, initialize  int number to 50, 
        // then it prints the number and decrements it using the post-decrement operator, the loop continues until the number is less than 35.
        // The for loop is used to generate the alphabet a to z, it initializes a char variable to 'a' and increments it until it reaches 'z', printing each character.

        Scanner input = new Scanner(System.in);

        // Generate the number 1 to 20 using while loop.
        System.out.println("Below is generated using while loop:");
        int number = 0;
        while (true) {
            if (number < 20) {
                number++;
                System.out.print(number+" ");
            } else{
                break;
            }
        }

        // Generate the number decreasing from 50 to 35 using dowhile loop
        System.out.println("\n\nBelow is generated using dowhile loop:");
        int number2 = 50;
        do{
            System.out.print(number2+" ");
            number2--;
        } while(number2>=35);

        // Generate the alphabet a to z using a for loop and one char datatype
        System.out.println("\n\nBelow is generated using for loop: ");
        char letters;
        for(letters = 'a'; letters <='z'; ++letters){
            System.out.print(letters+" ");
        }
    }

        public static void RockPaperScissorLoop() {
        Scanner input = new Scanner(System.in);

        // 7.2 – RockPaperScissorLoop.java

        // PURPOSE: A program that allows the user to play rock paper scissor with the computer, 
        // and keeps track of the score and rounds played until the user decides to stop playing.

        /*
        HOW IT WORKS: The program initialize three int variables to keep track of game rounds, user score, and computer score, 
        and a string variable to control the loop. It uses a do-while loop to allow the user to play multiple rounds of the game until they choose to stop by entering 'y'.
        Inside the loop, it prompts the user to enter their choice of rock, paper, or scissor using integers 0, 1, and 2 respectively.
        The computer's choice is generated randomly using Math.random() and modulus operator to get a value between 0 and 2.
        The program then compares the user's choice and the computer's choice using if-else statements to determine the outcome of the round and updates the scores accordingly.
        After each round, it asks the user if they want to play again, and if the user enters "y", the loop continues. 
        If the user enters anything other than "y", the loop breaks and the program calculates the final results of the game, 
        including total rounds played, user score, computer score, and who won the game based on the scores, and prints the results.
        */

        int gameRounds = 0;
        int userScore = 0;
        int compScore = 0;
        String continueGameString = null;
        do{
            // Print instructions for user to enter their choice
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = input.nextInt();

            // Use int Math.random()*1000 to generate random number between 0 and 999, then using modulus to get either 0,1 or 2.
            int computerChoice = (int)(Math.random()*1000) % 3; 

            // Create conditions and output for computer choice
            if (computerChoice == 0) System.out.print("The computer is scissor. ");
            if (computerChoice == 1) System.out.print("The computer is rock. ");
            if (computerChoice == 2) System.out.print("The computer is paper. ");

            // Create conditions and output for user choice
            if (userChoice == 0) System.out.print("You are scissor. ");
            if (userChoice == 1) System.out.print("You are rock. ");
            if (userChoice == 2) System.out.print("You are paper. ");

            if (userChoice == 0 && computerChoice == 0) System.out.println("It is a draw.");
            if (userChoice == 0 && computerChoice == 1){
                System.out.println("You Lose.");
                compScore++;
            } 
            if (userChoice == 0 && computerChoice == 2) {
                System.out.println("You Win.");
                userScore++;
            }
            if (userChoice == 1 && computerChoice == 0) {
                System.out.println("You Win.");
                userScore++;
            }
            if (userChoice == 1 && computerChoice == 1) System.out.println("It is a draw.");
            if (userChoice == 1 && computerChoice == 2) {
                System.out.println("You Lose.");
                compScore++;
            }
            if (userChoice == 2 && computerChoice == 0) {
                System.out.println("You Lose.");
                compScore++;
            }
            if (userChoice == 2 && computerChoice == 1) {
                System.out.println("You Win.");
                userScore++;
            }
            if (userChoice == 2 && computerChoice == 2) System.out.println("It is a draw.");

            System.out.println(""); // Space for better readability

            // Increase the number of rounds played (gameRounds) everytime the user finish a game.
            gameRounds++;

            // Ask user whether they want to play again. If y is inputted then loop continues.
            System.out.print("Enter y to play again: ");
            continueGameString = input.next();
            System.out.println(""); // Space for better readability
        }while(continueGameString.equals("y")); // Loop breaks when input is y

        String gameResult = "";
        if(userScore>compScore){
            gameResult = "You won the game.";
        } else if (userScore==compScore) {
            gameResult = "Its a draw game.";
        } else{
            gameResult = "You lose the game.";
        };

        // Print results of the game (total rounds, user score, computer score, and who won)
        System.out.println("In the total of "+gameRounds+" round(s), You scored "+userScore+", Computer scored "+compScore+"\n"+gameResult);

    }

    public static void CountingNumbers() {
        Scanner input = new Scanner(System.in);

        // 7.3 - CountingNumbers.java

        // PURPOSE: A program that counts the number of positive and negative integers entered by the user,
        // calculates the total and average of the numbers entered, and handles the case when no numbers are entered.

        // HOW IT WORKS: The program initialize 5 integer variables to keep track of sum of total number, number count, positive number count,
        // negative number count, and the input number. It uses an infinite while loop to continuously prompt the user to enter integers until they enter 0 to break the loop.
        // Using if else statement, the program checks if the input number is positive, increment the positive number count and number count,
        // if the input number is negative, increment the negative number count and number count, and add the input number to the total sum.
        // When the user enters 0, the program checks if any numbers were entered by checking if the number count is greater than 0. If it is, it calculates the average by dividing the total sum by the number count, 
        // and prints the count of positive and negative numbers, the total sum, and the average formatted to 2 decimal places. If no numbers were entered (number count is 0), 
        // it prints a message indicating that no numbers were entered except for 0 to end.

        // Create integer variables
        int totalNumber = 0;
        int positiveNumber = 0;
        int negativeNumber = 0;
        int numberCount = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        // Create infinite loop
        while (true) {
            int inputNumber = input.nextInt();
            totalNumber+=inputNumber;
            if (inputNumber>0) {++positiveNumber;++numberCount;}
            else if(inputNumber<0){++negativeNumber;++numberCount;}
            if (inputNumber == 0 && numberCount > 0) {
                System.out.println("The number of positives is " +positiveNumber);
                System.out.println("The number of negatives is " +negativeNumber);
                System.out.println("The total is "+totalNumber);
                double average = (double)totalNumber/numberCount;
                System.out.printf("The average is %.2f%n", average);
                break;
            } else if (inputNumber == 0 && numberCount == 0) {
                System.out.println("No numbers is entered except for 0 to end the program.");
                break;
            }
        }
    }

    public static void FibonacciNumber() {
        // 7.4 – FibonacciNumber.java
        // PURPOSE: A program that calculates the Fibonacci number at a specific term entered by the user.

        // HOW IT WORKS: The program initializes three integer variables, a and b to represent the first two terms of the Fibonacci sequence, 
        // and nextNumber to store the next term in the sequence. It prompts the user to enter the term they want to calculate. If the input is 0, 
        // it prints the result for the 0th term and returns. If the input is 1, it prints the result for the 1st term and returns. If the input is negative, 
        // it prints an error message and returns. If the input is greater than 1, it uses a for loop to calculate the Fibonacci number at the specified term 
        // by iterating from 2 to the input term, updating nextNumber as the sum of a and b, and then updating a and b to the next two terms in the sequence. 
        // Finally, it prints the Fibonacci number at the specified term.

        Scanner input = new Scanner(System.in);

        // Declare two int datatype for first two terms.
        int a = 0;
        int b = 1;
        int nextNumber = 0;

        System.out.println("Please enter the term: ");
        int loopHowManyTimes = input.nextInt();

        // If the input is 0, it cant be calculated using the loop, so will just print the result and return. 
        // Same goes for 1, as it is the second term of the sequence. 
        // If the input is negative, we will print an error message and return.
        if (loopHowManyTimes == 0) {
            System.out.println("At term "+loopHowManyTimes+" the number is "+nextNumber);
            return;
        } else if (loopHowManyTimes == 1) {
            System.out.println("At term "+loopHowManyTimes+" the number is "+b);
            return;
        } else if (loopHowManyTimes < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Use for loop to calculate the next number in the sequence until it reaches the term that the user inputted.
        for(int i = 2; i <= loopHowManyTimes; i++){
            nextNumber=a+b;
            a=b;
            b=nextNumber;
        }
        System.out.println("At term "+loopHowManyTimes+" the number is "+nextNumber);
    }

    public static void OccurrenceOfMaxNumbers() {

        // 7.5 – OccurrenceOfMaxNumbers.java

        // PURPOSE: A program that counts the occurrence of the largest number in a series of numbers entered by the user,
        // where the input ends when the user enters 0.

        // HOW IT WORKS: The program initializes two integer variables, largestNumber and countLargestNumber, 
        // to keep track of the largest number entered and its occurrence count, respectively.
        // It prompts the user to enter numbers, with the input ending when 0 is entered. 
        // The program uses a try-with-resources statement to create a Scanner object for reading user input.

        int largestNumber = 0;
        int countLargestNumber = 0;
        int inputNumbers;

        // Ask user to enter numbers, the input ends when 0 is entered.
        System.out.println("Enter numbers, the input ends with 0 entered: ");

        try (Scanner input = new Scanner(System.in)){
            while (true) {
                inputNumbers = input.nextInt(); // Read the next integer from the user input
                if (inputNumbers == 0)
                    break; // Exit the loop if the user enters 0
                if (inputNumbers == largestNumber) {
                    countLargestNumber++; // Increment the count if the number is equal to the current largest
                } else if (inputNumbers > largestNumber) { // Update largest and reset count if the number is greater than the current largest
                    largestNumber = inputNumbers; // Update the largest number to the new number
                    countLargestNumber = 1; // Reset the largest number count to 1
                }
            }
        }
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The occurrence count of the largest number " +"(" + largestNumber + ")"+ " is " + countLargestNumber);
    }
}
