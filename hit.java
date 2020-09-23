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

public class hit {
public static void main(String[] args) {
// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();

//  Wait For Page To Load
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Navigate to URL
driver.get("https://kycsit.in-d.ai/");

// Maximize the window.
driver.manage().window().maximize();

}
}
