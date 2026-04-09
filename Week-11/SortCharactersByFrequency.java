package Tasks;
import java.util.*;
public class SortCharactersByFrequency {

	


	    public static String frequencySort(String s) {
	        Map<Character, Integer> freq = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }

	        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
	            (a, b) -> freq.get(b) - freq.get(a)
	        );
	        maxHeap.addAll(freq.keySet());

	        StringBuilder sb = new StringBuilder();
	        while (!maxHeap.isEmpty()) {
	            char c = maxHeap.poll();
	            int count = freq.get(c);
	            for (int i = 0; i < count; i++) {
	                sb.append(c);
	            }
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        String s1 = "tree";
	        String s2 = "cccaaa";
	        String s3 = "Aabb";

	        System.out.println(frequencySort(s1)); // Example output: "eert"
	        System.out.println(frequencySort(s2)); // Example output: "aaaccc"
	        System.out.println(frequencySort(s3)); // Example output: "bbAa"
	    }
	}
