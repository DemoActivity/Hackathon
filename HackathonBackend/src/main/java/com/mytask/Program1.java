package com.mytask;

public class Program1 {

	public static int[] selectionSort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 4, 6, 9, 8 };
		int n = arr.length;
		System.out.println(n);
		int[] arr2 = selectionSort(arr, n);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
