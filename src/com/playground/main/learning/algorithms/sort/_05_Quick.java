package com.playground.main.learning.algorithms.sort;

public class _05_Quick {
	public static void sort(int[] unsorted, int left, int right) {
		int partitionIndex = partition(unsorted, left, right);
		if (left < partitionIndex - 1) {
			sort(unsorted, left, partitionIndex - 1);
		}
		if (partitionIndex < right) {
			sort(unsorted, partitionIndex, right);
		}
	}

	private static int partition(int[] arrayToPartition, int left, int right) {
		int pivot = arrayToPartition[(right + left) / 2];
		while (left <= right) {
			while (arrayToPartition[left] < pivot) {
				left++;
			}

			while (arrayToPartition[right] > pivot) {
				right--;
			}

			if (left <= right) {
				swap(arrayToPartition, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arrayToSwap, int left, int right) {
		int temp = arrayToSwap[left];
		arrayToSwap[left] = arrayToSwap[right];
		arrayToSwap[right] = temp;
	}
}
