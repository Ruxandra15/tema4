package com.itFactory.Problema8;

import java.util.*;

public class Problema8 {
    public static void main(String[] args) {

        Map<Integer,List<Integer>>map=new HashMap<>();
        map.put(1, Arrays.asList(4,6,7,9));
        map.put(2, Arrays.asList(15,30,9,8));
        map.put(3, Arrays.asList(6,77,5,2));
        map.put(4, Arrays.asList(7,35,7,9));
        for(Map.Entry<Integer, List<Integer>> element: map.entrySet()){
            int cheie = element.getKey();
            List<Integer> valori = element.getValue();
            int max=Collections.max(valori);
            System.out.println("Cheia este: " + cheie + " iar maximul este: " + max);

        }
    }
}
