package com.telRan.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @BeforeMethod
    public void preconditions(){
        addNewContact();
        if(!isContactPresent()) {
            createContact();
        }
    }
    @Test
    public void testContactModification(){
        pageContactHome();
        selectContact();
        fillContactForm(new GroupData()
                .setFirstName("Vasya")
                .setLastName("Ivanov")
                .setAddress("Tel Aviv")
                .setPhone("0544563221")
                .setEmail("ivanov@gmail.com"));
        updateContactModification();

    }

}
