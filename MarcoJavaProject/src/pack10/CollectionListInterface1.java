package pack10;

import java.util.ArrayList;
import java.util.List;

public class CollectionListInterface1 {

	public static void main(String[] args) {
	// List is a interface and it is a parent of the ArrayList.
// we have a one option to create an object for the interface is iheritance(child class)
	
           List<Integer> list = new ArrayList<Integer>(); // here we  have another option that is: ArrayList<Integer>arlist=new ArrayList<Integer>();  
                
                                        // Here we creat object for child class- ArrayList annd
		list.add(0);                   // we assign to the interface List variables.
		list.add(1);
		list.add(2);    // we can also assign the object to the COLLECTION because COLLECTION is GRandparent of the ArrayList and parent to the LIST.
		list.add(3);    // like Collection<Integer> c= new ArrayList<Integer>();
		
		
		for(Integer i:list) {
			
			System.out.println(i);
			
		}

		
	}

}
