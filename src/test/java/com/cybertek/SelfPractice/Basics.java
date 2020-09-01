package com.cybertek.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws Throwable{

        WebDriverManager.chromedriver().setup();  // to setup crhome object of ChromeDriver

        ChromeDriver driver = new ChromeDriver();
        String Url = " http://www.Google.com";
        String Url2 = "http://www.amazon.com";
        driver.get(Url);
        Thread.sleep(3000);

        driver.navigate().to(Url2);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
