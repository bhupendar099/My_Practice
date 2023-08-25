package recursion;

public class pdf {
	public static void main(String []args) {
		int arr[]= {3,4,2,5,2,2,4,7};
		int key=2;
		occurance(arr,key,0);
		
	                                         
	}

	public static void occurance(int[] arr, int key, int i) {
		// TODO Auto-generated method stub
	   if(i==arr.length) {
		   return ;
	   }
	   if(arr[i]==key) {
		   System.out.println(i);
	   }
	    occurance(arr,key,i+1);
	    
	}

}
