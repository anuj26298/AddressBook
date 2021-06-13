package com.magic.addressbook.services;

import java.io.IOException;

/*
    Interface of AddressBook Operation
    These Operations are for multiple address book

    *Implementation of this interface is in AddressBookOperation.java file
 */
public interface IAddressBookOperations {
    void createAddressBook(String bookName);
    void openAddressBook(String bookName);
    void showAddressBook();
    void searchPersonByCity(String city);
    void searchPersonByState(String state);
    void writeToTextFile(String filename, String addressBookName) throws IOException;
    void readFromTextFile(String filename) throws IOException;
    void WriteToCSVFile(String filename, String addressBookName) throws IOException;
    void readFromCSVFile(String filename) throws IOException;
    void WriteToJSONFile(String filename, String addressBookName) throws IOException;
    void readFromJSONFile(String filename) throws IOException;

}
