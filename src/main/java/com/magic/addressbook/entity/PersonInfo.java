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
}

public PersonInfo(String firstName, String lastName, String city, String state,
                  String zipCode,String phoneNumber, String email){
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
    this.email = email;
}

/*
    Getters and Setters
 */

public void getFirstName(){
    System.out.println("First Name:" + firstName);
}
public void setFirstName(String firstName){
    this.firstName = firstName;
}

public void getLastName(){
    System.out.println("Last Name: " + lastName);
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public void getAddress(){
    System.out.println("Address: " + address);
}
public void setAddress(String address){
    this.address = address;
}
public void getCity(){
    System.out.println("City: " + city);
}
public void setCity(String city){
    this.city = city;
}

public void getState(){
    System.out.println("State: " + state);
}
public void setState(String state){
    this.state = state;
}

public void getZipCode(){
    System.out.println("Zip Code: " + zipCode);
}
public void setZipCode(String zipCode){
    this.zipCode = zipCode;
}
public void getPhoneNumber(){
    System.out.println("Phone Number: " + phoneNumber);
}
public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
}
public void getEmail(){
    System.out.println("Email: " + email);
}
public void setEmail(String email){
    this.email = email;
}