package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        app.getContact().addNewContact();
        if(!app.getContact().isContactPresent()) {
            app.getContact().createContact();
        }
    }
    @Test
    public void testContactModification(){
        app.getContact().pageContactHome();
        int before = app.getContact().getContactCount();

        app.getContact().selectContact();
        app.getContact().fillContactForm(new ContactData()
                .setFirstName("Vasya")
                .setLastName("Ivanov")
                .setAddress("Tel Aviv")
                .setPhone("0544563221")
                .setEmail("ivanov@gmail.com"));
        app.getContact().updateContactModification();
        int after = app.getContact().getContactCount();
        Assert.assertEquals(after,before);

    }

}
