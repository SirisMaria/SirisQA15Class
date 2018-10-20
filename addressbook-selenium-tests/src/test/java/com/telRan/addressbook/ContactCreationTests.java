package com.telRan.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        addNewContact();
        fillContactForm("Maria", "Siris", "Kfar Sava", "052000000", "siris@gmail.com");
        enterNewContact();
    }


}
