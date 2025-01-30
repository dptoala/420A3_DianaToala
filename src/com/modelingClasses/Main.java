package com.modelingClasses;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    System.out.println("Hello world");

    //Library Class
    //    Library library = new Library();
    //    Book book1 = new Book("1984", "George Orwell", 328);
    //    System.out.println("Adding book1: " + library.AddBook(book1));  // true

//Example to Scanner
    Scanner scanner = new Scanner(System.in);
    int nValue = getValidatedInt(scanner, "Enter an int: ", "Error not valid", 1, 10);
    scanner.close();

    //Other option is send a parameter new Scanner(System.in)
    //int nValue = getValidatedInt(new Scanner(System.in), "Enter an int: ", "Error not valid", 1, 10)

    // Other way
    int nValue2 = ScannerDemo.getValidatedInt2(scanner, "Enter an int: ", "Error not valid", 1, 10);

    } // public static void

    public static int getValidatedInt(Scanner scanner, String prompt, String errorMessage, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Error: " + errorMessage);
                }
            } else {
                System.out.println("Error: " + errorMessage);
                scanner.next(); // Consume invalid input
            }
        }
    }// end getValidateInt

    public static class ScannerDemo{
        public static int getValidatedInt2(Scanner scanner, String prompt, String errorMessage, int min, int max) {
            int value;
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    if (value >= min && value <= max) {
                        return value;
                    } else {
                        System.out.println("Error: " + errorMessage);
                    }
                } else {
                    System.out.println("Error: " + errorMessage);
                    scanner.next(); // Consume invalid input
                }
            }
        }// end getValidateInt
    }
}// public class Main
