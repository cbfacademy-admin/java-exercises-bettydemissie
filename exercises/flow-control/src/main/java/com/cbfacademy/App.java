package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        FlowControlExercises exercises = new FlowControlExercises();
        //FIZZBUZZ
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(15);

        // Call the fizzBuzz method and store the result
        List<String> result = exercises.fizzBuzz(numbers);
        // Print the result
        for (String item : result) {
            System.out.println(item);
        }

        // WHICH MONTH
        // Test the whichMonth method with various inputs
        int validMonth = 7; 
        int invalidMonth = 13; // Invalid month number

        // Call the whichMonth method and store the results
        String validMonthResult = exercises.whichMonth(validMonth);
        String invalidMonthResult = exercises.whichMonth(invalidMonth);
        // Print the results
        System.out.println("Month for " + validMonth + ": " + validMonthResult);
        System.out.println("Month for " + invalidMonth + ": " + invalidMonthResult);


        // SUM OF ODD AND EVEN NUMBERS IN ARRAY 1 to 100
        Map<String, Integer> onetoonehundred =  exercises.sumOfOddsAndSumOfEvens();
        System.out.println(onetoonehundred);


        // REVERSE AN ARRAY LIST
        ArrayList<Integer> arrayofnumbers = new ArrayList<>();
        arrayofnumbers.add(1);
        arrayofnumbers.add(2);
        arrayofnumbers.add(3);
        arrayofnumbers.add(4);
        arrayofnumbers.add(5);

        // Call the reverse method and store the result
        List<Integer> reversedNumbers = exercises.reverse(arrayofnumbers);

        // Print the reversed list
        System.out.println("Original List: " + arrayofnumbers);
        System.out.println("Reversed List: " + reversedNumbers);


    }
}
