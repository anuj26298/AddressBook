package com.magic.addressbook.services;
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
}
