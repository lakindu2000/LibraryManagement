package com.stramandlambda;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Kalana","Kaushalya","Chathurika");
        System.out.println(nameList);
        List<String> newList = nameList.stream().map(String::toUpperCase).toList();
        System.out.println(newList);
        System.out.println(nameList.stream().map(String::toLowerCase).toList());
    }
}
