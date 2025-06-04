package kiran;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {

	public static void main(String[] args) {
		//combination of Stack and Queue
		Stack<String>lifo=new Stack<String>();
		lifo.push("Ball");
		lifo.push("Blocks");
		lifo.push("Puzzle");
		System.out.println(lifo);
		System.out.println(lifo.pop());
		System.out.println(lifo);
		
		Queue<String>fifo=new LinkedList<String>();
		fifo.add("Maya");
		fifo.add("Leo");
		fifo.add("Nina");
		System.out.println(fifo);
		System.out.println("Serving the first kid: "+fifo.poll());
		System.out.println(fifo);
	}

}
