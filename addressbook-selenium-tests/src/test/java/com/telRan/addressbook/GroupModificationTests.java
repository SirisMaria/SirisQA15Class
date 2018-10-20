package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm("modifyed","new","Change");
        submitGroupModification();
        returnToGroupsPage();
    }

}
