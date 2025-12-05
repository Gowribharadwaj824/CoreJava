import java.util.Scanner;
public class PrimeNotPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}	
		System.out.println("The given number is prime: "+isPrime);
	}
}
