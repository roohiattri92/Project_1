//which exception comes when we fetch the numeric value ?

package selenium_program;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet__program_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream t= new FileInputStream("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\excelfile\\Untitled spreadsheet (1).xlsx");
		Workbook l=WorkbookFactory.create(t);
		 String un=l.getSheet("login").getRow(7).getCell(0).getStringCellValue();
		 //   String pswd= l.getSheet("login").getRow(0).getCell(1).getStringCellValue();    
		    
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/signup");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    
		    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(un);
		  //  driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys(pswd);		

	}

}
