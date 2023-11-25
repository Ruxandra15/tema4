package com.itFactory.problema3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema3_3 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            lista1.add(x);
        }
        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            lista2.add(x);
        }
        for (int i = 0; i < 5; i++) {
            if (lista2.contains(lista1.get(i))) {
                lista3.add(lista1.get(i));
            }
        }

        System.out.println(lista3);

    }
}
