package com.cbfacademy;

public class LinearSearch {
    public LinearSearch(int[] myArray, int elementToFind) {
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  
            }
        }
        return -1;  // Return -1 if the element is not found in the array
    }
}
