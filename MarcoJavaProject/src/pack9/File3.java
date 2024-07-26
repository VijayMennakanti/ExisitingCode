package pack9;

import java.io.File;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		
		
		File folder1 = new File("sample");
		
		if (!folder1.exists()) {
			
			
			folder1.mkdir();
			
			System.out.println("Folder got created");
			
		} else {
			
			System.out.println("Folder already existed");
			}
		
		
	File file1 = new File("sample/vijay.txt");   // we can also write (folder1,"vijay.txt")
	
	if (!file1.exists()) {
		
		file1.createNewFile();
		
		System.out.println("file got created");
	}else {
		
		
		System.out.println("file already in exist");
	}
	
	
	}

}
