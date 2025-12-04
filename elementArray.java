public class elementArray {
	public static int Print(int arr[]){
		// TODO Auto-generated method stub
      int num=0;
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]==arr[i+1]) {
    		  num++;
    	  }
      }
      return num;
	}
 public static void main(String[]args) {
	 int arr[]= {1,1,2,2,3,4,4,5,5,};
	 System.out.println("Counting number"+Print(arr));
 }
}
