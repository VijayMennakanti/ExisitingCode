package pack10;

import java.util.ArrayList;

public class CollectionArraylistFor2 {

	public static void main(String[] args) {
	//To reduce the size of the print statement in arraylist we use the FOR-LOOP or FOR-Each loop

		ArrayList<Integer> alist = new ArrayList<Integer>();  // we can give multiple values to the variables with help of
		                                                     //  ArrayList<object>alist= new ArrayList<object>
		alist.add(0);
		alist.add(1);
		alist.add(2);
		alist.add(3);
		
		System.out.println(alist.size()); //4
		
		for(int i=0; i<alist.size();i++) { // 0,1,2,3 // we can also use for-each ---for(Integer i:alist){}; syso(i);
			
			
			System.out.println(alist.get(i)); // get()- to get the values
			
		}
		
	}

}
