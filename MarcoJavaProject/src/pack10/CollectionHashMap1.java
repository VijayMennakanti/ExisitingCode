package pack10;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap1 {

	public static void main(String[] args) {
	// HashMap Demonstration
		
		 HashMap<Integer,String> hm = new HashMap<Integer,String>();
		 
		 hm.put(101,"vijay");               // HashMap having the put(keys); to add the values.
		 hm.put(102,"Mennakanti");
		 hm.put(103,"India");
		
		 for(Integer i: hm.keySet()) {
			 
			 
			 System.out.println(hm.get(i));
			 
		 
		 }
		  		 
		 CollectionHashMap1.hashmapWithPmap();
	}

	
	
	public static void hashmapWithPmap() {
		
		
 Map <Integer,String>  m = new HashMap<Integer,String>(); // map is parent of the HashMap mehtod.
		 
		 m.put(101,"sagar");              
		 m.put(102,"Mennakanti");
		 m.put(103,"germany");
		
		for (Integer j:m.keySet()) {
			
			System.out.println(m.get(j));
			
		}
		
	}
	
	
	
	
}
