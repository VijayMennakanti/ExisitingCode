package pack11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTe2 {

	public static void main(String[] args) throws IOException {
	//CREATING FOLDER AND FILE WITHOUT PRINT STATMENT	
		File folder1 = new File("sample");
	
		if(!folder1.exists()) {
			
			folder1.mkdir();
			}
		
		File file1 = new File(folder1,"sagar.txt");
		
		if(!file1.exists()) {
			
			
			file1.createNewFile();
			// 1.File writer and File Reader
		}
		
		FileWriter fw = new FileWriter(file1);
		
		fw.write("my name is vijay.    \n");   //\n is new-line
		fw.write("iam living in canada. \n");
		fw.write("iam learning in java programming. \n");
		
		fw.flush();           // flush()--used to write.
		fw.close();          // close()-- used to memory leak.
	// File Reader logic
		
	FileReader fr = new FileReader(file1);
	
	int i = fr.read();
			
	
	while(i!=-1) {
		
		System.out.print((char)i);  // here we use print statement not println
		
		i= fr.read();
		
	}
	
	fr.close();                  // close outside the loop
		}
		
		
		
	}

	


