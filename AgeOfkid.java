import java.util.Scanner;

public class AgeOfkid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person:");
		int age = sc.nextInt();
		if (age >= 0 && age <= 12) {
			System.out.println("KID");
		} else if (age >= 13 && age <= 19) {
			System.out.println("TEENAGER");
		} else if (age >= 20 && age <= 40) {
			System.out.println("YOUNGSTAR");
		} else if (age >= 40 && age <= 55) {
			System.out.println("AGED MAN");
		} else if (age >= 55 && age <= 70) {
			System.out.println("OLD MAN");
		}
	}
}
