package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Operations  implements IOperations{
    PersonInfo personInfo = null;
    List<PersonInfo> personInfoList = new ArrayList<>();
    @Override
     public void addContact(PersonInfo personInfo){
        this.personInfo = personInfo;
        personInfoList.add(personInfo);

    }

    @Override

    public void deleteContact(int serialNumber){
        if(Objects.isNull(personInfo))
            System.out.println("Person not exists Address Book.");
        else{
            personInfoList.get(serialNumber);
            System.gc();
            System.runFinalization();
            System.out.println("Deleted Successfully");
        }
    }
    @Override
    public void view(){

        if(Objects.isNull(personInfo))
            System.out.println("==== Address Book is Empty ====");
        else {
            for(PersonInfo personInfo:personInfoList){
                personInfo.getFirstName();
                personInfo.getLastName();
                personInfo.getAddress();
                personInfo.getCity();
                personInfo.getState();
                personInfo.getZipCode();
                personInfo.getPhoneNumber();
                personInfo.getEmail();
            }
        }
    }
}
