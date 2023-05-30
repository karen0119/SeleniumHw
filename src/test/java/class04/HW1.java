package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    /*
    HW1:
       - go to http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
       - select , tuesday, thursday and friday one by one
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement select = driver.findElement(By.xpath("//select[@id='select-demo']"));
        select.click();
        Thread.sleep(2000);

        Select option = new Select(select);

        option.selectByValue("Tuesday");
        Thread.sleep(2000);

        option.selectByIndex(5);
        Thread.sleep(2000);

        option.selectByVisibleText("Friday");
        Thread.sleep(2000);

        driver.quit();


    }
}
