package pack11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrintWriter {

	public static void main(String[] args) throws IOException {
		
		
		File folder1 = new File("vijay");
		if (!folder1.exists()) {
			

			folder1.mkdir();
		}

		
	File file1 = new File(folder1,"vijii.txt");
		if(!file1.exists()) {
			
			
			file1.createNewFile();
		}
		// printWriter Demonstration
		
	PrintWriter pw = new PrintWriter(file1);
		
		pw.println("MY name is vijay");
		pw.println("Iam learning java progrmming");
		pw.flush();
		pw.close();
		// BufferedReader
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
	
		String line = br.readLine();
		
		while(line!=null) {    // logic for the BufferedReader
			
			System.out.println(line);
			line=br.readLine();
			
		}
		
		br.close();
	}

}
