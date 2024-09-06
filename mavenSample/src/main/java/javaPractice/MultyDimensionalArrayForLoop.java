package javaPractice;

import java.util.Scanner;

public class MultyDimensionalArrayForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value");
		int row = sc.nextInt();
		System.out.println("Enter column value");
		int col = sc.nextInt();
		System.out.println("enter the elements");
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("value at a [" + i + "] [" + j + "]th: " + a[1][j]);
			}
		}

	}
}
