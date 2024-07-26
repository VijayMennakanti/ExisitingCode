package pack7;

public class String2 {

	public static void main(String[] args) {
		
    String oneName = "             vijaymennakanti"       ;
    String secondName="raju";
    String anotherName="vijay";
    String text="My name is vijay and i love the baseball game";
    String searchText=" volleyball";
    String searchTextOne= "baseball";
    
    
    
    
    System.out.println(oneName.equals(secondName)); // equals(); method is used to compare the two strings
    
    System.out.println(oneName.length());// finds the length of the string.
    
    System.out.println(oneName.substring(1));// Begining index starts from 0// ijaymennakanti
    
    System.out.println(oneName.substring(0, 5)); // ending index starts with 1// vijay
   
    System.out.println(oneName);
    System.out.println(oneName.trim()); // trim(); is used to remove the space before and after the text
    
    
    System.out.println(text.indexOf(searchText)); //31 if its gives number then we make sure that the given text is founded
    System.out.println(text.indexOf(searchTextOne)); // -1 not found any text which is given by us
    
    
    if (text.indexOf(searchTextOne)!=-1   ) {  
    	
    	System.out.println(searchText+":"+"is found");
    	
    }else {
    	
    	System.out.println(searchText+":"+"is not found");
    }
    
    
	}

}
