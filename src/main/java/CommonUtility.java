import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class CommonUtility {
    public static WebDriver driver;
    public CommonUtility() {

}

    @BeforeSuite
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void sendText(By element,String input)
   {
       driver.findElement(element).sendKeys(input);
   }
   public void clickOnBtn(By element)
   {
       WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(element));
       btn.click();

   }
   public String getText(By element)
   {    WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(element));

       return driver.findElement(element).getText();
   }


}
