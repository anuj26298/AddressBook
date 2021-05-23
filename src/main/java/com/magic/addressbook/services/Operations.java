package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.util.ArrayList;
import java.util.List;

public class Operations  implements IOperations{
    PersonInfo personInfo = null;
    List<PersonInfo> personInfoList = new ArrayList<>();
    @Override
     public void addContact(PersonInfo personInfo){
        this.personInfo = personInfo;
        personInfoList.add(personInfo);

    }
}
