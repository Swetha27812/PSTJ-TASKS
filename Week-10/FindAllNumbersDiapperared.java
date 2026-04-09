package Tasks;

import java.util.*;

public class FindAllNumbersDiapperared {


	

	    public static List<Integer> findDisappearedNumbers(int[] nums) {
	        // Step 1: Mark visited indices
	        for (int i = 0; i < nums.length; i++) {
	            int index = Math.abs(nums[i]) - 1;
	            if (nums[index] > 0) {
	                nums[index] = -nums[index];
	            }
	        }

	        // Step 2: Collect missing numbers
	        List<Integer> result = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] > 0) {
	                result.add(i + 1);
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

	        List<Integer> missingNumbers = findDisappearedNumbers(nums);

	        System.out.println("Missing numbers: " + missingNumbers);
	    }
	}
