package Imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8);
        List<Integer> uniqueValues = new ArrayList<>();

        // "value" variable is changed/updated for each iteration.
        for (int value : values) {
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            }
        }
        System.out.println("UniqueValues: " + uniqueValues);
    }
}