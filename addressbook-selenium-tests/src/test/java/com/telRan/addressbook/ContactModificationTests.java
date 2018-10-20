package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification(){
        pageContactHome();
        selectContact();
        fillContactForm("Vasya", "Ivanov", "Tel Aviv","0544563221","ivanov@gmail.com");
        updateContactModification();

    }

}
