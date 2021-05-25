package com.magic.addressbook.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressBoook {
    public List<PersonInfo> personInfoList = new ArrayList<>();

    public List<PersonInfo> getPersonInfoList(){
        return personInfoList;
    }

    @Override
    public String toString() {
        return "AddressBoook{" +
                "personInfoList=" + personInfoList +
                '}';
    }
}
