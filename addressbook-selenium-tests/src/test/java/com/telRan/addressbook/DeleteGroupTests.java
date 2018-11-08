package com.telRan.addressbook;

import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase {
    @Test
    public void testGroupDeletion(){
        app.getContact().openGroupsPage();
        app.getContact().selectGroup();
        app.getContact().deleteGroup();
        app.getContact().returnToGroupsPage();
    }

}
