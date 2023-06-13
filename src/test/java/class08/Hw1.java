package class08;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw1 extends CommonMethods {
    /*
         Task:
    goto syntax hrms:
    http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    login
    click on recruitment
    select a date on the calendar
 */
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //login to syntax hrms
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement userPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        userPassword.sendKeys("Hum@nhrm123");
        WebElement logInBtn = driver.findElement(By.xpath("//input[contains(@id, 'btn')]"));
        logInBtn.click();

        // click on recruitment btn
        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();

        // click on from calendar
        WebElement fromCalenderBtn = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        fromCalenderBtn.click();

        //select the month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Dec");
        selectMonth.equals("Dec");

        //select the year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("2023");

        //select the day
        List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
        for (WebElement date : allDates) {
            String currentDate = date.getText();
            if (currentDate.equals("1")) {
                date.click();
            }
        }
    }

}
