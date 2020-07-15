package com.yash.learn.sort.selection;

class Algorithm {
    private int[] numbers = new int[100000];
    private int j = 0;
    private int len;
    public Algorithm()  {
        len = numbers.length;
        for(int i = 100000; i > 0; i--) {
            numbers[j] = i;
            j++;
        }
    }

    public void sort()  {
        for(int i = 0; i < len; i++)    {
            int minIndex = i;

            for(int j = i + 1; j < len; j++)    {
                if(numbers[j] < numbers[minIndex])  {
                    minIndex = j;
                }
            }

            if(minIndex != i)   {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {

        //Initialize object for Algorithm Class
        Algorithm algorithm = new Algorithm();

        System.out.println("Selection Sort Program");
        long startTime = System.currentTimeMillis();

        //Call sorting method to run in  Worst Case scenario
        algorithm.sort();

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) ;

        System.out.println("Total Time for Sorting 100,000 values : " + totalTime + " milliseconds");
    }
}
