package day21generics;

public class ArrayPractice {

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void printArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i ++) {
			String item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] intArray1;
		int[] intArray2 = new int[4];
		printArray(intArray2);
		
		int[] intArray3 = {5,2,9,1,3};
		String[] stringArray1 = {"bananas", "apples", "pears"};
		
		printArray(intArray3);
		printArray(stringArray1);
	}

}
