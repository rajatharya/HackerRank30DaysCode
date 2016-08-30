package day12inheritance;

public class Student extends Person {

	private int[] testScores;
	
	public Student(String firstName, String lastName, int idNumber, int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}
	
	
	public char calculate() {
		int average = 0, sum = 0;
		
		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}
		average = sum / testScores.length;
		
		if (average >= 90 && average <= 100) {
			return 'O';
		}
		else if (average >= 80 && average < 90) {
			return 'E';
		}
		else if (average >= 70 && average < 80) {
			return 'A';
		}
		else if (average >= 55 && average < 70) {
			return 'P';
		}
		else if (average >= 40 && average < 55) {
			return 'D';
		}
		else if (average >= 0 && average < 40) {
			return 'T';
		}
		return 0;
	}
	
	
}
