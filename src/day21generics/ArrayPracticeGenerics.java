package day21generics;

public class ArrayPracticeGenerics {

	public static <A> void printArray(A[] array) {
		for (A element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray1 = new Integer[5];
		Integer[] intArray2 = {7,9,12,43,54554};
		printArray(intArray1);
		printArray(intArray2);
		String[] stringArray1 = {"bananas", "apples", "Mangoes" };
		printArray(stringArray1);
	}

}
