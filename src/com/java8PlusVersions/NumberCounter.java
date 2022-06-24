package com.java8PlusVersions;

import java.util.stream.IntStream;

public class NumberCounter {

    public static void main(String[] args) {

        Integer total = IntStream.rangeClosed(0,16).sum();

        System.out.println("Java8++ Style " + total);

    }
}
