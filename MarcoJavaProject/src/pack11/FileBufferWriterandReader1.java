package pack11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferWriterandReader1 {

	public static void main(String[] args) throws IOException {
		File folder1 = new File("sample");
		
		if(!folder1.exists()) {
			
			folder1.mkdir();
			}
		
		File file1 = new File(folder1,"sagar.txt");
		
		if(!file1.exists()) {
			
			
			file1.createNewFile();
		
			// BufferedWriter() and BufferedReader()  
			
			
			FileWriter fw = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(fw); // when you wrote BufferedWriter or Reader and its surely ask the FileWriter or Reader
			
			
			
			
	
			
			bw.write("my name is sagar");
			bw.newLine();                        // newLine()- new line
			
			bw.write("iam living in india");
			bw.newLine();
			
			bw.write("since 5years iam working as priest");
			
			bw.flush();
			
			// BufferedReader()
			
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();             // returntype is string
			
			while(line!=null) {                      // after complete reading of the file it gives the null 
				
				System.out.println(line);
				
				line=br.readLine();
			}
			
			
			br.close();
		}
		}
	
	
	
	
	
}
	


