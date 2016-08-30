package challenges;

import java.util.Scanner;

public class Day2Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // Original Meal Cost
		int tipPercent = scan.nextInt(); // tip Percentage
		int taxPercent = scan.nextInt(); // tax Percentage
		scan.close();
		
		double tip = mealCost * (tipPercent / 100.0);
		double tax = mealCost * (taxPercent / 100.0);
		double totalCostAcurate = mealCost + tip + tax;
		
		int totalCost = (int) Math.round(totalCostAcurate);
		
		System.out.println("The total meal cost is "+totalCost+" dollars.");
	}

}
