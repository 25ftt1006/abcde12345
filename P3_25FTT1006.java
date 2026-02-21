import java.util.Scanner;

public class P3_25FTT1006 {
    public static void main(String[] args) {
        // 3.1 - ComputeArea.java
        // 3.2 - ConvertBytesIntoBits.java
        // 3.3 - CharacterToUnicode.java
        // 3.4 - NumberOfDurians.java
        // 3.5 - Savings.java
    }

    public static void ComputeArea() {
        // 3.1 - ComputeArea.java
        // PURPOSE: To calculate and display the area of a square, triangle, and circle.

        // DESCRIPTION HOW IT WORKS
        // The method declares the values for base, height, and radius, and also a constant PI. 
        // It calculates the area of the square using base × base, the triangle using 0.5 × base × height, 
        // and the circle using π × radius × radius. Then, it prints all three results on the screen.

        final double PI = 3.14;  // Declare a constant
        double base = 4.0;
        double height = 6.0;
        double radius = 8.0;
        double areaOfSquare = base * base;
        double areaOfTriangle = 0.5 * base * height;
        double areaofCircle = PI * radius * radius;

        System.out.println(
            "The area of square is " + areaOfSquare +
            "\nThe area of triangle is " + areaOfTriangle +
            "\nThe area of circle is " + areaofCircle
        );
    }


        public static void ConvertBytesIntoBits() {
            // 3.2 - ConvertBytesIntoBits.java
            // PURPOSE: To convert a user-entered value in bytes into bits.

            // DESCRIPTION HOW IT WORKS
            // The method uses a Scanner to read the number of bytes from the user,
            // multiplies the value of bytes by 8 to convert it into bits,
            // and then display both the input and the converted result.
            Scanner input = new Scanner(System.in);
            int bytes;
            int bits;

            System.out.print("Enter the number of byte(s) to be converted: ");
            bytes = input.nextInt();
            bits = bytes * 8;
            System.out.println(bytes + " byte(s) is " + bits + " bits.");

            System.out.print("Enter the number of byte(s) to be converted: ");
            bytes = input.nextInt();
            bits = bytes * 8;
            System.out.println(bytes + " byte(s) is " + bits + " bits.");
        }

        public static void CharacterToUnicode() {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a character: ");
            char character1 = input.next().charAt(0);
            int unicodeValue1 = ((int)character1);
            System.out.println("The Unicode value of " + character1 + " is " + unicodeValue1);

            System.out.println("Enter a character: ");
            char character2 = input.next().charAt(0);
            int unicodeValue2 = ((int)character2);
            System.out.println("The Unicode value of " + character2 + " is " + unicodeValue2);

            System.out.println("Enter a character: ");
            char character3 = input.next().charAt(0);
            int unicodeValue3 = ((int)character3);
            System.out.println("The Unicode value of " + character3 + " is " + unicodeValue3);
    }


    public static void NumberOfDurians() {
    // 3.4 - NumberOfDurians.java
    // PURPOSE: To calculate how many durians a user can buy with a given amount of money.

    // DESCRIPTION HOW IT WORKS
    // The method reads the user’s money using a Scanner, divides it by the price of a durian, 
    // converts the result to a whole number using explicit typecasting, 
    // and then displays the number of durians that can be bought based on the user’s input.
        Scanner input = new Scanner(System.in);
        double durianPrice = 15.75;

        System.out.println("Each durian cost $" + durianPrice);
        System.out.println("How much money do you have? ");
        double money = input.nextDouble();
        double Calculation = money / durianPrice;
        int AmountCanBuy = (int) Calculation;
        System.out.println("The number of durian(s) you can buy is " + AmountCanBuy);

        System.out.println("Each durian cost $" + durianPrice);
        System.out.println("How much money do you have? ");
        double money2 = input.nextDouble();
        double Calculation2 = money2 / durianPrice;
        int AmountCanBuy2 = (int) Calculation2;
        System.out.println("The number of durian(s) you can buy is " + AmountCanBuy2);

        System.out.println("Each durian cost $" + durianPrice);
        System.out.println("How much money do you have? ");
        double money3 = input.nextDouble();
        double Calculation3 = money3 / durianPrice;
        int AmountCanBuy3 = (int) Calculation3;
        System.out.println("The number of durian(s) you can buy is " + AmountCanBuy3);
    }


    public static void Savings() {
    // 3.5 - Savings.java
    // PURPOSE: To calculate the daily savings needed to reach a financial goal within a specified time

    // DESCRIPTION HOW IT WORKS
    // The method prompts the user for a target amount and the number of months to reach that goal. 
    // It then converts the months into days (assuming 30 days per month), calculates the daily savings required 
    // by dividing the target amount by the total number of days, 
    // and finally displays the daily savings formatted to two decimal places using printf with %.2f.
        Scanner input = new Scanner(System.in);

        System.out.println("What is your target amount? ");
        double targetAmount = input.nextDouble();
        System.out.println("How many month(s) to reach your goal?");
        int month = input.nextInt();
        double dailySaving = targetAmount/(month*30);
        System.out.printf("The amount you need to save per day is $%.2f\n ", dailySaving);

        System.out.println("What is your target amount? ");
        double targetAmount2 = input.nextDouble();
        System.out.println("How many month(s) to reach your goal?");
        int month2 = input.nextInt();
        double dailySaving2 = targetAmount2/(month2*30);
        System.out.printf("The amount you need to save per day is $%.2f\n ", dailySaving2);
    }
}
