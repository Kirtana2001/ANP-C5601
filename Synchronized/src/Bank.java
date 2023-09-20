import java.util.Scanner;

public class Bank {
	private volatile double balance = 60000;

	public synchronized void deposit() {
		System.out.println("Bank balance before deposit = " + balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deposit amount : ");
		int amt1 = sc.nextInt();
		balance = amt1 + balance;
		System.out.println("Bank balance after deposit = " + balance);
	}
	public synchronized void withdraw() {
		System.out.println("Bank balance before withdraw = " + balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter withdraw amount : ");
		int amt2 = sc.nextInt();
		balance =  balance - amt2;
		System.out.println("Bank balance after withdraw = " + balance);
	}
}
