package javaproject;
//import java.util.LinkedList;
import java.util.*;

public class studentslist {

	public static void main(String[] args) {
		LinkedList<String>students=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of 5 students");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter name of students"+i+":\n");
			String name=sc.nextLine();
			students.add(name);	
		}
		System.out.println("the students are:\n");
		for(String student:students) {
			//System.out.println("the students are:\n");
			System.out.println(student);
		}
	}

}
