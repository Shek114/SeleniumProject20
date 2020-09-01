package com.cybertek.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Automation {

    public static void main(String[] args) throws Throwable{

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        String Url1 =" https://qa2.vytrack.com";
        String Url2 = "https://app.vytrack.com/user/login";

        driver.get(Url1);
        Thread.sleep(3000);

        driver.get(Url2);
        Thread.sleep(2000);

        //Find user name and set username
        WebElement txtbx_username = driver.findElement(By.id("prependedInput") );

        txtbx_username.sendKeys("user181");

        //Password i set
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.name("_submit")).click();

       // Select sel = new Select(element);

        driver.findElement(By.className("main-menu")).click();
        driver.findElement(By.className("loader-mask")).click();













    }
}
