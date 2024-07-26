package pack9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
	
		
		File file1 = new File("sagar.txt");
		
		file1.createNewFile();
		
		FileReader fr = new FileReader(file1);
		
	BufferedReader br = new BufferedReader(fr);
		   
	br.readLine();

	String str;
	
	
	while((str=br.readLine()) != null) {
		
		
		System.out.println(str);
		

		
	}
	
		   
	   }
		
	}


