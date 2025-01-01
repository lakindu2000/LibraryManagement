package com.stramandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = list.stream().filter(x-> x%2 ==0).toList(); //Java 17
        List<Integer> evenList1 = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList()); //Java 11

        System.out.println(evenList);
    }


}
