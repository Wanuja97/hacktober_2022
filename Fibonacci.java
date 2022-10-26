// Fibonacci Series using Recursion
import java.util.Scanner;

class Fibonacci  {
	static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find its fibonacci : "); 
        int num = sc.nextInt();
		System.out.println(fib(num));
	}
}
