package day10binarynumbers;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base10Number = scanner.nextInt();
		int remainder = 0, counter = 0, maxCount = 0;
		while (base10Number > 0) {
			remainder = base10Number % 2;
			base10Number = base10Number / 2;
			if (remainder == 1) {
				counter ++;
				if (counter > maxCount) {
					maxCount = counter;
				}
			}
			else {
				counter = 0;
			}
		}
		System.out.println(maxCount);
	}
}
