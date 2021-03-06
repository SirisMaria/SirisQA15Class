package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactHelper extends HelperBase{
    public ContactHelper(WebDriver wd){
        super(wd);

    }

    public void type(By locator, String test) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(test);
    }

    public void returnToGroupsPage() {
        click(By.cssSelector("i a[href='group.php']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(String groupName, String groupHeader, String groupFooter) {
        type(By.name("group_name"), groupName);
        type(By.name("group_header"), groupHeader);
        type(By.name("group_footer"), groupFooter);
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void openGroupsPage() {
        click(By.cssSelector("[href='group.php']"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void initGroupModification() {
        click(By.cssSelector("[name=edit]:last-child"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));

    }

    public void deleteGroup() {
        click(By.xpath("//input[@name='delete'][2]"));

    }

    public void fillContactForm(ContactData group) {
        type(By.name("firstname"), group.getFirstName());
        type(By.name("lastname"), group.getLastName());
        type(By.name("address"), group.getAddress());
        type(By.name("mobile"), group.getPhone());
        type(By.name("email"), group.getEmail());
    }

    public void addNewContact() {
        click(By.cssSelector("[href='edit.php'"));
    }

    public void updateContactModification() {
        click(By.name("update"));
    }

    public void selectContact() {
        click(By.cssSelector("[href='edit.php?id=10']"));
    }

    public void pageContactHome() {
        click(By.cssSelector("[href='./']"));
    }

    public void deleteContact() {
        click(By.cssSelector("[value=Delete]"));
    }

    public void selectContact1() {
        click(By.name("selected[]"));
    }

    public void popUpWindow() {
        wd.switchTo().alert().accept();
    }


    public boolean isContactPresent(){
        isElementPresent(By.name("selected[]"));
        return true;
    }

    public void createContact() {
        addNewContact();
        fillContactForm(new ContactData()
                .setFirstName("Maria")
                .setLastName("Siris")
                .setAddress("Kfar Sava")
                .setPhone("052000000")
                .setEmail("siris@gmail.com"));
        enterNewContact();

    }

    private void enterNewContact() {
        return;
    }

    @Test
    public void testContactDeletion(){
        pageContactHome();
        int before = getContactCount();

        selectContact1();
        deleteContact();
        popUpWindow();
        int after = getContactCount();
        Assert.assertEquals(after,before-1);


    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }
}
