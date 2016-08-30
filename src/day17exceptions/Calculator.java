package day17exceptions;

class Calculator {

	public int power(int n, int p) throws Exception  {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			int result = (int) Math.pow(n, p);
			return result;
		}
	}
}
