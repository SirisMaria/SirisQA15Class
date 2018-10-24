package com.telRan.addressbook;

import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase {
    @Test
    public void testGroupDeletion(){
        app.openGroupsPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupsPage();
    }

}
