package kiran;
import java.util.HashMap;
import java.util.Map;
public class MapHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String>student3=new HashMap<>();
		 student3.put(100,"Kiran");
		 student3.put(101,"Kohli");
		 student3.put(102,"Ameen");
		 student3.put(103,"Madhu");
		 student3.put(104,"Hardik");
		 //student3.put(0,"Madhu");
		   student3.remove(101);
		   for (Map.Entry<Integer, String> entry : student3.entrySet()) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
	}

}
