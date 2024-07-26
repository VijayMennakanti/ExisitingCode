package pack11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreams {

	public static void main(String[] args) throws IOException {
		
		
		File folder2 = new File("Annie");
		
		
		if (!folder2.exists()) {
		     folder2.mkdir();
		}
		     
		File file1 = new File(folder2,"pinky.txt");
		
		if (!file1.exists()) {
			
			file1.createNewFile();
			}
		// FileInput stream and Output Stream 
		// FileOutputStream is write into file
		
		String text= "1.my name is vijay. \n2.iam living in india.\n3.we are planning to learn german. ";
		FileOutputStream fos = new FileOutputStream(file1);
		
		fos.write(text.getBytes());
		fos.flush();
		fos.close();
		
		// FileInputStream is used to read the file
		
		FileInputStream fis = new FileInputStream(file1);
		
		int i = fis.read();
		
		while(i!=-1) {
			
			System.out.print((char)i);
			i=fis.read();
		}
		
		fis.close();
	}

}
