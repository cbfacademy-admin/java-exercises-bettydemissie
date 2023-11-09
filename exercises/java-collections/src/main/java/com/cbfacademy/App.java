package com.cbfacademy;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        
        CollectionsExercises collectionsExercises = new CollectionsExercises();

        LinkedList<Integer> linkedListResult = collectionsExercises.useLinkedList();
        // Stack<Integer> stackResult = collectionsExercises.useStack();
        // ArrayDeque<Integer> arrayDequeResult = collectionsExercises.useArrayDeque();
        // HashMap<Integer, String> hashMapResult = collectionsExercises.useHashMap();

        // iterating over the linked list
        System.out.println("Linked List elements:");
        for (Integer element : linkedListResult) {
            System.out.println(element);
        }
    }
}
