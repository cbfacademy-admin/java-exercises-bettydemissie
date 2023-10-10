package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        // - add 4 as the first element of the list
        linkedList.addFirst(4);
        // - then add 5, 6, 8, 2, 9 to the the list
        linkedList.addAll(Arrays.asList(5, 6, 8, 2, 9));
        // - add another 2 as the last element of the list
        linkedList.addLast(2);
        // - add 4 as the 3rd element of the list
        linkedList.add(2, 4);
        // - invoke the method element() on the list and print the result on the screen
        System.out.println("Element at index 0: " + linkedList.element());
        // - return the list
        return linkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<>();
        // - add 5, 6, 8, 9 to the the stack
        stack.addAll(Arrays.asList(5, 6, 8, 9));
        // - print the first element of the stack on the screen
        System.out.println("First element of the stack: " + stack.firstElement());
        // - print the last element of the stack on the screen
        System.out.println("Last element of the stack: " + stack.lastElement());
        // - invoke the method pop() on the stack and print the result on the screen
        Integer poppedElement = stack.pop();
        System.out.println("Popped element from the stack: " + poppedElement);
        // - invoke the push(4) method on the stack
        stack.push(4);
        // - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // - add 5, 6, 8, 9 to the the stack
        arrayDeque.addAll(Arrays.asList(5, 6, 8, 9));
        // - print the first element of the queue on the screen
        System.out.println("First element of the queue: " + arrayDeque.peek());
        // - print the last element of the queue on the screen
        System.out.println("Last element of the queue: " + arrayDeque.peekLast());
        // - invoke the method poll() on the queue and print the result on the screen
        Integer polledElement = arrayDeque.poll();
        System.out.println("Polled element from the queue: " + polledElement);
        // - invoke the element() method on the queue and print the result on the screen
        System.out.println("Element at index 0: " + arrayDeque.element());
        // - return the queue
        return arrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashMap = new HashMap<>();
        // - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        // - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        // - add {3, Python} entry to the map
        hashMap.put(3, "Python");
        // - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        // - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        // - add {6, Rust} entry to the map
        hashMap.put(6, "Rust");
        // - determine the set of keys from the map and print it on the screen
        Set<Integer> keys = hashMap.keySet();
        System.out.println("Set of keys: " + keys);
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        boolean containsEnglish = hashMap.containsValue("English");
        System.out.println("Contains 'English' as a language: " + containsEnglish);
        // - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
