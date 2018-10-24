package com.telRan.addressbook;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        app.addNewContact();
        if(!app.isContactPresent()) {
            app.createContact();
        }
    }
    @Test
    public void testContactModification(){
        app.pageContactHome();
        int before = app.getContactCount();

        app.selectContact();
        app.fillContactForm(new ContactData()
                .setFirstName("Vasya")
                .setLastName("Ivanov")
                .setAddress("Tel Aviv")
                .setPhone("0544563221")
                .setEmail("ivanov@gmail.com"));
        app.updateContactModification();
        int after = app.getContactCount();
        Assert.assertEquals(after,before);

    }

}
