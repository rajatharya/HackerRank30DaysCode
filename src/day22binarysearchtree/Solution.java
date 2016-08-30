package day22binarysearchtree;

import java.util.*;
import java.io.*;

public class Solution {
	
	public static int getHeight(Node root) {
		int leftHeight = 0, rightHeight = 0;
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			//printHeightOfEachNode(root, leftHeight, rightHeight);
			return 0;
		} 
		if (root.left != null){
			leftHeight =  1 + getHeight(root.left);
		} 
		if (root.right != null) {
			rightHeight =  1 + getHeight(root.right);
		}
		//printHeightOfEachNode(root, leftHeight, rightHeight);
		return compareLeftRightHeight(leftHeight, rightHeight);
	}
	
	public static int compareLeftRightHeight(int leftHeight, int rightHeight) {
		if (leftHeight > rightHeight) {
			return leftHeight;
		} else {
			return rightHeight;
		}
	}
	
	public static void printHeightOfEachNode(Node root, int leftHeight, int rightHeight) {
		System.out.println("---------------------");
		System.out.println("Node: " +root.data);
		System.out.println("leftHeight: " +leftHeight);
		System.out.println("rightHeight:" +rightHeight);
		System.out.println("---------------------");
	}
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			//Node cur;
			if (data <= root.data) {
				root.left = insert(root.left, data);
				//root.left = cur;
			} else {
				root.right = insert(root.right, data);
				//root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

}
