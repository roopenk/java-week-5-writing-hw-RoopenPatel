package java_week_5_Writing_hw_RoopenPatel;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * A Java program to iterate through all elements on ana array list using Iterator
 */
public class Program_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("Blackberry");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + ", ");
        }
    }
}
