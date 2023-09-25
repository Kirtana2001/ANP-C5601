//3. WAP to find even and odd numbers between 11 to 109 numbers.
public class EvenAndOdd {
	public static void main(String[] args) {
		int num = 11;
		StringBuilder sb= new StringBuilder("");
		StringBuilder sb2= new StringBuilder("");
		for (num = 11; num <= 109; num++) {
			if (num % 2 == 0) {
				sb=sb.append(num+" ");
			}
		}
		for (num = 11; num <= 109; num++){
			if(num%2==1){
				sb2=sb2.append(num+" ");
			}
		}
		System.out.println("Even number are : "+sb);
		System.out.println("Odd number are : "+sb2);
	}
}
