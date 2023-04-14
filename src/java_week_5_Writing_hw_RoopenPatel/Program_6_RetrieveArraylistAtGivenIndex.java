package java_week_5_Writing_hw_RoopenPatel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Java Program to retrieve an element ( at a specified index ) from given array list
 */
public class Program_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegList = new ArrayList<>();
        vegList.add("Cucumber");
        vegList.add("Potato");
        vegList.add("Cauliflower");
        vegList.add("Aubergine");
        vegList.add("Onion");
        vegList.add("Beetroot");
        vegList.add("Mushroom");
        vegList.add("Bitter Gourd");
        System.out.println(vegList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter An Index Number : ");
        int index = scan.nextInt();
        if (index < vegList.size()) {
            System.out.println(vegList.get(index));
        } else {
            System.out.println("Invalid Index");
        }
        scan.close();
    }
}
