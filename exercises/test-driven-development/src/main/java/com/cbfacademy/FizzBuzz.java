package com.cbfacademy;

public class FizzBuzz {

    public static String of(Integer i) {
        
        if(i%3 == 0 && i%5 == 0){
            return "FizzBuzz";
        }
        else if(i % 3 == 0){
            return "Fizz";
        }
        else if(i % 5 == 0){
            return "Buzz";
        }
        else{
            return i.toString();
        }
    
    }

}
