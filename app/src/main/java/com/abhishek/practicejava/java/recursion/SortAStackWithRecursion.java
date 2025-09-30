package com.abhishek.practicejava.java.recursion;

import java.util.Stack;

public class SortAStackWithRecursion {
    public static void utils(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        Integer top1 =stack.pop();               //This remove and return the top element
        Integer top2 =stack.peek();             //Thi only return the top element
        System.out.println(stack.isEmpty());    //Check if stack is empty
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println(stack.size());
        System.out.println(stack.contains(20));
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() <= 1) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);          //Recursively sort the remaining stack
        insertSorted(stack,top);   //Insert the popped item in the sorted stack
    }

    private static void insertSorted(Stack<Integer> stack, int element){
        //Base case: insert when stack is empty or top <= element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, element);  //Recurse deeper
        stack.push(top);               //Put back the top element
    }
}
