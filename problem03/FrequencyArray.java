package com.day.practice.problem03;

import java.util.Scanner;



public class FrequencyArray {
	
	int array [] = new int[10];
	int key; // frequency found -- find value
	
	void getData() { // input section
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) { // |5|3|2|8|2|7|8|2|7|3|
			System.out.println("enter number : ");
			array[i] = sc.nextInt();

		}
		System.out.println("enter number to find frequency : ");
		key = sc.nextInt();
	}
	void Count() { // work perform section

		int Count = 0;
		for (int i = 0; i < 10; i++) {
			if (array[i] == key) {
				Count = Count + 1;
			}
			System.out.println("Frequency : " + Count);

		}
	}
	
	public static void main(String[] args) {
		FrequencyArray frequencyArray = new FrequencyArray();
		frequencyArray.getData();
		frequencyArray.Count();

	}

}
