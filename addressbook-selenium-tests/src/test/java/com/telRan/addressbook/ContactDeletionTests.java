package com.telRan.addressbook;

import org.testng.annotations.BeforeMethod;

public class ContactDeletionTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        app.addNewContact();
        if(!app.isContactPresent()) {
            app.createContact();
        }
    }

}
