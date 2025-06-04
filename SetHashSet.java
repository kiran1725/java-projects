package kiran;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class SetHashSet {

	public static void main(String[] args) {
		HashSet<String> student1=new HashSet<>();
		 student1.add("Kiran");
		 student1.add("Kohli");
		 student1.add("Ameen");
		 student1.add("Madhu");
		 student1.add("Hardik");
		 student1.add("Kiran");
		 Iterator<String>it = student1.iterator();
		 while(it.hasNext()) {
			 String phone=it.next();
			 System.out.println(phone);
		 }
		 //ArrayList<String>student2=new ArrayList<>(student1);
		 //System.out.println(student2);
	}
		 //System.out.println(student1);
	}

