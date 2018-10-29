package com.sort;

/**
 * 
 * @author pro.garen 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 4, 1, 3, 5, 0, 1, 3, 5, 8 };
		for (int i : bubbleSort(ar))
			System.out.println(i);
	}

	private static int[] bubbleSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;

	}

}
