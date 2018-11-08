package com.Trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginTrello extends TestBaseTrello {

    @Test
    public void loginIn() {
        app.wd.findElement(By.xpath("//input[@id='login']")).click();
    }
}
