package kiran;

import java.util.Stack;

public class UndoFeatureUsingStack {

	public static void main(String[] args) {
		Stack<String>undo=new Stack<>();
		undo.push("Write");
		undo.push("Delete");
		undo.push("Insert");
		System.out.println(undo);
		System.out.println(undo.peek());
		System.out.println(undo.remove(0));
		System.out.println(undo);
	}
}
