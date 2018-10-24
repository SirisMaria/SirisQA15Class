package com.telRan.addressbook;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.openGroupsPage();
        app.selectGroup();
        app.initGroupModification();
        app.fillGroupForm("modifyed","new","Change");
        app.submitGroupModification();
        app.returnToGroupsPage();
    }

}
