import java.lang.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.List;

public class signup {
public static void main(String[] args) {
// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();

//  Wait For Page To Load
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Navigate to URL
driver.get("https://kycsit.in-d.ai/");

// Maximize the window.
driver.manage().window().maximize();

 WebElement firstname =driver.findElement(By.id("standard-name"));
 WebElement email=driver.findElement(By.id("standard-name3"));
 WebElement phone=driver.findElement(By.id("standard-name1"));
 WebElement company=driver.findElement(By.id("standard-name2"));
 driver.findElement(By.xpath("//button[text()='Sign up']"));
 WebElement signup=driver.findElement(By.xpath("//button[text()='Sign up']"));

 firstname.sendKeys("Soundarya");
 email.sendKeys("soundarya.dharshini@in-d.ai");
 phone.sendKeys("9047093131");
 company.sendKeys("meet1");

//driver.findelement (by.id(“signUpButton”)).click();
//driver.findElementById("signUpButton").click();
 signup.click();
 // Wait For Page To Load
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Thread.sleep(10000);

  String actualUrl="https://kycsit.in-d.ai/otp";
  String expectedUrl= driver.getCurrentUrl(); 

  //System.out.println(actualUrl);

//Assert.assertEquals(expectedUrl,actualUrl);
 
 
// driver.quit();
 

}
}
