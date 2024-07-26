package pack9;

import java.io.File;

public class FileMethods4 {

	public static void main(String[] args) {
		//EXPLAINING ABOUT MEthods
		
		
		File folder1 = new File("sample"); // isFile() method checks that is it a file or folder
		
		if (folder1.isFile()) {            // isDirectory() method checks that is it a  folder or file
			
			
			System.out.println("Sample is a file");
			
		} else {
			
			System.out.println("Sample is a folder");
			}
		
		
	File file1 = new File("sample/vijay.txt");   // we can also write (folder1,"vijay.txt")
	
	if (file1.isFile()) {
		
		System.out.println("file1 is a file");
		
		
	}else {
		
		System.out.println("file1 is a folderj");
		
	}
  
	file1.delete();
	folder1.delete();
	
	System.out.println("file and folder got deleted");
	}

}
