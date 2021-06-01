package com.magic.addressbook.controller;

import com.magic.addressbook.entity.*;
import com.magic.addressbook.services.*;

import java.util.List;
import java.util.Scanner;

public class ContactOperations {
    public void contactOperation(List<PersonInfo> personInfos) {
        Scanner scanner = new Scanner(System.in);
        IOperations operations = new Operations();
        String controlVariable = "y";

        do {
            System.out.println("Enter 'add' to Add New Data.");
            System.out.println("Enter 'del' to Delete Data.");
            System.out.println("Enter 'edit' to Update Data.");
            System.out.println("Enter 'view' to view Address Book");
            String input = scanner.nextLine();

            switch (input) {
                case "add": {
                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.println("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.println("Enter Zip Code: ");
                    String zipCode = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter E-mail: ");
                    String email = scanner.nextLine();

                    operations.addContact(personInfos, new PersonInfo(firstName,lastName,address,city
                            ,state, zipCode, email, phoneNumber));
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();

                    break;
                }

                case "del": {
                            scanner.next();
                    System.out.println("Enter First Name");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name");
                    String lastName = scanner.nextLine();
                    operations.deleteContact(personInfos,firstName,lastName);
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;
                }

                case "edit": {
                    scanner.next();
                    System.out.println("Enter Person's Old First Name");
                    String oldFirstName = scanner.nextLine();
                    System.out.println("Enter Person's Old Last Name");
                    String oldLastName = scanner.nextLine();
                    System.out.println("Enter New First Name");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Enter New Last Name");
                    String newLastName = scanner.nextLine();
                    System.out.println("Enter New Address");
                    String newAddress = scanner.nextLine();
                    System.out.println("Enter New City");
                    String newCity = scanner.nextLine();
                    System.out.println("Enter New State");
                    String newState = scanner.nextLine();
                    System.out.println("Enter New Zipcode");
                    String newZipcode = scanner.nextLine();
                    System.out.println("Enter New Email");
                    String newEmail = scanner.nextLine();
                    System.out.println("Enter New Mobile Number");
                    String newMobileNumber = scanner.nextLine();
                    operations.updateContact(personInfos, oldFirstName, oldLastName, new PersonInfo(
                            newFirstName, newLastName, newAddress, newCity , newState, newZipcode, newMobileNumber, newEmail));
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;
                }
                case "view":
                    operations.view(personInfos);
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;

                default:
                    System.out.println("Enter correct input...");
                    break;


            }
        } while (controlVariable.equals("y"));
    }
}

