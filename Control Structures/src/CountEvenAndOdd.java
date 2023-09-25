//2. WAP to count total even and total odd numbers between 11 to 109 numbers.
public class CountEvenAndOdd {
	public static void main(String[] args) {
		int num = 11,count=0,count1=0;
		StringBuilder sb= new StringBuilder("");
		StringBuilder sb2= new StringBuilder("");
		for (num = 11; num <= 109; num++) {
			if (num % 2 == 0) {
				sb=sb.append(num+" ");
				count=count+1;
			}
		}
		for (num = 11; num <= 109; num++){
			if(num%2==1){
				sb2=sb2.append(num+" ");
				count1=count1+1;
			}
		}
		System.out.println("There are "+count+" even numbers");
		System.out.println("There are "+count1+" odd numbers");
	}
}
