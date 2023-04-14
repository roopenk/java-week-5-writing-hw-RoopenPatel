package Program_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring the scanner object
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please Enter First Number : "); // Input wizard
            int a = scan.nextInt();
            System.out.println("Please Enter Second Number : "); // Input wizard
            int b = scan.nextInt();
            System.out.println("PLease Enter Operational Symbol +,-,/ Or * : "); // Input wizard
            char symbol = scan.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would You Like To Do More Calculations...? Please Enter Either 'Y' Or 'N' : ");
            answer = scan.next().toLowerCase(Locale.ROOT);
        } while (answer.startsWith("y"));
        // Closing the scanner object
        scan.close();
    }
}
