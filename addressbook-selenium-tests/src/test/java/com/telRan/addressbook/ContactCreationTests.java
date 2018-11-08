package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        int before = app.getContact().getContactCount();

        app.getContact().addNewContact();
        app.getContact().fillContactForm(new ContactData()
                .setFirstName("Maria")
                .setLastName("Siris")
                .setAddress("Kfar Sava")
                .setPhone("052000000")
                .setEmail("siris@gmail.com"));
        app.getSessionHelper().enterNewContact();
        int after = app.getContact().getContactCount();
        Assert.assertEquals(after,before+1);
    }


}
