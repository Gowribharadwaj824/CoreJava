import java.util.Scanner;
public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n >= 1 && (arr[0] == 1 && arr[n - 1] == 6)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
