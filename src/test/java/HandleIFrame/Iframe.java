package HandleIFrame;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
	//handle single page   
		
		driver.switchTo().frame("singleframe");
		
		
	WebElement inputField=	driver.findElement(By.xpath("//input[@type='text']"));
	
	inputField.sendKeys("i frame");
	
	
	//take a screen shot
	
	TakesScreenshot ts = (TakesScreenshot)driver;
File sourcefile= ts.getScreenshotAs(OutputType.FILE);
File targetfie = new File(System.getProperty("user.dir")+"\\Screenshot\\screenshot.png");
	sourcefile.renameTo(targetfie);
	System.out.println("Screenshot is done");
	
		
		
		
		
		
		
	}

}
