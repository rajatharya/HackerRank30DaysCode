package day9recursion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	int result;
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	Solution solution = new Solution();
    	System.out.println(solution.factorial(N));
    }
}