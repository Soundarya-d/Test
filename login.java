import java.lang.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login {
public static void main(String[] args) {
// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();

//  Wait For Page To Load
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
System.out.println(allMessages.get(0).getText());

String otp = allMessages.get(0).getText();
System.out.println(otp);

Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher(otp);
while(m.find()) {
String otp1 = m.group();
System.out.println(otp1);
System.out.println(otp1.charAt(0));
}
//driver.close();
}
}
