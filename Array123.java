import java.util.Scanner;

public class Array123 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of elements: ");
      int n = sc.nextInt();

       int[] arr = new int[n];
       System.out.println("Enter " + n + " elements:");
	   for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		        }

		        boolean value = false;
		        for (int i = 0; i <= n - 3; i++) {
		            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
		                value = true;
		                break;
		            }
		        }

		        System.out.println("Result: " + value);
		    }
		}

