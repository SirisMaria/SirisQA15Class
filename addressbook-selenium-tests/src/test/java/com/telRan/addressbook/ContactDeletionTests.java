package com.telRan.addressbook;

import org.testng.annotations.BeforeMethod;

public class ContactDeletionTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        app.getContact().addNewContact();
        if(!app.getContact().isContactPresent()) {
            app.getContact().createContact();
        }
    }

}
