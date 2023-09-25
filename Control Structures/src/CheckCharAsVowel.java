//1. WAP to enter any character value & check the value is vowel or consonant.
import java.util.Scanner;

public class CheckCharAsVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int i = 0;
		char b = a.charAt(i);
		if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'||
				b == 'A' || b == 'E' || b == 'I' || b == 'U' || b == 'O')
			System.out.println(a + " is a vowel");
		else
			System.out.println(a + " is not a vowel");
	}
}
