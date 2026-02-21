public class P2_25FTT1006 {
    public static void main(String[] args) {
        // 2.1 - DisplayTwoMessages.java
        // 2.2 - DisplayPattern.java
        // 2.3 - PrintTable.java
        // 2.4 - ComputeExpression2.java
        // 2.5 - DisplayPattern2.java
    }


        public static void DisplayTwoMessages() {
            // 2.1 - DisplayTwoMessages.java

            // PURPOSE: To display two messages on the console screen using Java.

            // HOW IT WORKS
            // The program runs the main method and uses two System.out.println() statements
            // to print two lines of text. It does not require any user input, 
            // so the output is always the same.
            System.out.println("Welcome to AD2204 Introduction to Programming");
            System.out.println("This is Practical 2");
        }

        public static void DisplayPattern() {
            // 2.2 - DisplayPattern.java

            // PURPOSE: To display a text-based ASCII pattern on the console screen using Java.

            // HOW IT WORKS
            // The program runs the main method and uses multiple System.out.println() 
            // statements to print each line of the ASCII pattern. 
            // Each statement prints one line, forming the complete design when displayed together.
            System.out.println("(\\_/) I am an");
            System.out.println("( @w@)       OOO    W     W L");
            System.out.println("/) w )      O   O    W W W  L");
            System.out.println(" ^  ^        OOO      W W   L L L");
        }
    
        public static void PrintTable() {
            // 2.3 - PrintTable.java

            // PURPOSE: To display a table showing the values of a, a², and a³ for numbers 1 to 4.

            // HOW IT WORKS
            // The method first creates variables for the column titles and the numbers 1 to 4. 
            // It prints the table header using System.out.println() and \t to space the columns properly.
            // Then, for each number, it prints the value of a, its square (a * a), and its cube (a * a * a). 
            // The calculations are done directly inside the print statements, and the results are displayed in table format.
            String TableColumn1 = "a";
            int ColumnRow1  = 1;
            int ColumnRow2 = 2;
            int ColumnRow3 = 3;
            int ColumnRow4 = 4;
            String TableColumn2 = "a^2";
            String TableColumn3 = "a^3";
            System.out.println(TableColumn1+"\t"+TableColumn2+"\t"+TableColumn3);
            System.out.println(ColumnRow1+"\t"+ColumnRow1+"\t"+ColumnRow1);
            System.out.println((ColumnRow2)+"\t"+(ColumnRow2*ColumnRow2)+"\t"+(ColumnRow2*ColumnRow2*ColumnRow2));
            System.out.println((ColumnRow3)+"\t"+(ColumnRow3*ColumnRow3)+"\t"+(ColumnRow3*ColumnRow3*ColumnRow3));
            System.out.println((ColumnRow4)+"\t"+(ColumnRow4*ColumnRow4)+"\t"+(ColumnRow4*ColumnRow4*ColumnRow4));
        }

        
        public class ComputeExpression2 {
            // 2.4 - ComputeExpression2.java
            // PURPOSE: To compute the value of a mathematical expression and display the result.
            // HOW IT WORKS
            // The program stores the numbers in two arrays: one for the numerator and one for the denominator. It calculates the top part of the expression first, then the bottom part, and finally divides them to get the final result.

            public static String format(double num) {
                if (num == (long) num) {
                    return String.valueOf((long) num); //whole number
                } else {
                    return String.valueOf(num); // decimal number
                }
            }
            public static void main(String[] args) {
                double[] numerators = {7.5, 2.5, 1.5, 3};
                double[] denominators = {4, 2.5};
                double numeratorSum = (numerators[0]*numerators[1]-numerators[2]*numerators[3]);
                double denominatorSum = (denominators[0]-denominators[1]);
                double finalSum = (numeratorSum/denominatorSum);
                
                System.out.println("The result of"+" "+numerators[0]+" "+"x"+" "+numerators[1]+" "+"-"+" "+numerators[2]+" "+"x"+" "+format(numerators[3]));
                System.out.println("              ---------------------   is "+finalSum);
                System.out.println("                  "+format(denominators[0])+" "+"-"+" "+denominators[1]);
            }
        }

        
        public static void DisplayPattern2() {
            // 2.5 - DisplayPattern2.java

            // PURPOSE: To display a more complex text-based ASCII pattern on the console screen using Java.

            // HOW IT WORKS
            // Similar to the first pattern, this method uses multiple System.out.println() statements to print each line of the ASCII art. 
            // The design is more intricate, and the lines are arranged to create a specific image when displayed together.
            System.out.println("    .=\"\"=.   ");
            System.out.println("   /      \\ ");
            System.out.println("  | O    O |");
            System.out.println("  \\   /\\   / ");
            System.out.println("  /' =\\/= '\\");
            System.out.println(" / /      \\ \\     CHIP CHIP!");
            System.out.println(" \\/\\      /\\/");
            System.out.println("    '.  .'");
            System.out.println("    /|\\/|\\");
        }

}
