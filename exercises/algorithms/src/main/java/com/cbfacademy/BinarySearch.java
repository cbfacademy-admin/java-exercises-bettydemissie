package com.cbfacademy;

public class BinarySearch {

    public int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                // Element found, return its index
                return mid; 
            } else if (arr[mid] < x) {
                // Search in the right half
                low = mid + 1; 
            } else {
                // Search in the left half
                high = mid - 1; 
            }
        }
        // Element not found
        return -1; 
    }
}
