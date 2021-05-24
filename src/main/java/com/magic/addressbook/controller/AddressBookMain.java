package com.magic.addressbook.controller;

import com.magic.addressbook.entity.PersonInfo;
import com.magic.addressbook.services.Operations;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        String controlVariable = "y";

        do{
            System.out.println("Enter 'add' to Add New Data.");
            System.out.println("Enter 'del' to Delete Data.");
            System.out.println("Enter 'edit' to Update Data.");

            String input = scanner.nextLine();

            switch (input){
                case "add":{
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

                    operations.addContact(new PersonInfo(firstName, lastName,address,
                            city,state,zipCode,phoneNumber,zipCode,email));
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;
                }

                case "del":{
                    System.out.println("Enter the Serial Number to delete...");
                    int serialNumber = scanner.nextInt();
                    operations.deleteContact(serialNumber);
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;

                }

                case  "edit":{
                    System.out.println("Enter Serial Number to Edit");
                    int serialNumber = scanner.nextInt();
                    System.out.println("Enter the column to Edit");
                    int columnNumber = scanner.nextInt();
                    System.out.println("Enter Detail");
                    String editedDetail = scanner.nextLine();
                    operations.updateContact(serialNumber,columnNumber,editedDetail);
                    System.out.println("Do you want to Continue?(y/n)");
                    controlVariable = scanner.nextLine();
                    break;
                }

            }
        }while (controlVariable.endsWith("n"));
    }
}
