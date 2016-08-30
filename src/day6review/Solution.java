package day6review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	scan.nextLine();
    	String string1 = "";
    	String string2 = "";
    	for (int i = 1; i <= T; i++) {
			String string = scan.nextLine();
			for (int j = 0; j < string.length(); j++) {
				if ((j==0) || (j%2==0)) {
					string1 = string1+string.charAt(j);
				}
				else {
					string2 = string2+string.charAt(j);
				}
			}
			System.out.println(string1+ " "+ string2);
			string1 = "";
			string2 = "";
		}
    	scan.close();
    }
}