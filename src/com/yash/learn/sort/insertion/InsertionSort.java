package com.yash.learn.sort.insertion;

class Algorithm  {
    private int numbers[] = new int[100000];
    private int len;
    private int j=0;

    public Algorithm()  {
        for(int i = 100000; i > 0; i--) {
            numbers[j] = i;
            j++;
        }
    }

    public void sort()  {
        len = numbers.length;
        for(int i = 1; i < len; i++)    {
            int key = numbers[i];
            int j = i - 1;

            while(j >= 0 && numbers[j] > key)   {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

            numbers[j + 1] = key;

        }
    }

}
public class InsertionSort {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();

        System.out.println("Insertion Sort Program");
        long startTime = System.currentTimeMillis();

        //Call sorting method to run in  Worst Case scenario
        algorithm.sort();

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) ;

        System.out.println("Total Time for Sorting 100,000 values : " + totalTime + " milliseconds");
    }
}
