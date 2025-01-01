package com.stramandlambda;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello", "World","...","!");
        String joinedStr = String.join("-", strList);
        System.out.println(joinedStr);
    }
}
