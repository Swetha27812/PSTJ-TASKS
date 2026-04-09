package Tasks;
import java.util.*;
public class FindCommonCharacters {


	
	    public static List<String> commonChars(String[] words) {
	        
	        int[] minFreq = new int[26];
	        Arrays.fill(minFreq, Integer.MAX_VALUE);
	        
	        for (String word : words) {
	            int[] freq = new int[26];
	            
	            for (char c : word.toCharArray()) {
	                freq[c - 'a']++;
	            }
	            
	            for (int i = 0; i < 26; i++) {
	                minFreq[i] = Math.min(minFreq[i], freq[i]);
	            }
	        }
	        
	        List<String> result = new ArrayList<>();
	        
	        for (int i = 0; i < 26; i++) {
	            while (minFreq[i] > 0) {
	                result.add("" + (char)(i + 'a'));
	                minFreq[i]--;
	            }
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        
	        String[] words = {"bella", "label", "roller"};
	        
	        List<String> result = commonChars(words);
	        
	        System.out.println("Common Characters: " + result);
	    }
	}
