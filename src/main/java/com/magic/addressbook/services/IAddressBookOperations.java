package com.magic.addressbook.services;

public interface IAddressBookOperations {
    void createAddressBook(String bookName);
    void openAddressBook(String bookName);
    void showAddressBook();
    void searchPersonByCity(String city);
    void searchPersonByState(String state);
}
