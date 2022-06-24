package com.java7MinusVersions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminateDuplicates {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Suren", "Syon", "Suren");

        List<String> uniqueList = new ArrayList<>();

        for(String name: names ){
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("uniqueList of names with Java7--"+ uniqueList);
    }
}
