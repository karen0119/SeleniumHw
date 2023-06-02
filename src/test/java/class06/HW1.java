package class06;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1 extends CommonMethods {
    /*
        HW1:
        goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
        click on start
        print the text  "welcome syntax technologies "on console
*/

    public static void main(String[] args) throws InterruptedException {

        String url = " http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        Thread.sleep(2000);
        WebElement startBtn= driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));


        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());
        driver.quit();
    }
    }

