package com.playground.main.learning.algorithms.sort;

public class _6_Counting {
    public static void sort(int[] unsorted, int maxValue) {
        int[] countArray = new int[maxValue + 1];
        int[] culArray = new int[maxValue + 1];
        int[] output = new int[maxValue + 1];
        for (int i = 0; i < unsorted.length; i++) {
            countArray[unsorted[i]]++;
        }
        for (int i = 1; i < culArray.length; i++) {
            culArray[i] = countArray[i] + culArray[i - 1];
        }

        for (int i = 0; i < unsorted.length; i++) {
            output[culArray[unsorted[i]] - 1] = unsorted[i];
            countArray[unsorted[i]]--;
        }

        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = output[i];
        }
    }
}
