package com.micro.limitsservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exmple {


    public static void main(String[] args[]) {

        List<Integer> list = Arrays.asList(10,15,8,49,26,98,98,32,15);

        Integer a=list.stream().distinct().max(Integer::compareTo).orElse(0);

        System.out.println(a);
    }



}
