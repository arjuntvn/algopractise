package com.self.arrays;

public class NegativeToOneSideTest {
	public static void main(String[] args) {
		int arr[] = { -1, -2, 4, 5, -2, 0, 1, 2, 5, -5, -6, -11 };
		System.out.println("Input array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		String negatives = "";
		String postivies = "";
		for (int i = 0; i < arr.length; i++) {
			int count = i;
			if (arr[i] < 0) {
				negatives += " " + arr[i];
			} else {
				postivies += " " + arr[i];
			}
		}

		System.out.println("Out array " + negatives + postivies);

	}
}
