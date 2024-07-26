package pack10;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIteratorMethod1 {

	public static void main(String[] args) {

		 ArrayList<Integer> alist = new ArrayList<Integer>();
		 
		 alist.add(4);
		 alist.add(5);
		 alist.add(6);
		 alist.add(7);
		 
		Iterator<Integer> itr = alist.iterator();    // by using the try and catch method we can handled the exception here.
		 try {
		 for(itr.hasNext();;) {
			 
			 System.out.println(itr.next());           // for-loop, for-each , iterator nothing but iterator
			
		 }
		 }catch(Throwable e) {
			 
			 System.out.println(" exception got handled");
			 
		 }
			 
		 sampleMethod() ;
		 

	}
   
	public static void sampleMethod() {
		
		
		
 ArrayList<Integer> blist = new ArrayList<Integer>();
		 
		 blist.add(8);
		 blist.add(9);
		 blist.add(10);
		 blist.add(11);
		 
		  Iterator<Integer> bitr = blist.iterator();   // iterator using while-loop
		 
		  while(bitr.hasNext()) {               // hasNext and next are the predefined methods for itarator();
			  
			  System.out.println(bitr.next());
			  
			  
		  }
		
		  
	}
	
	
	
}
