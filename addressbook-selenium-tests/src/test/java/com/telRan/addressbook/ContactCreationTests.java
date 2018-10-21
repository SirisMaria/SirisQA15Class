package com.telRan.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        addNewContact();
        fillContactForm(new GroupData()
                .setFirstName("Maria")
                .setLastName("Siris")
                .setAddress("Kfar Sava")
                .setPhone("052000000")
                .setEmail("siris@gmail.com"));
        enterNewContact();
    }


}
