import java.util.Scanner;
public class Sumofnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array:");
     int sum=0;
     int arr[];
     arr=new int[4];
     for (int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
    	 sum=sum+arr[i];
     }
     System.out.println("sum= "+sum);
	}

}
