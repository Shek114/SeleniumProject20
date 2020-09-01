package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args)throws InterruptedException{


        //1 - set up the web driver
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().setup();
      //  System.setProperties("driver.type","path to the driver");
        // System.setProperties("webdriver.chrome.driver","path to the driver");

        // - create the instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //3 - test if driver is working
        driver.get("https://www.google.com");

        System.out.println(" The title of the page is: " + driver.getTitle() );

        String actualTitle = driver.getTitle();

        System.out.println("The title of the page is: " + actualTitle );

        String actualUrl = driver.getCurrentUrl();

        System.out.println("actualTitle = " + actualTitle);

       Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(300);
        driver.navigate().forward();

        Thread.sleep(300);
        driver.navigate().forward();

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.iherb.com");
        driver.navigate().to("https://www.yahoo.com");

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();  Mac


    }
}
