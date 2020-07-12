package com.yash.learn.sort.bubble;

/**
 * Bubble Sort Algorithm
 * Author - Yashkumar Sompura
 * July 10th, 2020
 */

class Algorithm  {
    public int numbers[] = new int[100000];
    public int j = 0;

    public Algorithm()  {
        for(int i = 100000; i > 0; i--)   {
            numbers[j] = i;
            j++;
        }
    }

    public void sort()  {
        int temp;
        for(int i = 0; i < 100000; i++)    {
            for(int j = i + 1; j < 100000; j++){
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Done!");
    }
}
public class BubbleSort {
    public static void main(String[] args) {

        //Initialize object for Algorithm Class
        Algorithm algorithm = new Algorithm();

        System.out.println("Bubble Sort Program");
        long startTime = System.currentTimeMillis();

        //Call sorting method to run in  Worst Case scenario
        algorithm.sort();

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) ;

        System.out.println("Total Time for Sorting 100,000 values : " + totalTime + " milliseconds");
    }
}