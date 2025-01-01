package com.stramandlambda;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
//        List<String> nameList = new ArrayList<>();
//        nameList.add("Kalana");
//        nameList.add("Kaushalya");
//        nameList.add("Chathurika");

        List<String> nameList = Arrays.asList("Kalana","Kaushalya","Chathurika");
        System.out.println("Before reverse : "+nameList);

        Collections.reverse(nameList);
        System.out.println("After reverse : "+nameList);



    }
}
