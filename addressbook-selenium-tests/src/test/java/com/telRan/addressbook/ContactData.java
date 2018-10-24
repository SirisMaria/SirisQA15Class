package com.telRan.addressbook;

public class ContactData {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;


    public ContactData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;

    }

    public ContactData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactData setAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
