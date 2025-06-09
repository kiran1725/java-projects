
package kiran;

import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

class graphsEx {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        graph.put("Reptile House", Arrays.asList("Snake Pit"));
        graph.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        graph.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        graph.put("Snake Pit", new ArrayList<>());
        graph.put("Parrot Pavilion", new ArrayList<>());
        graph.put("Lion Den", new ArrayList<>());
        graph.put("Elephant Enclosure", new ArrayList<>());

        System.out.println("Explore the international park by using BFS method");
        bfs(graph, "Entrance");
    }

    public static void bfs(Map<String, List<String>> house, String startroom) {
        Queue<String> q = new LinkedList<>();
        Set<String> v = new HashSet<>();

        q.add(startroom);
        v.add(startroom);

        while (!q.isEmpty()) {
            String Cstate = q.poll();
            System.out.println("Visited: " + Cstate);
            List<String> neighbors = house.get(Cstate);
            if (neighbors != null) {
                for (String n : neighbors) {
                    if (!v.contains(n)) {
                        q.add(n);
                        v.add(n);
                    }
                }
            }
        }
    }
}

