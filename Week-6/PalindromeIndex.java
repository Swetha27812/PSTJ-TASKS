package Tasks;

import java.util.*;

public class PalindromeIndex {


	

	    public static int palindromeIndex(String s) {
	        int left = 0;
	        int right = s.length() - 1;

	        while (left < right) {
	            if (s.charAt(left) == s.charAt(right)) {
	                left++;
	                right--;
	            } else {
	                if (isPalindrome(s, left + 1, right)) {
	                    return left;
	                } 
	                else if (isPalindrome(s, left, right - 1)) {
	                    return right;
	                } 
	                else {
	                    return -1;
	                }
	            }
	        }
	        return -1;
	    }

	    private static boolean isPalindrome(String s, int left, int right) {
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right))
	                return false;
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of test cases: ");
	        int q = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < q; i++) {
	            System.out.print("Enter string: ");
	            String s = sc.nextLine();
	            System.out.println("Result: " + palindromeIndex(s));
	        }

	        sc.close();
	    }
	}
