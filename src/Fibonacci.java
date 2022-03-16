
public class Fibonacci {
	public static int recurse(int n) 
	{
		if (n <= 1)
			return n;
		
		return recurse(n-1) + recurse(n-2);
	}
	
	public static int iterate(int n) 
	{
		if (n <= 1)
			return n;
		
		int fib1 = 1;
		int fib2 = 1;
		
		for (int i = 2; i < n; i++) {
			int temp = fib1;
			fib1 += fib2;
			fib2 = temp;
		}
		return fib1;
			
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Recursive");
		System.out.println(recurse(9));
		System.out.println(recurse(15));
		System.out.println(recurse(2));
		System.out.println(recurse(5));
		System.out.println();
		
		System.out.println("Iterative");
		System.out.println(iterate(9));
		System.out.println(iterate(15));
		System.out.println(iterate(2));
		System.out.println(iterate(5));
	}

}
