package Tasks;
import java.util.*;

public class FirstUniqueCharacterString {

	
	

	    /**
	     * Returns the index of the first non-repeating character in a string.
	     * If no unique character exists, returns -1.
	     */
	    public static int firstUniqChar(String s) {
	        Map<Character, Integer> count = new LinkedHashMap<>(); // maintains insertion order

	        // Count frequency of each character
	        for (char c : s.toCharArray()) {
	            count.put(c, count.getOrDefault(c, 0) + 1);
	        }

	        // Find the first character with frequency 1
	        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
	            if (entry.getValue() == 1) {
	                return s.indexOf(entry.getKey());
	            }
	        }

	        return -1; // no unique character found
	    }

	    public static void main(String[] args) {
	        String s1 = "leetcode";
	        String s2 = "loveleetcode";
	        String s3 = "aabbcc";

	        System.out.println(firstUniqChar(s1)); // Output: 0 ('l')
	        System.out.println(firstUniqChar(s2)); // Output: 2 ('v')
	        System.out.println(firstUniqChar(s3)); // Output: -1 (no unique character)
	    }
	}
