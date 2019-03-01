package queuey;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Queuey {
	
	LinkedList<Integer> queue = new LinkedList<Integer>();
	
	//Making instance of queue
	public Queuey() {
		queue = new LinkedList<Integer>();
	}
	
	//Check if queue is empty;
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	//What is the size of the queue
	public int size() {
		return queue.size();
	}
	
	//Enqueuing an item
	public void enqueue(int n) {
		queue.addLast(n);
	}
	
	//Dequeuing an item
	public int dequeue() {
		return (int)queue.remove(0);
	}
	
	//Peek at the first element
	public int peek() {
		return (int)queue.get(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want in the queue?");
		int n = input.nextInt();
		Queuey numberQueue = new Queuey();
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++) {
			int num = input.nextInt();
			numberQueue.enqueue(num);
		}
		//numberQueue.enqueue(5);
		//numberQueue.enqueue(6);
		//numberQueue.enqueue(7);
		System.out.println("First out: "+ numberQueue.dequeue());
		System.out.println("Peek at Second item: " + numberQueue.peek());
		System.out.println("Second out: " + numberQueue.dequeue());
		System.out.println("Third out: " + numberQueue.dequeue());
		System.out.println();
		
		//Stack implementation 
		Stack<String> stacky = new Stack<String>();
		String[] arr = {"Hi", "there"};
		
		for(String s : arr) {
			stacky.push(s);
		}
		
		System.out.println(stacky.pop() + " ");
		System.out.println("Peek: " + stacky.peek());
		System.out.println(stacky.pop() + "! ");
		System.out.println("Size: " + stacky.size());
		

		
		input.close();
	}

}
