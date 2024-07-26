package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptional3Throw {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file= new File("abcd.txt");  // once if we have a exception and we try to ignore the exception by using throws
		
		SampleMethodOne();
		FileInputStream	fis =new FileInputStream(file);
		
		System.out.println("End of the program");
	

	}

public static void SampleMethodOne(){
	
	
	File file= new File("abcd.txt");  
	
	
	
	try {
	FileInputStream	fis =new FileInputStream(file);
	
	}catch(Throwable e) {
		
		System.out.println("FILE NOT FOUND");   // incase if we want to handling with the exception
		
	}
	
	
}






}

