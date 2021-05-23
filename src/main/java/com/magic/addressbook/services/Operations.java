package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Operations implements IOperations {
    PersonInfo personInfo = null;
    List<PersonInfo> personInfoList = new ArrayList<>();

    @Override
    public void addContact(PersonInfo personInfo) {
        this.personInfo = personInfo;
        personInfoList.add(personInfo);

    }

    @Override

    public void deleteContact(int serialNumber) {
        if (Objects.isNull(personInfo))
            System.out.println("Person not exists Address Book.");
        else {
            personInfoList.get(serialNumber);
            System.gc();
            System.runFinalization();
            System.out.println("Deleted Successfully");
        }
    }

    @Override
    public void view() {

        if (Objects.isNull(personInfo))
            System.out.println("==== Address Book is Empty ====");
        else {
            for (PersonInfo personInfo : personInfoList) {
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

    @Override

    public void updateContact(int serialNumber, int columnNumber, String editedInfo) {
        serialNumber -= 1;
        if (Objects.isNull(personInfo))
            System.out.println("This Info doesn't exist to edit.");
        else {
            switch (columnNumber) {
                case 1:
                    personInfoList.get(serialNumber).setFirstName(editedInfo);
                    break;

                case 2:
                    personInfoList.get(serialNumber).setLastName(editedInfo);
                    break;
                case 3:
                    personInfoList.get(serialNumber).setAddress(editedInfo);
                    break;
                case 4:
                    personInfoList.get(serialNumber).setCity(editedInfo);
                    break;
                case 5:
                    personInfoList.get(serialNumber).setState(editedInfo);
                    break;
                case 6:
                    personInfoList.get(serialNumber).setZipCode(editedInfo);
                    break;
                case 7:
                    personInfoList.get(serialNumber).setPhoneNumber(editedInfo);
                    break;
                case 8:
                    personInfoList.get(serialNumber).setEmail(editedInfo);
                    break;
                default:
                    System.out.println("Nothing to edit....");

            }
        }
    }

}
