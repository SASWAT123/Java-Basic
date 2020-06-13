package Recursion;

public class Factorial {
	
	public int factorial(int n) {
		if(n < 0)
			throw new IllegalStateException("Invalid Number");
		else if(n == 0) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}

}
