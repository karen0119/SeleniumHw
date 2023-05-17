import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    /*
    HW2:
    * navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
    * enter the username "Tester"
    * enter the password "test"
    * get the title of the webPage and confirm that it is  "Web Orders Login"
     */
    public class HW02ConfirmTitle {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
            String title = driver.getTitle();
            System.out.println(title);
            if (title.equals("Web Orders Login")) {
                System.out.println("The title is correct");
            } else {
                System.out.println("The title is incorrect");
            }
        }
    }
}
