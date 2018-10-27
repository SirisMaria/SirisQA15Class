package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    private ContactHelper contact;

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userName, String password) {
        contact.type(By.name("user"), userName);

        contact.type(By.name("pass"), password);
        contact.click(By.cssSelector("[type=submit]"));
    }

    public void enterNewContact() {
        contact.click(By.name("submit"));
    }
}
