package com.playground.main.learning.algorithms.search;

public class BinarySearchTree {
	public static boolean search(int[] sortedArray, int low, int high, int keyToFind) {
		if (low <= high && keyToFind >= low) {
			int mid = (low + high) / 2;
			if (keyToFind == mid) {
				return true;
			} else if (keyToFind < mid) {
				return search(sortedArray, low, mid, keyToFind);
			} else {
				return search(sortedArray, mid + 1, high, keyToFind);
			}
		} else {
			return false;
		}
	}
}
