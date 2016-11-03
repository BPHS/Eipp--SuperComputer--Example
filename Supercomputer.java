/**
 * This is the start of a supercomputer
 *
 * Author: Arsenal
 * Date: Halloween, 2016
 * Desc: Use some for loops to show how fast our computer is
 */
import java.util.Scanner;

public class Supercomputer {

    public static void main (String[] args) {

        clearText();
        Scanner scanner = new Scanner(System.in);

        String c = "n";
        do {

            System.out.println("Welcome to the IBM Supercomputer!");
            System.out.println();
            System.out.println("Please select the speed test from the choices below:");
            System.out.println();
            System.out.println("1. Count from 0 to 100 by 5");
            System.out.println("2. Count from 100 to 1 by 1");
            System.out.println("3. Count from 1000 to 10000 by 1");
            System.out.println("4. Count from 20 to 200 by 2\n");
            System.out.print("Please make your choice: ");
            String choice = scanner.nextLine();
            
            if (choice.equals("1")) {

                for (int i = 0; i <= 100; i+=5) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (choice.equals("2")) {


                // count down from 100 to 0
                for (int i = 100; i >= 0; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else if (choice.equals("3")) {
            
                for (int i = 1000; i <= 10000; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                
            } else if (choice.equals("4")) {
                for (int i = 20; i <= 200; i+=2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.print("\nWould you like to run again (y/n): ");
            c = scanner.nextLine();
            clearText();

        } while (c.equals("y"));
        
        System.out.println("Thank you for testing my Supercomputer!!!");

    } /* end of main */



    public static void clearText() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

}








