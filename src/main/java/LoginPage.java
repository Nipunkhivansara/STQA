
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class LoginPage {


    public String checkregistration(Map<String, String> data) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8000/register/");
        WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys(data.get("username"));
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
        return (driver.findElement(By.xpath("/html/body/div/div/div/div[2]/p")).getText());
    }


}