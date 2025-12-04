import java.util.Scanner;
public class multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printMultiples(arr);
	}

	public static void printMultiples(int arr[]) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				c++;
			}
		}
		System.out.println(c);

	}
}
