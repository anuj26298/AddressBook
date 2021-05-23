package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

public interface IOperations {
    void addContact(PersonInfo personInfo);
    void view();
    void updateContact(int serialNumber, int columnNumber, String editedInfo);
    void deleteContact(int serialNumber);

}
