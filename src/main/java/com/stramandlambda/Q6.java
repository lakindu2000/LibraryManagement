package com.stramandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,8,9,12);
        List<Integer> sqrtList = list.stream().map(x->x*x).toList();
        System.out.println(sqrtList);
    }
}
