package pack10;

import java.util.HashSet;

public class CollectionHashSet1 {

	public static void main(String[] args) {

		
		HashSet<String> h =new HashSet<String>();
		
		h.add("my");              
		h.add("is vijay");
		h.add("iam from");
		h.add("india");
		
		for(String s:h) {   // HashSet doesn't have get(index )method// we cant use the for-loop but we can uses For-each loop
			
			System.out.println(s);             // we can use SET becaue it is a parent of the HashSet
			                                   
			
			
		}
		
	}

}
