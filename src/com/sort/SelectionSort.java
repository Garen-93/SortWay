package com.sort;

/**
 * 
 * @author pro.garen 选择排序
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = { 4, 1, 3, 5, 0, 1, 3, 5, 8 };
		for (int i : collectionSort(ar))
			System.out.println(i);
	}

	private static int[] collectionSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			int k = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[k] > array[j]) {
					k = j;
				}
			}
			if (k > i) {
				temp = array[k];
				array[k] = array[i];
				array[i] = temp;
			}

		}
		return array;

	}

}
