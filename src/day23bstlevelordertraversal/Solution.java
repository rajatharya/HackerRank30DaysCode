package day23bstlevelordertraversal;

import java.util.*;

public class Solution {

	static LinkedList<Node> queue = new LinkedList<Node>();
	
	public static void enqueue(Node root) {
		queue.addLast(root);
	}
	
	public static Node dequeue() {
		return queue.removeFirst();
	}
	
	public static boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public static void levelOrder(Node root) {
		if (root != null) {
			enqueue(root);
		}
		while (!isEmpty()) {
			Node current = dequeue();
			System.out.print(current.data + " ");
			if (current.left != null) {
				enqueue(current.left);
			}
			if (current.right != null) {
				enqueue(current.right);
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
