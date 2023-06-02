package Utilis;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.URL;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        // maximize the window
        driver.manage().window().maximize();

        //navigate to the url
        driver.get(URL);

    }
    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    public static void selectFromDropdown(String text, WebElement element) {
        Select sel = new Select(element);
        sel.selectByValue(text);
    }
}
