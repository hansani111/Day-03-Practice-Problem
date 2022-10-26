package com.day.practice.problem03;

public class SmallestNumber {

	public static void main(String[] args) {
		int array[] = { 4, 3, 5, 6, 7, 9, 8 };
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Lagrgest Number : " + min);

	}

}
