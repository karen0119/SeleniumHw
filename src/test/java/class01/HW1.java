package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
  HW1:
   * navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
   * fill out the form
   * close the browser
   Note: use name or id as locators
   */
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        //maximize
        driver.manage().window().maximize();

        //find element and send text
        driver.findElement(By.id("customer.firstName")).sendKeys("Moraya");
        driver.findElement(By.id("customer.lastName")).sendKeys("Canales");
        driver.findElement(By.name("customer.address.street")).sendKeys("1800 W Thomas");
        driver.findElement(By.name("customer.address.city")).sendKeys("Phoenix");
        driver.findElement(By.id("customer.address.state")).sendKeys("Arizona");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("85035");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.name("customer.ssn")).sendKeys("1000-5006");
        // wait time
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("Moraya.Canales");
        driver.findElement(By.id("customer.password")).sendKeys("00000KV");
        driver.findElement(By.name("repeatedPassword")).sendKeys("00000KV");
        //wait time
        Thread.sleep(5000);
        driver.quit();
    }
}
