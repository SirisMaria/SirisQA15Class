package com.Trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://trello.com/");
        wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[1]")).click();

        login("siris230188@gmail.com", "trello88");
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("password"), password);
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void stop() {
        wd.quit();
    }
}
