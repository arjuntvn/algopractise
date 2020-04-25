package com.cci.chapter1;

public class MatrixHandler {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 6, 0 }, { 9, 1, 2 } };
		identifyAndReplaceZero(a);
	}

	private static void identifyAndReplaceZero(int[][] a) {
		int row = 0;
		int column = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 0) {
					row = i;
					column = j;
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("zero is present in the follwing row"+(row+1)+"\t"+"column"+(column+1));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i== row) {
					row = i;
					a[i][j]=0;
				}else if(j==column) {
					a[i][j]=0;
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
