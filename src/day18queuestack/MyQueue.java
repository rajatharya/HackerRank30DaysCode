package day18queuestack;

import java.util.LinkedList;

public class MyQueue {

	LinkedList queue;
	
	public MyQueue() {
		queue = new LinkedList();
	}
	
	// Finding out whether queue is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	// Finding the size of the queue
	public int size() {
		return queue.size();
	}
	
	// Adding elements to queue
	public void enqueue(int elementToAdd) {
		queue.addLast(elementToAdd);
	}
	
	// Removing elements from queue FIFO
	public int dequeue() {
		return (int) queue.remove(0);
	}
	
	// Retrieving the first element in queue
	public int peek() {
		return (int) queue.get(0);
	}
	
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(7);
		myQueue.enqueue(9);
		myQueue.enqueue(13);
		System.out.println(myQueue.peek());
		System.out.println("First element removed: "+ myQueue.dequeue());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.size());
		System.out.println("Second element removed: "+ myQueue.dequeue());
		System.out.println("Third element removed: "+ myQueue.dequeue());
		
	}

}
