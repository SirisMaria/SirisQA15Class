package com.telRan.addressbook;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getContact().openGroupsPage();
        app.getContact().selectGroup();
        app.getContact().initGroupModification();
        app.getContact().fillGroupForm("modifyed","new","Change");
        app.getContact().submitGroupModification();
        app.getContact().returnToGroupsPage();
    }

}
