import java.text.DecimalFormat;
import java.util.Scanner;

public class P4_25FTT1006 {
    public static void main(String[] args) {
        // 4.1 - MathQuiz.java
        // 4.2 - AreaOfTriangleGeometry.java
        // 4.3 - ReverseOfInteger.java
        // 4.4 - MoneyChanger.java
        // 4.5 - PriceComparison.java
    }

    public static void mathQuiz() {
        // 4.1 - MathQuiz.java
        // PURPOSE: To generate random addition and modulus questions for the user, and to keep track of the number of correct answers.
        // DESCRIPTION HOW IT WORKS
        // The method uses a loop to generate three random addition and modulus questions. For each question
        // it generates two random numbers between 0 and 99, calculates the correct answers for both addition and modulus, and prompts the user to input their answers. 
        // The method then checks if the user's answers are correct, displays whether each answer is true or false.

        Scanner input = new Scanner(System.in);
 
        //Repeat questions three times using loop, firstNUm and secNum should be different for each question, and the user should be able to input their answer for each question. After the loop, display the total number of correct answers out of 6 (3 addition questions and 3 modulus questions).
        int correctAnswers = 0;
        for (int i = 0; i < 3; i++) {
            int firstNum = (int) (Math.random()*100);
            int secNum = (int) (Math.random()*100);

            int additionTrueAnswer = firstNum + secNum;
            int modulusTrueAnswer = firstNum % secNum;

            // Addition
            System.out.printf("What is %d + %d ?\n", firstNum, secNum);
            int answer = input.nextInt();
            if (answer == additionTrueAnswer) {
                correctAnswers++;
            }
            System.out.println(answer==additionTrueAnswer?(firstNum+" + "+secNum+" = "+answer+" is true"):(firstNum+" + "+secNum+" = "+answer+" is false"));
            System.out.println(" "); // Gap
            // Modulus
            System.out.printf("What is %d %% %d ?\n", firstNum, secNum);
            int secAnswer = input.nextInt();
            if (secAnswer == modulusTrueAnswer) {
                correctAnswers++;
            }
            System.out.println(secAnswer==modulusTrueAnswer?(firstNum+" % "+secNum+" = "+secAnswer+" is true"):(firstNum+" % "+secNum+" = "+secAnswer+" is false"));
        }
    }

