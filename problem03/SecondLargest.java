package com.day.practice.problem03;

public class SecondLargest {

	public static void main(String[] args) {
		int array[] = { 8, 2, 4, 6, 7, 9, 1, 3, 5 };
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
		System.out.println("Second Largest Element in array : " + array[1]);
	}
}
