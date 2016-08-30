package day14scope;

public class Difference {

	private int[] elements;
	public int maximumDifference = 0;
	
	public Difference(int[] array) {
		this.elements = array;
	}
	
	public void computeDifference () {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j != i && j < elements.length; j++) {
				int difference = Math.abs(elements[i] - elements[j]);
				if (difference > maximumDifference) {
					maximumDifference = difference;
				}
				System.out.println(i+" "+j+" "+maximumDifference);
			}
		}
	}
}
