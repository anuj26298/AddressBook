package com.magic.addressbook.services;

import com.magic.addressbook.controller.*;
import com.magic.addressbook.entity.*;

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
        for (Map.Entry mapValue :  addressBook.entrySet()){
            String key = (String)mapValue.getKey();
            System.out.println(key);
        }
    }

}
