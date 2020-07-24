package com.yash.learn.stack.inbuilt;

import java.util.Random;
import java.util.Stack;

/**
 * Inbuilt Stack class with Integer type
 * @author yash007
 * July 23rd, 2020
 */

public class Algorithm {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Random random = new Random();
        //Push Operation for random data inside the stack
        for(int i = 1; i < 10; i++) {
            System.out.println("Pushed: " + stack.push(i * random.nextInt(100)));
        }

        //Peek Operation
        System.out.println("Peek: " + stack.peek());

        //Pop operation
        System.out.println("Pop: " + stack.pop());

        //Peek operation
        System.out.println("Peek: "+stack.peek());

        //Search for Random value
        int temp = random.nextInt(900);
        System.out.println("Search for: " + temp + " is :" + stack.search(temp));

        //Stack empty
        stack.clear();
        System.out.println("Is stack empty? " + stack.empty());
    }
}
