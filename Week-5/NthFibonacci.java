package Tasks;

public class NthFibonacci {

	public static void main(String[] args) {
		
		        int n = 6;   
		        int a = 0, b = 1, c;

		        if (n == 1)
		            System.out.println(0);
		        else if (n == 2)
		            System.out.println(1);
		        else {
		            for (int i = 3; i <= n; i++) {
		                c = a + b;
		                a = b;
		                b = c;
		            }
		            System.out.println(b);
		        }
		    }
		}