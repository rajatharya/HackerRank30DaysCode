package day7arrays;

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[arr.length - i -1];
			System.out.print(reverseArray[i]+" ");
		}
    }
}

