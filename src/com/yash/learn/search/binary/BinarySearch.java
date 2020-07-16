package com.yash.learn.search.binary;

class Algorithm {
    public int[] numbers = new int[100000];
    public int len;

    public Algorithm()  {
        for(int i = 0; i < 100000; i++)    {
            numbers[i] = i;
        }
        len = numbers.length;
    }

    public void search(int key)    {
        int left = 0;
        int right = len - 1;
        while(left <= right)    {
            int mid = left + (right - left) / 2;

            if(numbers[mid] == key) {
                System.out.println("Result: Found!");
                return;
            }

            if(numbers[mid] < key)  {
                left = mid + 1;
            }
            else    {
                right = mid - 1;
            }
        }
        System.out.println("Result: Not found!");
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        //Initialize object for Algorithm Class
        Algorithm algorithm = new Algorithm();

        System.out.println("Binary Search Program");
        long startTime = System.currentTimeMillis();

        //Call sorting method to run in  Worst Case scenario
        algorithm.search(12345);

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) ;

        System.out.println("Total Time for Binary Search in 100,000 values : " + totalTime + " milliseconds");
    }
}
