package edu.pingpong.romansgohome.app;

import java.util.Scanner;

import edu.pingpong.romansgohome.domain.regex.RomanNumber;

public class App {
    public static void main(String[] args) {

        RomanNumber romanNumber = new RomanNumber();

        String status = "";

        Scanner input = new Scanner(System.in);

        while (!status.equals("N")) {

            System.out.println("========================= ¡ WELCOME ! ================================\n");
            System.out.println("\t¡ Convert any Roman Number to Decimal !\n\n");
            System.out.println("Type a Roman Number below;");
            String inputRomanNum = input.nextLine();

            romanNumber.initRegexDictionary();
            romanNumber.setRomanNum(inputRomanNum);
            romanNumber.setDecimalNum(0);

            if (romanNumber.romanNumValidation()) {
                clearScreen();
                System.out.println("\n¡ Your number has been converted SUCCESSFULLY !\n");
                System.out.println("Roman Number ---> " + inputRomanNum);
                System.out.println("Decimal Number ---> " + romanNumber.toDecimal() + "\n");

                System.out.println("\n \n ========OTHER TIME?========!");
                System.out.println('\n' + "Y/N");

                Scanner confirm = new Scanner(System.in);
                status = confirm.nextLine();
                clearScreen();

            } else {
                clearScreen();
                System.out.println("\nSorry unable to convert this number: " + inputRomanNum + " :(\n");
                System.out.println("¡ Please enter a valid Roman Number !\n");
                System.out.println("\tRULES\n");
                System.out.println(
                        "- X, C and M can be 3 consecutive times\n- V, L and D can NOT be 3 consecutive times \n- V can NOT be substractive\n");
            }
        }
        clearScreen();
        System.out.println("\n\t==================== ¡ SEE YOU SOON ! ====================");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

// public static void main(String[] args) {
// String confirmationEntry = "";

// while (!confirmationEntry.equals("N")) {
// System.out.println("========ROMAN NUMERAL TO DECIMAL!========");
// System.out.println("Type a Roman Numeral:");
// String keyboardEntry = "";
// Scanner scannerEntry = new Scanner(System.in);
// keyboardEntry = scannerEntry.nextLine();

// RomanNumber romanNumber = new RomanNumber();
// romanNumber.initRegexDictionary();
// romanNumber.setRomanNum(keyboardEntry);

// if (romanNumber.romanNumValidation()) {
// clearScreen();
// System.out.println(
// "\n The value of " + keyboardEntry + " in decimal is: " +
// romanNumber.toDecimal());

// System.out.println("\n \n ========OTHER TIME?========!");
// System.out.println('\n' + "Y/N");

// Scanner scannerEntryConfirmation = new Scanner(System.in);
// confirmationEntry = scannerEntryConfirmation.nextLine();
// clearScreen();
// } else {
// clearScreen();
// System.out.println("\n The number " + keyboardEntry + " is not a valid Roman
// Numeral :(");
// }
// }
// clearScreen();
// System.out.println('\n' + "BYE!");
// }

// public static void clearScreen() {
// System.out.print("\033[H\033[2J");
// System.out.flush();
// }
// }
