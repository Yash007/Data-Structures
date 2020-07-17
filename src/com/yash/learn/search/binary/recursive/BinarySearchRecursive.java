package com.yash.learn.search.binary.recursive;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        int[] numbers = new int[100000];
        for(int i = 0; i < 100000; i++)    {
            numbers[i] = i;
        }
        int left = 0;
        int right = numbers.length - 1;
        int mid = left + (right - left) / 2;
        int key = 99999;

        System.out.println("Recursive binary search algorithm");
        long startTime = System.currentTimeMillis();
        binarySearchRecursive.recursiveBinarySearch(numbers, left, right, mid, key);
        long endTime = System.currentTimeMillis();

        long totalTime = (endTime - startTime) ;

        System.out.println("Total Time for Binary Search in 100000 values : " + totalTime + " milliseconds");
    }

    public int recursiveBinarySearch(int[] numbers, int left, int right, int mid, int key) {
        if(right >= left) {
            if (numbers[mid] == key) {
                System.out.println("Found!");
                return 1;
            }

            if (numbers[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
            mid = left + (right - left) / 2;

            return recursiveBinarySearch(numbers, left, right, mid, key);
        }
        System.out.println("Not found!");
        return -1;
    }
}
