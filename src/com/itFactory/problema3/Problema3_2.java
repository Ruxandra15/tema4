package com.itFactory.problema3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema3_2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> lista1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String cuvant = scanner.nextLine();
            lista.add(cuvant);
        }
        String lungime_max = lista.get(0);
        int k = 0;
        for (int i = 1; i < 5; i++) {
            if (lungime_max.length() < lista.get(i).length()) {
                lungime_max = lista.get(i);
            }
        }

        for (int i = 0; i < 5; i++) {
            if (lungime_max.length() == lista.get(i).length()) {
                k++;
                lista1.add(lista.get(i));
            }
        }

        if (k != 0) {
            System.out.println(lista1);
        } else {
            System.out.println(lungime_max);
        }
    }
}
