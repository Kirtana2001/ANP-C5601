//4. WAP to insert three integer numbers at run time and print largest number.
import java.util.Scanner;
public class LargestNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b&&a>c)
			System.out.println("Largest number = "+a);
		if(b>a&&b>c)
			System.out.println("Largest number = "+b);
		if(c>a&&c>b)
			System.out.println("Largest number = "+c);

	}
}
