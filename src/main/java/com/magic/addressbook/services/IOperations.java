package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.util.List;

public interface IOperations {
    void addContact(List<PersonInfo> personInfos, PersonInfo personInfo);
    void view(List<PersonInfo> personInfos);
    void updateContact(List<PersonInfo> personInfos, String firstName, String lastName, PersonInfo personInfo);
    void deleteContact(List<PersonInfo> personInfos, String firstName, String lastName);

}
