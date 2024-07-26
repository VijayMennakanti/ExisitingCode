package pack9;

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		// CREATING NEW FILE
		
		File file2 = new File("sample/vijay.txt");
		
		   //Logic for creating file                                         // createNewFile(); ex:-file2.createNewFile();
		
		if(!file2.exists()) {
			
			
			file2.createNewFile();
			
			System.out.println("File got created " +"jai"+"mennakanti");
		}else {
			
			
			System.out.println("File already in exist");
		}
		
		

	}

}
