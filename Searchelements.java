import java.util.Scanner;

public class Searchelements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int arr[] = { 1, 2, 3, 4, 5 };
		arr = new int[10];
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			found = true;
			break;
		}
		if (found) {
			System.out.println( "Yes,it is there in an array");
		} 
		else {
			System.out.println( "No,it is NOT there in an array");
		}

	}
}
