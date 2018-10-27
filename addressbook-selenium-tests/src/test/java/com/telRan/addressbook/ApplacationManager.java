package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplacationManager {
    SessionHelper sessionHelper;
    MyContactHelper contact;
    private WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        wd.get("http://localhost/addressbook");


        sessionHelper.login("admin", "secret");
        contact = new MyContactHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public ContactHelper getContact() {
        return contact;
    }
    public boolean isElementPresent(By locator) {

        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    private class MyContactHelper extends ContactHelper {
        public MyContactHelper(WebDriver wd) {
            super(wd);
        }
    }
}
