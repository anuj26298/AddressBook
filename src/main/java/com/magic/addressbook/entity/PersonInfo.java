package com.magic.addressbook.entity;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;


    public PersonInfo(String firstName, String lastName, String address, String city, String state,
                      String zipCode, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
/*
    Getters and Setters
 */

    public String getFirstName() {
        System.out.println("First Name:" + firstName);
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("Last Name: " + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        System.out.println("Address: " + address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getCity() {
        System.out.println("City: " + city);
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        System.out.println("State: " + state);
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        System.out.println("Zip Code: " + zipCode);
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        System.out.println("Phone Number: " + phoneNumber);
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}