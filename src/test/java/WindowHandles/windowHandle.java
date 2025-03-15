package WindowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Window");
		driver.manage().window().maximize();
		
		
		
		//
		WebElement newWindowbtn= driver.findElement(By.xpath("//li[@id='Open New Window']"));
		newWindowbtn.click();
		
		System.out.println("newWindow button clicked");
		
		
		WebElement clickbtn= driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']"));
		clickbtn.click();
		System.out.println("click here btn clicked");
		
		//switch new window
		
		Set<String> windowids  = driver.getWindowHandles();
		List<String>windowList= new ArrayList(windowids);
		
		String parentID = windowList.get(0);
		String childID= windowList.get(1);
		
		// switch to child 
		driver.switchTo().window(childID);
		System.out.println("window change successfully");
		
		// Again click on opennew window
		
		WebElement AgainWindowbtn = driver.findElement(By.xpath("//li[@id='Open New Window']"));
		AgainWindowbtn.click();
		System.out.println(" Again newWindow button clicked");
		
		WebElement againClickbtn= driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']"));
		
		againClickbtn.click();
		
		System.out.println("  Again click here btn clicked");
		
		// back on  the parent window
		driver.switchTo().window(parentID);
		
		System.out.println("successfully back on the parent window");
		
		driver.quit();
		
	}

}
