package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataD {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		
		// setp read data  
		
		FileInputStream file= new  FileInputStream("C:\\Users\\rajit\\OneDrive\\Desktop\\seleniumjava Sdetqa\\SeleniumAssignment\\src\\main\\resources\\Datadriven.xlsx");
		
		
		// step 2  use 
		
		Workbook Book = WorkbookFactory.create(file);
		
		// fetch values
		
		String Username= Book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password= Book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Username);
		System.out.println(password);
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='submit']")).click();

		
		
		
		
		
		
		
	}

}
