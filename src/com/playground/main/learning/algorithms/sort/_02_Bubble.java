package com.playground.main.learning.algorithms.sort;

public class _02_Bubble {
    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length - i - 1; j++) {
                if (unsorted[j] > unsorted[j + 1])
                    swap(unsorted, j, j + 1);
            }
        }
    }

    private static void swap(int[] arrayToSwap, int left, int right) {
        int temp = arrayToSwap[left];
        arrayToSwap[left] = arrayToSwap[right];
        arrayToSwap[right] = temp;
    }
}
