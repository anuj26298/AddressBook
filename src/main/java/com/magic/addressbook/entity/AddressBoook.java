package com.magic.addressbook.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressBoook {
    public List<PersonInfo> personInfoList = new ArrayList<>();

    public List<PersonInfo> getPersonInfoList() {
        return personInfoList;

    }
    public AddressBoook(List<PersonInfo> personInfoList){
        this.personInfoList = personInfoList;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "personInfoList=" + personInfoList +
                '}';
    }
}
