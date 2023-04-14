package java_week_5_Writing_hw_RoopenPatel;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people Number that stores String Keys and Integer Values,
 * use for each loop to iterate values from Map
 */
public class Program_9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleNumber = new HashMap<>();
        // Adding keys and values
        peopleNumber.put("Monday", 102);
        peopleNumber.put("Tuesday", 103);
        peopleNumber.put("Wednesday", 104);
        peopleNumber.put("Thursday", 105);
        peopleNumber.put("Friday", 106);
        peopleNumber.put("Saturday", 107);
        peopleNumber.put("Sunday", 101);

        for (Map.Entry<String, Integer> peopleNum : peopleNumber.entrySet()) {
            System.out.println(peopleNum.getKey() + " = " + peopleNum.getValue());
        }
    }
}

