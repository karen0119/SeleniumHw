package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.facebook.com");

        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        driver.manage().window().maximize();
        createAccount.click();
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Karen");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Vargas");

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("602-587-3285");
        // driver.findElement(By.xpath("//input[@name='reg_email_confirmation__'")).sendKeys("satybaevaaida00@gmail.com");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Prc23");
        driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("December");
        driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1997");
        // driver.findElement(By.xpath("//label[text()='Gender']"));
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
