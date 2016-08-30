package challenges;

import java.util.Scanner;

public class Day3ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String ans = "";
		
		if (n%2 == 1) {
			ans = "Weird";
		}
		else {
			if ((n >= 2 && n <= 5) || n > 20) {
				ans = "Not Weird";
			}
			else if (n >= 6 && n <= 20) {
				ans = "Weird";
			}
		}
		
		System.out.println(ans);
	}

}
