import java.util.Scanner;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number=scan.nextInt();
		System.out.println(primeNumberRecursive(number, 2));
	}

	public static boolean primeNumberRecursive(int number, int i) {
		
		if (number<=2)	
			return (number==2) ? true:false;
		if(number%i==0)
			return false;
		if (i * i >number) {
			return true;
		}
		return primeNumberRecursive(number,i+1);
	}
}
