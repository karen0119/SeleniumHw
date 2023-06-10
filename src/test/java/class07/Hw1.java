package class07;

/* Task1:
     * goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
     * login
     * click on PIM
     * from the table choose any ID
     * and print out the row number of that id
     *  please make sure that ur code is dynamic enough to cater if another row gets deleted, it still prints the row correctly
*/


import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hw1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> IDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < IDs.size(); i++) {
            String noID = IDs.get(i).getText();
            if( noID.equals("55725A")) {
                System.out.println("row number of 55725A is "+(i+1));
            }
        }
    }
}


