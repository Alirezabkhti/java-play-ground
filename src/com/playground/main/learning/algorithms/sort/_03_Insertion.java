package com.playground.main.learning.algorithms.sort;

public class _03_Insertion {
	public static void sort(int[] unsorted) {
		int hullIndex = 1;
		for (int i = 0; i < unsorted.length - 1; i++) {
			for (int j = hullIndex; j > 0; j--) {
				if (unsorted[j] < unsorted[j - 1]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j - 1];
					unsorted[j - 1] = temp;
				}
			}
			hullIndex++;
		}
	}
}
