package com.cybertek.tests.day2_loctions_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        //TC #1: Cybertek Verification
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to http://google.com
         driver.get("http://google.com");

        // 3. Click to Gmail from top right
        // Expected: cybertekschool

        driver.findElement(By.linkText("Gmail") ).click();

        driver.manage().window().fullscreen();



        //4. Verify title:
        //Expectecd: practice
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail itle verification PASSED!");
        }else{
            System.out.println("Gmail Title verification FAILED!!!");
        }


        //5. Go back to Google by using the .back();
        driver.navigate().back();

        //6. Verify title emails:
        //Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle) ){
            System.out.println("Google title verification PASSED!");
        } else{
            System.out.println("Google title verification FAILED!!!");
        }

    }
}
