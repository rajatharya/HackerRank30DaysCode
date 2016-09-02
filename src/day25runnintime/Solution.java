package day25runnintime;

import java.util.Scanner;;

public class Solution {

	public static void isPrime(int number) {
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if (number % j == 0) {
				isPrime = false;
			}
		}
		if (number == 1) {
			System.out.println("Not prime");
		} else if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int inputNumber = scanner.nextInt();
			isPrime(inputNumber);
		}
	}
}