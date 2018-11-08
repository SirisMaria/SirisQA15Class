package com.telran.qa15.sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gran1 on 20/09/2018.
 */
public class ebay {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new FirefoxDriver();

        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void openSiteTest(){
        wd.navigate().to("https://ebay.com/");

        wd.findElement(By.linkText("Sign in")).click();
        wd.findElement(By.name("userid")).sendKeys("gyjfkjg");
        wd.findElement(By.name("pass")).sendKeys("jghkl");
        wd.findElement(By.id("sgnBt")).click();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

       //wd.quit();//
    }
}
