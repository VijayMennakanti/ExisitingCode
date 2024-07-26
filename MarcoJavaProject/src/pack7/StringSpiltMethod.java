package pack7;

public class StringSpiltMethod {

	public static void main(String[] args) {
	
		String nameOne="vijay";
		String secondName="mennakanti";
		String text="my name is vijay mennkanti i love learning java programming";
		
          String[] ar = text.split(" "); // return type is string array
          
          System.out.println(ar[6]); // which gives specific part of the text
		
          for ( String item: ar) { // Foreach loop gives the all the spliting text.
        	  
        	  System.out.println(item);
        	  
        	  
        	  
          }
	}
         
}
