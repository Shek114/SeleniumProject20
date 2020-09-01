package com.cybertek.tests.day2_loctions_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {

    public static void main(String[] args) {

        //TC #1: Cybertek Verification
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //to create instance of chomre browser from WebDriver.
        WebDriver driver = new ChromeDriver();

        // this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        // 2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        // 3. Verify title URL contains
        // Expected: cybertekschool
        String expextedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(expextedUrl.contains(actualUrl)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!!!");

            //4. Verify title:
            //Expectecd: practice
            if(driver.getTitle().equals("Practice") ){
                System.out.println("Title verification PASSED!");
            }else{
                System.out.println("Titlte verification FAILED!!!");
            }

        }
    }
}
