package Tasks;

public class CheckVowel {
	
	    public static void main(String[] args) {
	        CheckVowel checker = new CheckVowel();
	        
	        
	        String s1 = "book";
	        String s2 = "textbook";
	        
	        System.out.println("Result for '" + s1 + "': " + checker.halvesAreAlike(s1));
	        System.out.println("Result for '" + s2 + "': " + checker.halvesAreAlike(s2));
	    }

	    public boolean halvesAreAlike(String s) {
	      
	        String vowels = "aeiouAEIOU";
	        int mid = s.length() / 2;
	        int count = 0;

	        for (int i = 0; i < mid; i++) {
	          
	            if (vowels.indexOf(s.charAt(i)) != -1) {
	                count++;
	            }
	           
	            if (vowels.indexOf(s.charAt(i + mid)) != -1) {
	                count--;
	            }
	        }

	        return count == 0;
	    }
	}


