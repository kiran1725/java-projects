package kiran;
import java.util.LinkedList;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		Queue<String>students=new LinkedList<String>();
		students.add("student 1");
		students.add("student 2");
		students.add("student 3");
		students.add("student 1");
		System.out.println(students);
		System.out.println(students.poll());
		System.out.println(students.remove());

	}

}
