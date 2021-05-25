package com.magic.addressbook.controller;

import com.magic.addressbook.entity.*;
import com.magic.addressbook.services.*;

import java.util.Scanner;
/*
    @author Anuj Kumar
 */
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAddressBookOperations addBookOperations = new AddressBookOperations();
        String controlVariable = "y";

        do {
            System.out.println("Enter 'create' to create new Address Book");
            System.out.println("Enter 'open' to open a Address Book");
            System.out.println("Enter 'all' to view all Address Book");
            System.out.println();
            System.out.println();
            String input = scanner.nextLine();
            switch (input){
                case "create":
                    System.out.println("Entere Address Book Name: ");
                    String addBookName = scanner.nextLine();
                    addBookOperations.createAddressBook(addBookName);
                    break;

                case "open":
                    System.out.println("---- Available Address Books ----");
                    addBookOperations.showAddressBook();
                    System.out.println("Enter the Address Book Name to be Show");
                    String add_BookName = scanner.nextLine();
                    addBookOperations.openAddressBook(add_BookName);
                    break;

                case "all":
                    addBookOperations.showAddressBook();
                    break;

                default:
                    break;
            }

        }while (controlVariable.equals("y"));
        }
}
