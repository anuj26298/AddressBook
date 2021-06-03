package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.util.List;

/*
    Implementation of Operations like add, update, delete and view contact
 */
public class Operations implements IOperations {

    @Override
    public void addContact(List<PersonInfo> personInfos, PersonInfo personInfo) {

        String firstName = personInfo.getFirstName();
        String lastName = personInfo.getLastName();

        int flag = 0;

        for (PersonInfo info : personInfos) {
            if (info.getFirstName().equalsIgnoreCase(firstName) && info.getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Person Already Exists.");
        else {
            personInfos.add(personInfo);
            System.out.println("Person Information Added Successfully");
        }

    }

    @Override
    public void view(List<PersonInfo> personInfos) {
        for (PersonInfo info : personInfos)
            System.out.println(info);
    }

    @Override
    public void updateContact(List<PersonInfo> personInfos, String firstName, String lastName, PersonInfo personInfo) {
        int flag = 0;
        for (PersonInfo info : personInfos) {
            if (info.getFirstName().equalsIgnoreCase(firstName) && info.getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                info.setFirstName(personInfo.getFirstName());
                info.setLastName(personInfo.getLastName());
                info.setAddress(personInfo.getAddress());
                info.setCity(personInfo.getCity());
                info.setState(personInfo.getState());
                info.setZipCode(personInfo.getZipCode());
                info.setEmail(personInfo.getEmail());
                info.setPhoneNumber(personInfo.getPhoneNumber());
            }
        }
        if (flag == 1)
            System.out.println("Updated Successfully");
        else
            System.out.println("Person Not Found");
    }

    @Override
    public void deleteContact(List<PersonInfo> personInfos, String firstName, String lastName) {
        int flag = 0;
        for (int i = 0; i < personInfos.size(); i++) {
            if (personInfos.get(i).getFirstName().equalsIgnoreCase(firstName) &&
                    personInfos.get(i).getLastName().equalsIgnoreCase(lastName)) {
                flag = 1;
                personInfos.remove(personInfos.get(i));
                break;
            }
        }
        if (flag == 1)
            System.out.println("Person Information deleted Successfully");
        else
            System.out.println("Person Not found");
    }
}
