import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor; 
import java.lang.*;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class otp {
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


 signup.click();
 String oldTab = driver.getWindowHandle();
 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
((JavascriptExecutor)driver).executeScript("window.open()"); 
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
 System.out.println(tabs.size());
//newTab.remove(oldTab);
    // change focus to new tab
driver.switchTo().window(tabs.get(1));
 
 
 // Wait For Page To Load


//new  tab
//String newWindow = driver.getWindowHandle();
//driver.find_element_by_tag_name("body").send_keys(Keys.COMMAND + "t"); 
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//tabs.remove(newWindow);
//driver.switchTo().window(tabs.get(1));


//  Wait For Page To Load
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Navigate to URL
driver.get("https://mail.google.com/");

// Maximize the window.
driver.manage().window().maximize();

//Send email address
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("soundarya.dharshini@in-d.ai");
         driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

// Enter Password
WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));
 WebDriverWait wait = new WebDriverWait(driver, 30);
 wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
 passwordButton.sendKeys("sound@123");
 driver.findElement(By.xpath("//div[@id='passwordNext']")).click();


// Wait For Page To Load
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Below is the OTP to start your Video KYC')]"));

allMessages.get(0).click();
//System.out.println(allMessages.get(0).getText());

String Msg = allMessages.get(0).getText();
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher(Msg);
String otp = null;
while(m.find()) {
otp = m.group();
}
System.out.println(otp);

driver.switchTo().window(oldTab);


WebElement otpElement = driver.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div/div/div/div[3]/div[1]/div/div[1]/input"));
otpElement.sendKeys(otp);
WebElement submitotp =driver.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div/div/div/div[3]/div[2]/button/span[1]"));
submitotp.click();

}
}

