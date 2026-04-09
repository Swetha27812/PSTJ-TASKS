package Tasks;
import java.util.HashSet;

public class ContainsDuplicate {
	

	
	    
	    public boolean containsDuplicate(int[] nums) {
	       
	        HashSet<Integer> seen = new HashSet<>();
	        
	        for (int num : nums) {
	          
	            if (seen.contains(num)) {
	                return true;
	            }
	           
	            seen.add(num);
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        ContainsDuplicate sol = new ContainsDuplicate();
	       
	        
	        int[] nums1 = {1, 2, 3, 1};
	        System.out.println("Test 1 (Expected true): " + sol.containsDuplicate(nums1));
	        
	       
	        int[] nums2 = {1, 2, 3, 4};
	        System.out.println("Test 2 (Expected false): " + sol.containsDuplicate(nums2));
	    }
	}


