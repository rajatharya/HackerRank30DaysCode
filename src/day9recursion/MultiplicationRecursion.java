package day9recursion;

import java.util.Scanner;

public class MultiplicationRecursion {

	// My code
	private int multiply(int a, int b) {
		int product = 0;
		if (b == 0) {
			return 0;
		}
		b = b - 1;
		product = a + multiply(a, b);
		if (true) {
			System.out.println("test");
		}  if (true) {
			System.out.println("SecondTest");
		}
		return product;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		MultiplicationRecursion multiplicationRecursion = new MultiplicationRecursion();
		int product =  multiplicationRecursion.multiply(a, b);
		System.out.println(product);
	}

}
