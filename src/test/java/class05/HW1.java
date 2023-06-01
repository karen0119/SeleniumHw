package class05;

import Utilis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
      /*
    HW1)
    go to: http://practice.syntaxtechs.net/javascript-alert-box-demo.php
    click on the last alert
    send keys and accept it
     */
      public static void main(String[] args) throws InterruptedException {
              String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
              String browser="chrome";
              openBrowserAndLaunchApplication(url,browser);
              Thread.sleep(1000);

              WebElement alert1Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
              alert1Btn.click();
              Thread.sleep(2000);

              Alert alert2Btn=driver.switchTo().alert();
              alert2Btn.sendKeys("Practice");
              alert2Btn.accept();

              Thread.sleep(5000);
              driver.quit();

          }
}
