package com.itFactory.problema4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String cuvinte[] = text.split(" ");

        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (String x : cuvinte) {
            boolean esteAdaugat = set.add(x);
            if (esteAdaugat) {
                cnt++;
            }
        }
        System.out.println("nmarul de cuvinte distincte este :" + cnt);
    }
}
