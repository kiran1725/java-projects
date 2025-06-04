package kiran;
import java.util.*;

class arrayList{
	public  arrayList() {
		ArrayList<String>student3=new ArrayList<String>();
		student3.add("Alice");
		student3.add("Bob");
		student3.add("David");
		student3.add("Charlie");
		System.out.println("ArrayList:"+student3);
	}
}
class linkedList extends arrayList{
	public  linkedList() {
	     LinkedList<Integer>student4=new LinkedList<Integer>();
		student4.add(101);
		student4.add(102);
		student4.add(103);
		student4.add(104);
		System.out.println("LinkedList"+student4);
	}
}
class hashmap extends linkedList{
	public  hashmap() {
		HashMap<Integer,String> student5=new HashMap<Integer,String>();
		student5.put(1,"virat");
		student5.put(2,"dhoni");
		student5.put(3,"hardik");
		student5.put(4,"kl rahul");
		System.out.println("Hashmap"+student5);
		
	}
}
	class hashset extends hashmap{
		public  hashset(){
			HashSet<Integer>student6=new HashSet<Integer>();
			student6.add(1001);
			student6.add(1002);
			student6.add(1003);
			student6.add(1004);
			System.out.println("Hashset"+student6);
		}
	}

public class Inhertiance {

	public static void main(String[] args) {
		/*arrayList employ1=new arrayList();
		linkedList employ2=new linkedList();
		hashmap employ3=new hashmap();*/
		hashset employ4=new hashset();
		
	}

}
