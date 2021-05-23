package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

public interface IOperations {
    void addContact(PersonInfo personInfo);
    void view();
    void updateContact();
    void deleteContact();

}
