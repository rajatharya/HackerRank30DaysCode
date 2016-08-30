package day18queuestack;

import java.util.Queue;

public class MyStack {

	int[] stackArray;
	int topOfStack = 0;
	
	public MyStack(int size) {
		stackArray = new int[size];
	}
	
	public void push(int elementToPush) {
		stackArray[topOfStack] = elementToPush;
		topOfStack++;
	}
	
	public int pop() {
		int popElement = stackArray[topOfStack - 1];
		stackArray[topOfStack - 1] = 0;
		topOfStack --;
		return popElement;
	}
	
	public int peek() {
		return stackArray[topOfStack - 1];
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(7);
		myStack.push(9);
		myStack.push(13);
		System.out.println("The element at the top of the stack: "+myStack.peek());
		System.out.println("The element popped was: "+ myStack.pop());
		System.out.println("The element at the top of the stack: "+myStack.peek());
		System.out.println("The element popped was: "+ myStack.pop());
		
	}

}
