package com.itFactory.problema3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema3_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            list.add(n);

        }

        int maxx = list.get(0);
        for (int i = 1; i < 10; i++) {
            if (list.get(i) > maxx) {
                maxx = list.get(i);
            }
        }
        System.out.println(maxx);


//        for(Integer j:list){
//            System.out.println(j);
//        }
    }
}
