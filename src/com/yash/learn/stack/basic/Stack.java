package com.yash.learn.stack.basic;

import java.util.Random;

/**
 * Basic integer based Stack Implementation
 * @author yash007
 * July 22nd, 2020
 */

class Algorithm  {
    int[] stack;
    int pointer;
    public Algorithm()  {
        stack = new int[100];
        pointer = 0;
    }
    public void push(int value)   {
        pointer++;
        stack[pointer] = value;
        System.out.println("Pushed on Stack: " + value);
    }

    public void pop()    {
        if(pointer != 0)    {
            int temp = stack[pointer];
            System.out.println("Pop on Stack: " + temp);
            stack[pointer] = 0;
            pointer--;
        }
        else
            System.out.println("Stack Empty");
    }

    public void peek()   {
        if (pointer == 0 && stack[pointer] == 0)
            System.out.println("Stack Empty");
        else
            System.out.println("Peek on Stack: " + stack[pointer]);
    }

    public void search(int key) {
        boolean result = false;
        for(int i = pointer; i >= 0; i--)   {
            if(stack[i] == key) {
                result = true;
                break;
            }
        }
        if(result == true)
            System.out.println("Value found: "+ key);
        else
            System.out.println("Not found: " + key);
    }

    public void empty() {
        for(int i = pointer; i >= 0; i--)
            stack[i] = 0;

        System.out.println("Stack cleared");
        pointer = 0;
    }
}
public class Stack {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        Random random = new Random();

        //Push Operation for random data inside the stack
        for(int i = 1; i < 10; i++) {
            algorithm.push(i * random.nextInt(100));
        }

        //Peek Operation
        algorithm.peek();

        //Pop operation
        algorithm.pop();

        //Peek operation
        algorithm.peek();

        //Search for Random value
        algorithm.search(random.nextInt(900));

        //Stack empty
        algorithm.empty();

        //Peek operation
        algorithm.peek();
    }
}
