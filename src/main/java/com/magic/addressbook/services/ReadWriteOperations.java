package com.magic.addressbook.services;

import com.google.gson.Gson;
import com.magic.addressbook.entity.PersonInfo;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

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

    public void writeDataToCSVFile(String filename, List<PersonInfo> personInfoList) throws IOException{
        try{
            Writer writer = Files.newBufferedWriter(Paths.get(path + filename + ".csv"));
            StatefulBeanToCsv<PersonInfo> beanToCsv = new
                    StatefulBeanToCsvBuilder<PersonInfo>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();

            beanToCsv.write(personInfoList);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
    }

    public void readFromCSVFile(String filename){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(path + filename + ".csv"));
            String[] nextData;
            while ((nextData = csvReader.readNext()) != null){
                System.out.println("Fisrt Name:-" + nextData[0]);
                System.out.println("Last Name:-" + nextData[0]);
                System.out.println("City:-" + nextData[0]);
                System.out.println("State :-" + nextData[0]);
                System.out.println("Zip Code:-" + nextData[0]);
                System.out.println("Mobile Number:-" + nextData[0]);
                System.out.println("Email:-" + nextData[0]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToJSONFile(String filename, List<PersonInfo> personInfoList) throws IOException{
        Path jsonFilePath = Paths.get(path + filename + ".json");
        Gson gson = new Gson();
        String json = gson.toJson(personInfoList);
        FileWriter writer = new FileWriter(String.valueOf(jsonFilePath));
        writer.write(json);
        writer.close();
    }

    public void readFromJSONFile(String filename) throws IOException{
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path + filename +
                ".json"));
        PersonInfo[] personInfos = gson.fromJson(bufferedReader,PersonInfo[].class);
        List<PersonInfo> personInfoList = Arrays.asList(personInfos);

        for (PersonInfo personInfo : personInfoList){
            System.out.println(personInfo.getFirstName());
            System.out.println(personInfo.getLastName());
            System.out.println(personInfo.getAddress());
            System.out.println(personInfo.getCity());
            System.out.println(personInfo.getState());
            System.out.println(personInfo.getZipCode());
            System.out.println(personInfo.getPhoneNumber());
            System.out.println(personInfo.getEmail());
        }
    }
}
