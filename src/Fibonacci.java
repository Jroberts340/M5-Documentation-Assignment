
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

	public void Recurtest() {
		
		System.out.println("RECURSION");

		long start1 = System.nanoTime();
		System.out.print("Input Number: " + 2 +"\tFibonacci Number: " + Fibonacci.recurse(2));
		long end1 = System.nanoTime();
		long run1 = end1 - start1;
		System.out.print("\tRuntime in Nanoseconds: " + run1);
		System.out.println();
		
		long start2 = System.nanoTime();
		System.out.print("Input Number: " + 5 +"\tFibonacci Number: " + Fibonacci.recurse(5));
		long end2 = System.nanoTime();
		long run2 = end2 - start2;
		System.out.print("\tRuntime in Nanoseconds: " + run2);
		System.out.println();
		
		long start3 = System.nanoTime();
		System.out.print("Input Number: " + 9 +"\tFibonacci Number: " + Fibonacci.recurse(9));
		long end3 = System.nanoTime();
		long run3 = end3 - start3;
		System.out.print("\tRuntime in Nanoseconds: " + run3);
		System.out.println();
		
		long start4 = System.nanoTime();
		System.out.print("Input Number: " + 15 +"\tFibonacci Number: " + Fibonacci.recurse(15));
		long end4 = System.nanoTime();
		long run4 = end4 - start4;
		System.out.print("\tRuntime in Nanoseconds: " + run4);
		System.out.println();
		System.out.println();

		
	}
	
	public void Itertest() {
		
		System.out.println("ITERATION");

		long start1 = System.nanoTime();
		System.out.print("Input Number: " + 2 +"\tFibonacci Number: " + Fibonacci.iterate(2));
		long end1 = System.nanoTime();
		long run1 = end1 - start1;
		System.out.print("\tRuntime in Nanoseconds: " + run1);
		System.out.println();
		
		long start2 = System.nanoTime();
		System.out.print("Input Number: " + 5 +"\tFibonacci Number: " + Fibonacci.iterate(5));
		long end2 = System.nanoTime();
		long run2 = end2 - start2;
		System.out.print("\tRuntime in Nanoseconds: " + run2);
		System.out.println();
		
		long start3 = System.nanoTime();
		System.out.print("Input Number: " + 9 +"\tFibonacci Number: " + Fibonacci.iterate(9));
		long end3 = System.nanoTime();
		long run3 = end3 - start3;
		System.out.print("\tRuntime in Nanoseconds: " + run3);
		System.out.println();
		
		long start4 = System.nanoTime();
		System.out.print("Input Number: " + 15 +"\tFibonacci Number: " + Fibonacci.iterate(15));
		long end4 = System.nanoTime();
		long run4 = end4 - start4;
		System.out.print("\tRuntime in Nanoseconds: " + run4);
		System.out.println();
		

	}
	
	public static void main(String[] args) 
	{
		Fibonacci obj = new Fibonacci();
		
		obj.Recurtest();
		
		obj.Itertest();
	}
}
