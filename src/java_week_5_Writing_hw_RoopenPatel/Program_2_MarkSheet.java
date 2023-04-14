package java_week_5_Writing_hw_RoopenPatel;

import java.util.Scanner;

/**
 * Re-Write the student mark sheet program using the if else and the while loop
 */
public class Program_2_MarkSheet {
    public static void main(String[] args) {
        // Declaring the scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Student Name : ");
        String name = scan.next();
        System.out.println("Please Enter Student Roll Number : ");
        int rollNum = scan.nextInt();
        System.out.println("PLease Enter Maths Marks : ");
        int mathMarks = scan.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            mathMarks = scan.nextInt();
        }
        System.out.println("Please Enter Science Marks : ");
        int scienceMarks = scan.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            scienceMarks = scan.nextInt();
        }
        System.out.println("Please Enter English Marks : ");
        int englishMarks = scan.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            englishMarks = scan.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        // Closing the scanner object
        scan.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else
            return "PASS";
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + name + "           |");
        System.out.println("| Roll No       : " + rollNum + "        |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathsMarks + "     |");
        System.out.println("| Science       : " + scienceMarks + "   |");
        System.out.println("| English       : " + englishMarks + "   |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "     |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade    : " + grade + "               |");
        System.out.println("|----------------------------------------|");
    }
}
