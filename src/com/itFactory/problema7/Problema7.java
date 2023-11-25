package com.itFactory.problema7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problema7 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(25);
        list.add(2);
        list.add(67);
        list.add(2);
        list.add(15);
        list.add(25);
        list.add(28);
        list.add(10);
        list.add(11);
        list.add(11);

        Set<Integer>set=new HashSet<>(list);
        System.out.println(set);

    }
}
