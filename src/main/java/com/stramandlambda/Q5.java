package com.stramandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Kalana","Kaushalya","Chathurika","Kasun","Thilina","Samadhi");
        List<String> namesStartWithK = nameList.stream().filter(x->x.startsWith("K")).toList();
        System.out.println(namesStartWithK);
    }
}
