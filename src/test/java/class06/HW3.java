package class06;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class HW3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        Hw3:
        Develop a function in common methods to select from dropdown (single select)
         */


        /* How the function in CommonMethods looks:
                   public static void selectFromDropdown(String text, WebElement element){
                     Select sel=new Select(element);
                     sel.selectByValue(text);}
         */


        // Practice:
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // select a day
        String day="Monday";
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//select[@class='form-control']"));
        selectFromDropdown(day,element);

    }

}
