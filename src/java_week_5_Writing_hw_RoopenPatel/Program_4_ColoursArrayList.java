package java_week_5_Writing_hw_RoopenPatel;

import java.util.ArrayList;

/**
 * A Java program to create a new array list, add colour names(String type) and print out the collection
 * by using for each loop
 */
public class Program_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Orange");
        colourList.add("Purple");
        colourList.add("Cyan");

        for (String colorList : colourList) {
            System.out.print(colorList + ", ");
        }

    }
}
