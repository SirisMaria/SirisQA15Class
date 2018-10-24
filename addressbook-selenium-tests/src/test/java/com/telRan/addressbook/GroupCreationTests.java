package com.telRan.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.openGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm("QA15", "jhjfgh", "footer");
        app.submitGroupCreation();
        app.returnToGroupsPage();

    }

}
