package class06;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HW2 extends CommonMethods {
    /*
    Hw2:
    Go to http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
    Click on get new user
    Print the firstname of user
     */
    public static void main(String[] args) throws InterruptedException {

        String URL = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(URL,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement button1= driver.findElement(By.xpath("//button[text()='Get New User']"));
        button1.click();

        Thread.sleep(3000);
        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());
        driver.quit();


    }
}
