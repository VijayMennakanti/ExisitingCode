package pack11;

import java.io.File;
import java.io.IOException;

public class FileTelugu1 {                    // Creating Folder and FILE at a time

	public static void main(String[] args) throws IOException {
	
		File folder1 = new File("vijay");

		if (!folder1.exists()) {
			
			
			folder1.mkdir();
		 	System.out.println("folder got created:" +"vijay");
			
		}   else {
			
		System.out.println("folder already in exist");
		}
		
		
		File file1= new File(folder1,"abcd.txt");
		
		if(!file1.exists()) {
			
			file1.createNewFile();
     System.out.println("file got created");
			
		}      else {
			
			
			  System.out.println("file alredy in exist");
                        }
		
		
		
		
	}

}
