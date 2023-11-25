package com.itFactory.problema5;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdceti numarul :");
        int n = scanner.nextInt();
        if (verificarePalindrom(n)) {
            System.out.println("numarul " + n + " este palindrom");
        } else {
            System.out.println("numarul " + n + " este palindrom");
        }

    }

    private static boolean verificarePalindrom(int n) {
        String numarString = String.valueOf(n);
        String oglindit = new StringBuilder(numarString).reverse().toString();

        return numarString.equals(oglindit);
    }
}
