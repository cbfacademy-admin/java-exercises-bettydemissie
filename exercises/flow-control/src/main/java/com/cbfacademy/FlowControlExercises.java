package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();
        
        for (int number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } 
            // - it adds the element to the list in any other case
            else {
                result.add(String.valueOf(number));
            }
        }
        // - it returns the constructed list
        return result;
    } 

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}
        String[] months = {
                "Invalid month number",// placeholder for index 0
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        // - if the ${number} is invalid, the method should return "Invalid month
        // number"
        if (number >= 1 && number <= 12) {
            return months[number];
        } else {
            return months[0];
        }
  
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // - determines the sum of all the even numbers in the list
        // - determines the sum of all the odd numbers in the list
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number; 
            } else {
                sumOfOdds += number; 
            }
        }

        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfOdds", sumOfOdds);
        result.put("SumOfEvens", sumOfEvens);
        

        // - returns a map with two entries:
        return result;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        // - it takes an array list of integers
        List<Integer> reversedresult = new ArrayList<>();
        
        for(int i= numbers.size() - 1; i >= 0; i-- )
        {
            reversedresult.add(numbers.get(i));
        }
        // - it returns the list in reverse order
        return reversedresult;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
