package com.cbfacademy;

public class App {
    public static void main(String[] args) {

        MergeSort ms = new MergeSort();

        int[] arr = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        int x = 13;

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        ms.mergeSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }


       BinarySearch binarySearch = new BinarySearch();

        int result = binarySearch.binarySearch(arr, x);

        if (result != -1) {
            System.out.println("\nElement found at index " + result);
        } else {
            System.out.println("\nElement not found in the array");
        }

        
        int[] myArray = { 5, 2, 9, 1, 5, 6 };
        int elementToFind = 9;

        int linearresult = LinearSearch.linearSearch(myArray, elementToFind);

        if (linearresult != -1) {
            System.out.println("Element " + elementToFind + " found at index " + linearresult);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array");
        }
    }

    
}