    public static void areaOfTriangleGeometry() {
        // 4.2 - AreaOfTriangleGeometry.java
        // PURPOSE: To calculate the area of a triangle given its three vertices using a given Math's formula
        // DESCRIPTION HOW IT WORKS
        // The method prompts the user to enter the coordinates of the three vertices of a triangle.
        // It then calculates the lengths of the sides of the triangle using the distance formula, 
        // and uses the given math formula to calculate the area of the triangle. 
        // Then it displays the area to the user.

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter three coordinates for a triangle: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();

            double side1 = Math.sqrt((Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)));
            double side2 = Math.sqrt((Math.pow(x3 - x2, 2)+Math.pow(y3 - y2, 2)));
            double side3 = Math.sqrt((Math.pow(x3 - x1, 2)+Math.pow(y3 - y1, 2)));
            double s = ((side1+side2+side3)/2);
            double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
            System.out.println("The area of the triangle is "+ df.format(area));
        }
    }

    public static void reverseOfInteger() {
        // 4.3 - ReverseOfInteger.java
        // PURPOSE: To reverse a three-digit integer entered by the user.
        // DESCRIPTION HOW IT WORKS
        // The method prompts the user to enter a three-digit integer. It then extracts each digit using modulus and division operations, and combine each digit in reverse order to form the reversed number by concatenating them as a String. 
        // Then, it displays the reversed number to the user. The method also includes input validation to ensure that the user enters a valid three-digit integer.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 100 and 999: ");
        int originalNumber = input.nextInt();

        // Third Digit Extraction
        int thirdDigit = originalNumber % 10;
        int thirdIteratedNum = originalNumber / 10;

        // Second Digit Extraction
        int secDigit = thirdIteratedNum % 10;
        int secIteratedNum = thirdIteratedNum / 10;

        // First Digit Extraction
        int firstDigit = secIteratedNum % 10;
        int firstIteratedNum = secIteratedNum / 10;

        // Reversed Number Variable
        String ReversedNumber = (String.valueOf(thirdDigit)+String.valueOf(secDigit)+String.valueOf(firstDigit));

        // Print Reversed Number
        System.out.println(originalNumber>=100 && originalNumber<=999 
            ? ("The reverse of "+originalNumber+" is "+ ReversedNumber)
            : "Invalid input. Please enter a number between 100 and 999.");

        System.out.println("");
        
        System.out.println("Enter an integer between 100 and 999: ");
        int originalNumber2 = input.nextInt();

        // Third Digit Extraction
        int thirdDigit2 = originalNumber2 % 10;
        int thirdIteratedNum2 = originalNumber2 / 10;

        // Second Digit Extraction
        int secDigit2 = thirdIteratedNum2 % 10;
        int secIteratedNum2 = thirdIteratedNum2 / 10;

        // First Digit Extraction
        int firstDigit2 = secIteratedNum2 % 10;
        int firstIteratedNum2 = secIteratedNum2 / 10;

        // Reversed Number Variable
        String ReversedNumber2 = (String.valueOf(thirdDigit2)+String.valueOf(secDigit2)+String.valueOf(firstDigit2));

        // Print Reversed Number
        System.out.println(originalNumber2>=100 && originalNumber2<=999 
            ? ("The reverse of "+originalNumber2+" is "+ ReversedNumber2)
            : "Invalid input. Please enter a number between 100 and 999.");
    
    }

    public static void MoneyChanger() {
        // 4.4 - MoneyChanger.java

        // PURPOSE: To convert an amount of money between Brunei Dollars (BND) and
        // Malaysian Ringgit (RM) based on user choice.

        // DESCRIPTION HOW IT WORKS
        // The method prompts the user to choose whether they want to convert from BND to RM or from RM to BND. Based on the user's choice, it then prompts the user to enter the amount of money they want to convert. 
        // The method performs the conversion using a fixed exchange rate (1 BND = 3 RM) and displays the converted amount to the user. 
        // The method also includes input validation to ensure that the user enters a valid choice for conversion.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to convert bnd to rm, and 2 vise versa: ");
        int conversionChoice = input.nextInt();
        if (conversionChoice == 1) {
            System.out.println("Enter the amount to be converted: ");
            double bndAmount = input.nextDouble();
            double rmAmount = bndAmount * 3;
            System.out.printf("The change is $%.2f\n", rmAmount);
        } else if (conversionChoice == 2) {
            System.out.println("Enter the amount to be converted: ");
            double rmAmount = input.nextDouble();
            double bndAmount = rmAmount / 31;
            System.out.printf("The change is $%.2f\n", bndAmount);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }


        System.out.println("Enter 1 to convert bnd to rm, and 2 vise versa: ");
        int conversionChoice2 = input.nextInt();
        if (conversionChoice2 == 1) {
            System.out.println("Enter the amount to be converted: ");
            double bndAmount = input.nextDouble();
            double rmAmount = bndAmount * 3;
            System.out.printf("The change is $%.2f\n", rmAmount);
        } else if (conversionChoice2 == 2) {
            System.out.println("Enter the amount to be converted: ");
            double rmAmount = input.nextDouble();
            double bndAmount = rmAmount / 3;
            System.out.printf("The change is $%.2f\n", bndAmount);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    public static void priceComparison() {
        // 4.5 - PriceComparison.java

        // PURPOSE: To compare the price per kilogram of two packages of the same product and determine which one is a better deal.

        // DESCRIPTION HOW IT WORKS
        // The method prompts the user to enter the price and weight of two packages of the similar product. It then calculates the price per kilogram for each package by dividing the price by the weight.
        // Then, it compares the price per kilogram of the two packages and displays which package is a better deal or if both packages have the same price per kilogram. 

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the 1st package: ");
        double price1 = input.nextDouble();
        System.out.println("Enter the weight of the 1st package: ");
        double weight1 = input.nextDouble();

        System.out.println("Enter the price of the 2nd package: ");
        double price2 = input.nextDouble();
        System.out.println("Enter the weight of the 2nd package: ");
        double weight2 = input.nextDouble();

        double pricePerKg1 = price1 / weight1;
        double pricePerKg2 = price2 / weight2;

        System.out.println(pricePerKg1>pricePerKg2 ? "It is worth more to buy the 2nd package." 
        : pricePerKg1<pricePerKg2 ? "It is worth more to buy the 1st package." : "Both packages have the same price.");

        System.out.println("");
        
        System.out.println("Enter the price of the 1st package: ");
        double price3 = input.nextDouble();
        System.out.println("Enter the weight of the 1st package: ");
        double weight3 = input.nextDouble();

        System.out.println("Enter the price of the 2nd package: ");
        double price4 = input.nextDouble();
        System.out.println("Enter the weight of the 2nd package: ");
        double weight4 = input.nextDouble();

        double pricePerKg3 = price3 / weight3;
        double pricePerKg4 = price4 / weight4;

        System.out.println(pricePerKg3>pricePerKg4 ? "It is worth more to buy the 2nd package." 
        : pricePerKg3<pricePerKg4 ? "It is worth more to buy the 1st package." : "Both packages have the same price.");
    }
}
