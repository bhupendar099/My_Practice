package Arraylist;

import java.util.ArrayList;

public class list_add_in_manilist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
		ArrayList<Integer> List1= new ArrayList<>();
		ArrayList<Integer> List2= new ArrayList<>();
		ArrayList<Integer> List3= new ArrayList<>();
      
		for(int i=1; i<=5; i++) {
			List1.add(i*1);
			List2.add(i*2);
			List3.add(i*3);
		}
		mainList.add(List1);
		mainList.add(List2);
		mainList.add(List3);
		
		System.out.println(List1);
		System.out.println(List2);
		System.out.println(List3);
		System.out.println(mainList);
	}

}
