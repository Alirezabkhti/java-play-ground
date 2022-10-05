package com.playground.main.learning.algorithms.sort;

public class _04_Merge {
	public static void sort(int[] unsorted, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int mid = ((rightIndex - leftIndex) / 2) + leftIndex;
			sort(unsorted, leftIndex, mid);
			sort(unsorted, mid + 1, rightIndex);
			merge(unsorted, leftIndex, mid, rightIndex);
		}
	}

	private static void merge(int[] unsorted, int leftIndex, int mid, int rightIndex) {
		int[] leftSide = new int[mid - leftIndex + 1];
		int[] rightSide = new int[rightIndex - mid];

		for (int i = 0; i < leftSide.length; i++) {
			leftSide[i] = unsorted[i + leftIndex];
		}

		for (int i = 0; i < rightSide.length; i++) {
			rightSide[i] = unsorted[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = leftIndex;

		while (i < leftSide.length && j < rightSide.length) {
			if (leftSide[i] < rightSide[j]) {
				unsorted[k] = leftSide[i];
				i++;
			} else {
				unsorted[k] = rightSide[j];
				j++;
			}
			k++;
		}

		while (i < leftSide.length) {
			unsorted[k] = leftSide[i];
			i++;
			k++;
		}

		while (j < rightSide.length) {
			unsorted[k] = rightSide[j];
			j++;
			k++;
		}
	}
}
