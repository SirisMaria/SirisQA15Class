package com.telRan.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getContact().openGroupsPage();
        app.getContact().initGroupCreation();
        app.getContact().fillGroupForm("QA15", "jhjfgh", "footer");
        app.getContact().submitGroupCreation();
        app.getContact().returnToGroupsPage();

    }

}
