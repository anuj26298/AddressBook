package com.magic.addressbook.controller;

import com.magic.addressbook.entity.*;
import com.magic.addressbook.services.*;

import java.util.Scanner;
/*
    @author Anuj Kumar
 */

/*
    Main Class of the Address Book System
 */
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAddressBookOperations addBookOperations = new AddressBookOperations();
        String controlVariable;

        do {
            System.out.println("Enter 'create' to create new Address Book");
            System.out.println("Enter 'open' to open a Address Book");
            System.out.println("Enter 'all' to view all Address Book");
            System.out.println("Enter 'search' to search persons");
            System.out.println();
            System.out.println();
            String input = scanner.nextLine();
            switch (input) {
                case "create":
                    System.out.println("Enter Address Book Name: ");
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
                case "search":
                    do {
                        System.out.println("Enter 'city' to search by city.");
                        System.out.println("Enter 'state' to search by state.");
                        input = scanner.nextLine();
                        switch (input) {
                            case "city":
                                System.out.println("Enter City Name");
                                String city = scanner.nextLine();
                                addBookOperations.searchPersonByCity(city);

                            case "state":
                                System.out.println("Enter State Name");
                                String state = scanner.nextLine();
                                addBookOperations.searchPersonByState(state);

                            default:
                                System.out.println("Enter correct Input");
                        }
                        System.out.println("Wanna Search again?(yes/no)");
                        controlVariable = scanner.nextLine();
                    } while (controlVariable == "yes");
                case "all":
                    addBookOperations.showAddressBook();
                    break;
            }
            System.out.println("Do you want to continue?(y/n)");
            controlVariable = scanner.nextLine();

        } while (controlVariable.equals("y"));
    }
}
