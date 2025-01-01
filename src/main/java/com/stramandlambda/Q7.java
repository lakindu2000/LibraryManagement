package com.stramandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,288,54,785,4444,695,82,11,235,6589,1,85);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
