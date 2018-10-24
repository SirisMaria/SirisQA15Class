package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        int before = app.getContactCount();

        app.addNewContact();
        app.fillContactForm(new ContactData()
                .setFirstName("Maria")
                .setLastName("Siris")
                .setAddress("Kfar Sava")
                .setPhone("052000000")
                .setEmail("siris@gmail.com"));
        app.enterNewContact();
        int after = app.getContactCount();
        Assert.assertEquals(after,before+1);
    }


}
