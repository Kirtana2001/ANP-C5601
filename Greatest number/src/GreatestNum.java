import java.util.Scanner;
public class GreatestNum {
	public static void main(String[] args) {
		int i;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int num[] = new int[7];
		System.out.println("Enter 7 integer values : ");
		for (i = 0; i < 7; i++) {
			num[i] = sc.nextInt();
		}
		for (i = 0; i < 7; i++) {
			if (num[i] > max)
				max = num[i];
		}
		System.out.println("Greatest number is = " + max);
	}
}