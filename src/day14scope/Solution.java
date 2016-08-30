package day14scope;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		Difference difference = new Difference(a);
		difference.computeDifference();
        System.out.print(difference.maximumDifference);
	}

}
