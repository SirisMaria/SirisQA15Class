package com.Trello;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseTrello {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
