package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    /*
    hw2:
        - go to facebook.com
        - click on create account
            and select your date of birth using select class
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement newAcc = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
        newAcc.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.click();

        Select birthdayMonth = new Select(month);
        birthdayMonth.selectByVisibleText("Dec");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        day.click();

        Select birthday = new Select(day);
        birthday.selectByIndex(1);
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

        Select birthdayYear = new Select(year);
        birthdayYear.selectByValue("1997");
        Thread.sleep(2000);

        driver.quit();
    }
}
