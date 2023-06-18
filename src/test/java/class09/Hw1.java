package class09;

import Utilis.CommonMethods;

import java.io.IOException;

public class Hw1 extends CommonMethods {
    /*
    create a method in Common methods for screenshot
    it should take file name as a parameter
     */

    // Practice
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        takeScreenshot("Practice");
        Thread.sleep(1000);
        driver.quit();

    }
}
