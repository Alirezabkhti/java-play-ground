package com.playground.main.learning.algorithms.sort;

public class _01_Selection {
    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }
            swap(unsorted, i, minIndex);
        }
    }

    private static void swap(int[] arrayToSwap, int left, int right) {
        int temp = arrayToSwap[left];
        arrayToSwap[left] = arrayToSwap[right];
        arrayToSwap[right] = temp;
    }
}
