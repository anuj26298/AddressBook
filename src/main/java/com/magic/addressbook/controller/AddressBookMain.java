package com.magic.addressbook.controller;

import com.magic.addressbook.services.*;

import java.io.IOException;
import java.util.Scanner;
/*
    @author Anuj Kumar
 */

/*
    Main Class of the Address Book System
 */
public class AddressBookMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        IAddressBookOperations addBookOperations = new AddressBookOperations();
        ReadWriteOperations readWriteOperations = new ReadWriteOperations();
        String controlVariable = null;

        do {
            System.out.println("Enter 'create' to create new Address Book");
            System.out.println("Enter 'open' to open a Address Book");
            System.out.println("Enter 'all' to view all Address Book");
            System.out.println("Enter 'search' to search persons");
            System.out.println("Enter 'write' to write data in a file");
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
                    String controlVariable1;
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
                        controlVariable1 = scanner.nextLine();
                    } while (controlVariable1 == "yes");
                case "all":
                    addBookOperations.showAddressBook();
                    break;

                case "write":
                    String controlVariable2;

                    do {
                        System.out.println("Enter type of File to write(txt/csv)");
                        input = scanner.next();
                        switch (input) {
                            case "txt":
                                System.out.println("Enter the Address Book name");
                                String addressBookName = scanner.next();
                                System.out.println("Enter the name of file");
                                String textFilename = scanner.next();
                                addBookOperations.writeToTextFile(textFilename, addressBookName);
                                break;
                            case "csv":
                                System.out.println("Enter Address Book Name");
                                String addressBookName1 = scanner.next();
                                System.out.println("Enter filename");
                                String filename1 = scanner.next();
                                addBookOperations.WriteToCSVFile(filename1, addressBookName1);
                                break;
                        }
                        System.out.println("Do you want to continue?(y/n)");
                        controlVariable2 = scanner.next();
                    } while (controlVariable2.equalsIgnoreCase("y"));

                case "read":
                    String controlVariableread1;

                    do {
                        System.out.println("Enter type of File to write(txt/csv)");
                        input = scanner.next();
                        switch (input) {
                            case "txt":
                                System.out.println("Enter filename to read: ");
                                String filename = scanner.next();
                                addBookOperations.readFromTextFile(filename);
                                break;
                            case "csv":
                                System.out.println("Enter filename to read: ");
                                String filename1 = scanner.next();
                                addBookOperations.readFromCSVFile(filename1);
                        }
                        System.out.println("Do you want to continue?(y/n)");
                        controlVariableread1 = scanner.nextLine();

                    } while (controlVariableread1.equalsIgnoreCase("y"));
            }
        } while (controlVariable.equalsIgnoreCase("y"));
    }
}