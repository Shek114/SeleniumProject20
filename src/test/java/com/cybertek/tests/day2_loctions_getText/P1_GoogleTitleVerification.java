package com.cybertek.tests.day2_loctions_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {

    public static void main(String[] args) {

        //TC #1: Google Title Verification
        // 1. Open Chrome Browser
              // set up the browser driver

        WebDriverManager.chromedriver().setup();
        // if using browser drivers locoally, then need to use System.setProperty everytime
        // we use WebdriverManager

           // opne a chrome browser
        // we create an instance of ChromeDriver, which also opens an empty browser for us
        WebDriver driver = new ChromeDriver();


        // 2. Go to https://www.google.com
        driver.get("https://www.google.com");


        // 3. Verify title
        // Expected: Google

        String expectedTitle = "Google";
        String actualTiltle = driver.getTitle();

        if(actualTiltle.equals(expectedTitle) ){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

    }
}
