package kiran;

import java.util.ArrayList;

public class arraylistEX {

	public static void main(String[] args) {
		ArrayList<String>student=new ArrayList<String>();
		student.add("chotabeem");
		student.add("jackiechan");
		student.add("doraman");
		student.add("little krishna");
		student.add("power rangers");
		System.out.println(student);
		System.out.println(student.remove(1));
		System.out.println(student.set(1, "motupatlu"));
	}

}
