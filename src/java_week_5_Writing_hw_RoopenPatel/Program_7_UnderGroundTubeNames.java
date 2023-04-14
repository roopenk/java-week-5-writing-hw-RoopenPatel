package java_week_5_Writing_hw_RoopenPatel;

import java.util.ArrayList;

/**
 * A Java program to test an array list is empty ot not, define array list with underground tube line names
 */
public class Program_7_UnderGroundTubeNames {
    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_Line");
        tubeNames.add("Central Line");
        tubeNames.add("Circle Line");
        tubeNames.add("District Line");
        tubeNames.add("Hammersmith And City Line");
        tubeNames.add("Jubilee Line");
        tubeNames.add("Metropolitan Line");
        tubeNames.add("Northern Line");
        tubeNames.add("Piccadilly Line");
        tubeNames.add("Victoria Line");
        tubeNames.add("Waterloo And City Line");
        System.out.println("The Given Array List : " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("The Given Array List Is Empty");
        } else {
            System.out.println("The Given Array List Is Not Empty");
        }
    }

    public static void main(String[] args) {
        Program_7_UnderGroundTubeNames obj = new Program_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
