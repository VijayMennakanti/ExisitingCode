package pack10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticaTable2 {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://practice.expandtesting.com/tables");
		 
		 
	//1.How many  ROws in Table in tag tbody tag.	 
		 
		int numberOfRows = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		
		System.out.println("Number of Rows in the tbody tag :"+numberOfRows);
		
	// 2.Number of coulmns in the tabel.
		
		
		int numberOfCoulmns = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();

		System.out.println("Number of columns in the table :"+numberOfCoulmns);
		
  // 3.Retrieving the Data of the Specific Row or Column:
		
		String retrieveaTheDataOfSpecificRowAndColumn = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[3]/td[2]")).getText();

		System.out.println("Retrieving the Data of the Specific Row or Column :"+retrieveaTheDataOfSpecificRowAndColumn);

// 4.Print All the Data from the Table:
		
	/*	System.out.println("Print All the Data from the Table:");
		
		for (int r=1;r<=numberOfRows;r++) {
			
			for(int c=1;c<=numberOfCoulmns;c++) {
				
				String allTheData = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td["+c+"]")).getText();
				
				System.out.print(allTheData+"  ");
				
			}
			
			System.out.println();
		} */
		
		
// 5. Print the Specific LastName, FirstName and E-mailId.
		
		for(int r=1;r<=numberOfRows;r++) {
			
			String lastNameBach = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td[1]")).getText();
			
			if(lastNameBach.equals("Bach")) {
				
				String firstName = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td[2]")).getText();
				String emailId = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td[3]")).getText();
				
	           System.out.println(lastNameBach+"   "+firstName+"   "+emailId+"   ");
	
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
