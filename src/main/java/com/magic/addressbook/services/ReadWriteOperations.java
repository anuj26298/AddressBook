package com.magic.addressbook.services;

import com.magic.addressbook.entity.PersonInfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadWriteOperations {

    Path path = Paths.get("C:\\Users\\ANUJ\\IdeaProjects\\AddressBook\\src\\data\\");

    public void writeToTextFile(String fileName, List<PersonInfo> personInfoList) throws IOException{
        StringBuffer stringBuffer = new StringBuffer();
        personInfoList.forEach(person -> {
            String personData = person.toString().concat("\n");
            stringBuffer.append(personData);
        });
        Files.write(Paths.get(path + fileName + ".txt"), stringBuffer.toString().getBytes());
    }

    public void readFromTextFile(String filename) throws IOException{
        List<String > lines = Collections.emptyList();
        lines = Files.readAllLines(Paths.get(path + filename + ".txt"));
        lines.forEach(System.out:: println);
    }
}
