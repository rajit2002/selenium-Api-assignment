package FileUploadFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		// upload file
		
		driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("C:\\Users\\rajit\\Downloads\\rajitpan.jpg");
		
		System.out.println("The file is uploaded successfully");
		
		if(driver.findElement(By.xpath("//input[@id='file-upload']")).getText().equals("rajitpan.jpg")){
			System.out.println("the file is successfully uploaded");
			
			
		}
		else {
			System.out.println("upload failed");
		}
		
		
		
	}

}
