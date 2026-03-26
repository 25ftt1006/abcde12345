import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.File;

public class P5_25FTT1006 {
    public static void main(String[] args) {
        // 5.1 - WordComparison.java
        // 5.2 - Reverse5Letters.java
        // 5.3 - ReplaceSubstring.java
        // 5.4 - ModulusQuestion.java
        // 5.5 - QueueReceipt.java
    }

    public static void wordComparison() {
        // 5.1 - WordComparison.java

        // PURPOSE: Program compares two words to check if they are the same, ignoring case sensitivity.

        // DESCRIPTION HOW IT WORKS: 
        // The program asks the user to enter two words, then compare the two words using the .equalsIgnoreCase method and prints whether the two words are the same(true/false).

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstWord = input.next();
        System.out.println("Enter the second word: ");
        String secWord = input.next();
        System.out.println(firstWord.equalsIgnoreCase(secWord));

        System.out.println("");
        
        System.out.println("Enter the first word: ");
        String thirdWord = input.next();
        System.out.println("Enter the second word: ");
        String fourthWord = input.next();
        System.out.println(thirdWord.equalsIgnoreCase(fourthWord));
    }
    
    public static void Reverse5Letters(){
        // 5.2 - Reverse5Letters.java

        // PURPOSE: To reverse the entered word that has exactly 5 letters by user.

        // DESCRIPTION HOW IT WORKS:
        // The program asks the user to enter a word, then checks if the word has exactly 5 letters. If it does, 
        // it reverses the word by accessing each character using charAt() method and concatenating them in reverse order. 
        // Finally, it prints the reversed word. If the input does not have 5 letters, it will just print an error message telling the user input is invalid and to enter a 5 letter word.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 5 letters word: ");
        String letters = input.next();
        int lettersDigit = letters.length();
        String reverseLetters = letters.charAt(4)+""+letters.charAt(3)+""+letters.charAt(2)+""+letters.charAt(1)+""+letters.charAt(0);
        System.out.println(lettersDigit==5 ? "The reverse of the word " + letters + " is " + reverseLetters : "Invalid input. Please enter a 5 letter word.");

        System.out.println("Enter the 5 letters word: ");
        String letters2 = input.next();
        int lettersDigit2 = letters2.length();
        String reverseLetters2 = letters2.charAt(4)+""+letters2.charAt(3)+""+letters2.charAt(2)+""+letters2.charAt(1)+""+letters2.charAt(0);
        System.out.println(lettersDigit2==5 ? "The reverse of the word " + letters2 + " is " + reverseLetters2 : "Invalid input. Please enter a 5 letter word.");
    }

    public static void replaceSubstring() {
        // 5.3 - ReplaceSubstring.java

        // PURPOSE: To replace a chosen substring in the user's input message with another substring provided by the user.

        // DESCRIPTION HOW IT WORKS:
        // The program asks the user to enter a message, and then asks the substring from the message that they want to replace, and also the replacement message for the chosen substring. 
        // It then uses the String.replace() method to create a new string with the specified substring replaced by the new substring, and prints the updated message. 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String messageString = input.nextLine();

        System.out.println("Enter the substring to replace: ");
        String messageToReplace = input.nextLine();

        System.out.println("Enter the replacement string: ");
        String replacementMessageString = input.nextLine();
        System.out.println("The updated message is: " + messageString.replace(messageToReplace, replacementMessageString));

        System.out.println("Enter your message: ");
        String messageString2 = input.nextLine();

        System.out.println("Enter the substring to replace: ");
        String messageToReplace2 = input.nextLine();

        System.out.println("Enter the replacement string: ");
        String replacementMessageString2 = input.nextLine();
        System.out.println("The updated message is: " + messageString2.replace(messageToReplace2, replacementMessageString2));

    }

    public static void ModulusQuestion() throws IOException{
        // 5.4 - ModulusQuestion.java

        // PURPOSE: To generate a modulus question with two random numbers and save it to a text file.
        // DESCRIPTION HOW IT WORKS:
        // The program creates a new folder using mkdir(), called "Practical 5" and a new text file using createNewFile(), called "Modulus Questions.txt" inside the folder. 
        // Then generates two random numbers, and creates a modulus question using those two numbers, and write the question to the Modulus Questions.txt file.
        // Finally, it prints a message in the terminal confirming that a new question has been added. The content in the txt file will not be overwritten, 
        // hence questions will be added to the end of the txt file each time the program is run.

        Scanner input = new Scanner(System.in);

        // Create a new folder (Practical 5) in the folder (25FTT1006)
        File folder = new File("/Users/ibrahimsatria/Documents/Java/25FTT1006/Practical 5");
        folder.mkdir();

        // Create a new file (Modulus Questions.txt) in the folder (Practical 5)
        File file = new File("/Users/ibrahimsatria/Documents/Java/25FTT1006/Practical 5/Modulus Questions.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file, true);
        
        // Create 1st random number generator
        int randomNo1 = (int)(Math.random()*100);   

        // Create 2nd random number generator
        int randomNo2 = (int)(Math.random()*100);

        writer.write(randomNo1 + " % " + randomNo2 + " = " + "?\r\n");
        System.out.println("A new question added.");
        writer.close();
    }

    public static void QueueReceipt() throws IOException{
        // 5.5 - QueueReceipt.java

        // PURPOSE: To generate a queue receipt in a text file format with the user's name, a random queue number, and the current date and time.
        // DESCRIPTION HOW IT WORKS:
        // The program asks the user to enter their name and converts it to uppercase using toUpperCase(), then creates a new text file called "QReceipt.txt" in the "Practical 5" folder. 
        // Then generates a random queue number using Math.random() and gets the current date and time using LocalDateTime.now(), creates a custom date format using DateTimeFormatter, then formats the date and time using the custom format, 
        // and writes the receipt information (date and time, greeting and user's name in uppercase, and user's queue number) to the QReceipt.txt file. 
        // Finally, it prints a message in the terminal confirming that the receipt has been generated.
        
        Scanner input = new Scanner(System.in);

        // Ask for user name
        System.out.println("Enter name: ");
        String usernameInput = input.nextLine();
        String usernameConverted = usernameInput.toUpperCase();

        // Generate folder and receipt
        File file = new File("/Users/ibrahimsatria/Documents/Java/25FTT1006/Practical 5/QReceipt.text");
        file.createNewFile();
        FileWriter writer = new FileWriter(file, true);

        // Generate Queue Number (Random No)
        int queueNumber = (int)(Math.random()*100);

        // Create Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a custom date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the Date and Time
        String formattedDate = currentDateTime.format(dateFormatter);

        writer.write(
            formattedDate +
            "\nHi, " + usernameConverted +
            "\nYour Queue No is: " + queueNumber
        );
        writer.close();
        System.out.println("Receipt generated. Thank you.");

        
    }
}

