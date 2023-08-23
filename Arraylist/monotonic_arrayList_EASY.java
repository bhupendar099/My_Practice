package Arraylist;
import java.util.*;

public class monotonic_arrayList_EASY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>A=new ArrayList<Integer>();
		A.add(4);
		A.add(5);
		A.add(5);
		A.add(5);
		System.out.println(A);
		System.out.println(monotonic(A));

	}
	public static boolean monotonic(ArrayList<Integer>A) {
//		for(int i=0; i<List.size(); i++) {
//			for(int j=i+1; j<List.size(); j++) {
//				if(List.get(i)>=List.get(j)) {
//					return true;
//				} else if(List.get(i)<=List.get(j)) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		}
//		return false;
	 	boolean inc= true;
		boolean dec= true;
		for(int i=0;i<A.size()-1; i++) {
			if(A.get(i) >A.get(i+1)) {
				inc=false;
			}
			if(A.get(i) <A.get(i+1)) {
				dec=false;
			}
		}
		return inc || dec;
		
	}

}
