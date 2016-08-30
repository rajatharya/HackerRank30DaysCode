package day16exceptions;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try {
			Scanner scanner1 = new Scanner(System.in);
			String string = scanner1.next();
			scanner1.close();
			Scanner scanner = new Scanner(string);
			System.out.println(scanner.nextInt());
			scanner.close();
		} catch (Exception e) {
			System.out.println("Bad String");
		}
	}

}
