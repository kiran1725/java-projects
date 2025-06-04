package kiran;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String>burgerstack=new Stack<String>();
		burgerstack.push("burger 1");
		burgerstack.push("burger 2");
		burgerstack.push("burger 3");
		System.out.println(burgerstack);
		System.out.println("Top Burger is :"+ burgerstack.peek());
		System.out.println("serving :"+ burgerstack.pop());
		if(burgerstack.isEmpty()) {
			System.out.println("All burgers are served");
		}
	}

}
