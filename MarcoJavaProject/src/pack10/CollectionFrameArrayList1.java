package pack10;

import java.util.ArrayList;

public class CollectionFrameArrayList1 {

	public static void main(String[] args) {
	                                                              /*COLLECTIONS                    -    ARRAYS    
                                                                   *1. stores group of objects     -   group of values
                                                                   *2.not fixed in size            -   fixed in size
                                                                                                                             *  
                                                                                                                         *  */	
		
                                                                    /*ARRAY                                 ARRAYLIST             *       
                                                                   * 1.stores group of values         -  1. stores the group of objects
                                                                   * 2.fixed in size                  -  2.   resizable  */	
	ArrayList <Integer>arList = new ArrayList<Integer>();         /* 3. we use length-array length     - 3. size();                                             */
		
		
		arList.add(5); // index 0  add is use to add the values to the variables
		arList.add(6);// index 1
		arList.add(7);// index 2
		arList.add(8);// index 3
		
		System.out.println(arList.get(0));   // by using the get method we can get the vlues according to their index
		System.out.println(arList.get(1));
		System.out.println(arList.get(2));
		System.out.println(arList.get(3));
		
		System.out.println("size of the array is : "+arList.size());  // size of the array * lenght-array, length()-string, size()-arraylist
		
	}

	}


