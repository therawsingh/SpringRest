package com.java.rest.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try{

            ObjectMapper mapper = new ObjectMapper();
            Student temp = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println(temp.getId());
            System.out.println(temp.getFirstName());
            System.out.println(temp.getLastName());
            System.out.println(temp.isActive());
            System.out.println(temp.getAddress().toString());

            for(String l : temp.getLanguages()){
                System.out.print(l);
                System.out.print(" , ");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
