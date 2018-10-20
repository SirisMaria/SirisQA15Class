package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {

    @Test
    public void testContactDeletion(){
        pageContactHome();
        selectContact1();
        deleteContact();
        popUpWindow();

    }

}
