package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        addNewContact();
        if(!isContactPresent()) {
            createContact();
        }
    }

    @Test
    public void testContactDeletion(){
        pageContactHome();
        selectContact1();
        deleteContact();
        popUpWindow();

    }

}
