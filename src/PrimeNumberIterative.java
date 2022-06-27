import java.util.Scanner;
public class PrimeNumberIterative {
public static void main(String[] args) {
		
		// girilen bir sayının asal olup olmaması kodlayan algoritma
		
		PrimeNumberIteration();
		
	}


public static void PrimeNumberIteration() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number you want to check if it is a prime number: ");
	int number = scan.nextInt();
	int count = 0;
	
	if (number < 2) {
		System.out.println(number + " is not prime");
		System.exit(0);
	}
	
	for (int i = 1; i <= number; i++) {
		if (number % i == 0) {
			count += 1;
		}
	}
	
	if (count > 2) {
		System.out.println(number + " is not prime");
	} else {
		System.out.println(number + " is prime");
	}
}
}
