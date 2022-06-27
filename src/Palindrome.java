import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(palindrome());
		
	}
	public static boolean palindrome() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kelimeyi giriniz: ");
		String word=scan.next();
		String checkWord="";
		
		for (int i = word.length()-1; i >= 0; i--) {
			checkWord+=word.charAt(i);
		}
		if (word.equals(checkWord)) {
			return true;
		}
		return false;
	}

}
