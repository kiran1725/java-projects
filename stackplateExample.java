package kiran;

import java.util.Stack;

public class stackplateExample {

	public static void main(String[] args) {
		Stack<String>plate=new Stack<String>();
		//stack is a simple data structure that stores items in LIFO order
		plate.push("plate1");
		plate.push("plate2");
		plate.push("plate3");
		plate.push("plate4");
		plate.push("plate5");
		System.out.println(plate);
		System.out.println("The top  plate in the stack : " + plate.peek());
		System.out.println(plate.getFirst());
	}

}
