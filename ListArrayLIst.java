package kiran;
import java.util.ArrayList;
import java.util.Collections;
public class ListArrayLIst {

	public static void main(String[] args) {
		 ArrayList<String> student =new ArrayList<>();
		 student.add("Kiran");
		 student.add("Kohli");
		 student.add("Ameen");
		 student.add("Madhu");
		 student.add("Hardik");
		 System.out.println(student.set(0, "MSdhoni"));
		 Collections.shuffle(student);
		 student.remove("Kohli");
		 Collections.shuffle(student);
		 Collections.reverse(student);
		 for(String Studentname:student) {
		 System.out.println(Studentname);}
	}

}
