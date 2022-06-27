import java.util.Iterator;
import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		checkingNumber();

	}
	
	public static void checkingNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayiyi giriniz: ");
		int number=scan.nextInt();
		int perfectNumber=0;
		for (int i = 1; i <= number/2; i++) {
			if (number%i==0) {
				perfectNumber+=i;
			}
		}
		if (number==perfectNumber) {
			System.out.println(number+ " mukemmel sayidir.");
			
		}
		else {
			System.out.println(number + " mukemmel sayi degildir.");
		}
	}

}
