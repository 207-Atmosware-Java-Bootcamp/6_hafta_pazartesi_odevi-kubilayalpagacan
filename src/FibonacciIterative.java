import java.util.Iterator;
import java.util.Scanner;

public class FibonacciIterative {

	public static void main(String[] args) {
		fibonacciIterative();
	}

	public static void fibonacciIterative() {

		int number1 = 0, number2 = 0,number3=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter iteration number: ");
		int iteration = scan.nextInt();
		
		System.out.println("Fibonacci Series with "+iteration+" iterations: ");
		for (int i = 1; i <= iteration; i++) {
			number1=number2;
			number2=number3;
			number3=number1+number2;
			System.out.print(number1+" ");
		}

	}
}
