package com.java8PlusVersions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateDuplicates {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Suren", "Syon", "Suren");

        List<String> uniqueNameList = names.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueList of names with Java 8++"+ uniqueNameList);
    }
}
