package day11twodarrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] inputArray = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				inputArray[i][j] = scanner.nextInt();
			}
		}
		int sum = 0, maxSum = -63;
		for (int i = 0; i < inputArray.length - 2; i++) {
			for (int j = 0; j < inputArray.length - 2; j++) {
				sum = inputArray[i][j] + inputArray[i][j+1] + inputArray[i][j+2] +
						inputArray[i+1][j+1] + inputArray[i+2][j] + inputArray[i+2][j+1] + inputArray[i+2][j+2];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
	}

}