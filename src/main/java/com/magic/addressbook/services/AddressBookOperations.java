package com.magic.addressbook.services;
/*
    This class implements the IAddressBookOperations Interface class
 */
import com.magic.addressbook.controller.*;
import com.magic.addressbook.entity.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookOperations implements IAddressBookOperations {
    HashMap<String, List<PersonInfo>> addressBook = new HashMap<>();

    @Override
    public void createAddressBook(String bookName) {

        addressBook.put(bookName, new ArrayList<>());
    }

    @Override
    public void openAddressBook(String bookName) {
        ContactOperations contact_operations = new ContactOperations();
        contact_operations.contactOperation(addressBook.get(bookName));
    }

    @Override
    public void showAddressBook() {
        for (Map.Entry mapValue : addressBook.entrySet()) {
            String key = (String) mapValue.getKey();
            System.out.println(key);
        }
    }

    @Override
    public void searchPersonByCity(String city) {
        long count = 0;
        for (List<PersonInfo> addbook : addressBook.values()) {
            count = addbook.stream()
                    .filter(PersonInfo -> PersonInfo.getCity().equalsIgnoreCase(city))
                    .count();
        }
        System.out.println("Number of Person from " + city + ": " + count);
    }

    @Override
    public void searchPersonByState(String state) {
        long count = 0;
        for (List<PersonInfo> addbook : addressBook.values()){
            count = addbook.stream()
                        .filter(PersonInfo -> PersonInfo.getState().equalsIgnoreCase(state))
                    .count();
        }
        System.out.println("Number of Person from " + state + ": " + count);
    }

    @Override
    public void writeToTextFile(String filename, String addressBookName) throws IOException {
        ReadWriteOperations readWriteOperations = new ReadWriteOperations();
        readWriteOperations.writeToTextFile(filename,addressBook.get(addressBookName));
    }

    @Override
    public void readFromTextFile(String filename) throws IOException {
        ReadWriteOperations readWriteOperations = new ReadWriteOperations();
        readWriteOperations.readFromTextFile(filename);

    }

    @Override
    public void WriteToCSVFile(String filename, String addressBookName) throws IOException {
        ReadWriteOperations readWriteOperations = new ReadWriteOperations();
        readWriteOperations.writeDataToCSVFile(filename, addressBook.get(addressBookName));
    }

    @Override
    public void readFromCSVFile(String filename) throws IOException {
        ReadWriteOperations readWriteOperations = new ReadWriteOperations();
        readWriteOperations.readFromCSVFile(filename);
    }
}
