package Utilis;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CommonMethods {

    public static WebDriver driver;
    //to open and launch website method
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
    //close browser method
    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    //send text method
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    // Drop down method
    public static void selectFromDropdown(String text, WebElement element) {
        Select sel = new Select(element);
        sel.selectByValue(text);
    }
    //take screenshot method
    public static void takeScreenshot(String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir") + "\\Files\\Screenshots\\" + fileName + ".png"));
    }
}
