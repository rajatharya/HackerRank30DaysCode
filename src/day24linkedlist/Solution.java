package day24linkedlist;

import java.util.Scanner;

public class Solution {

	public static Node removeDuplicates(Node head) {
		Node currentNode = head;
		while (currentNode.next != null) {
			while (currentNode.next != null && currentNode.data == currentNode.next.data) {
				currentNode.next = currentNode.next.next;
			}
			if (currentNode.next != null) {
				currentNode = currentNode.next;
			}
		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}
