package recursion;

public class first_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,2,5};
		System.out.println(firstOccurance(arr,5,0));
		System.out.println(lastOccurance(arr,5,0));

	}

public  static int lastOccurance(int[] arr, int key, int i) {
		// TODO Auto-generated method stub
	if(i==arr.length) {
		return -1;
	}
	int isfound=lastOccurance(arr,5,i+1);
	if(isfound==-1&& arr[i]==key) {
		return i;
	}
	return isfound;
			}

	public static int firstOccurance(int[] arr, int key, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}
		
		
		if(arr[i]==key) {
			return i;
			
		}
		return firstOccurance(arr,5,i+1);
	
	}

}
