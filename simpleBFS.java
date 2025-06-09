package kiran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class simpleBFS {

	public static void main(String[] args) {
		Map<String,List<String>> house=new HashMap<>();
		house.put("LivingRoom",Arrays.asList("Kitchen","Bedroom","StudyRoom"));
		house.put("Kitchen",Arrays.asList("Bedroom"));
		house.put("Bedroom",Arrays.asList("Balcony"));
		house.put("studyroom",new ArrayList<String>());
		house.put("Bathroom",new ArrayList<String>());
		house.put("Balcony",new ArrayList<String>());
		System.out.println("Explore the house using the BFS method: ");
		bfs(house,"LivingRoom");
		

	}
	public static void bfs(Map<String,List<String>>house,String startRoom) {
		Queue<String>queue=new LinkedList<>();
		Set<String>visited=new HashSet<>();
		queue.add(startRoom);
		visited.add(startRoom);
		while(!queue.isEmpty()) {
			String Croom=queue.poll();
			System.out.println("visited"+Croom);
			
		}
		
		
	}

}
