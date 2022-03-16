
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
		
		int[] arr = new int[] {2, 5, 9, 15};
		long start = System.nanoTime();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Fibonacci.recurse(arr[i]);
			System.out.print(arr[i] + ", ");
		}
		long end = System.nanoTime();
		System.out.print("Runtime in NanoSecond: " + (end - start));
		System.out.println();
	}
	
	public void Itertest() {
		
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
		
//		int[] arr = new int[] {2, 5, 9, 15};
//		long start = System.nanoTime();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Fibonacci.iterate(arr[i]);
//			System.out.print(arr[i] + ", ");
//		}
//		long end = System.nanoTime();
//		System.out.print("Runtime in NanoSecond: " + (end - start));
//		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Fibonacci obj = new Fibonacci();
		
		obj.Recurtest();
		
		obj.Itertest();
	}
}
