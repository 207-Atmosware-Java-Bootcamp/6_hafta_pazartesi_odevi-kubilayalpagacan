import java.util.Iterator;
import java.util.Scanner;

public class FibonacciRecursive {

	public static int fibonacciRecursive(int number) {
		
		if (number==0) {
			return 0;
		}
		if (number==1 || number==2) {
			return 1;
		}
		return fibonacciRecursive(number-1) + fibonacciRecursive(number-2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter iteration number: ");
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.print(fibonacciRecursive(i) + " ");
		}
	}

}
