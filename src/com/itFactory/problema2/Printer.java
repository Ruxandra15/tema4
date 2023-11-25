package com.itFactory.problema2;

public class Printer implements Task {


    private String x;

    public Printer(String x) {
        this.x = x;
    }

    @Override
    public void executa() {
        System.out.println(this.x);
    }

    public Printer() {
    }

    @Override
    public String toString() {
        return "Printer{" +
                "x='" + x + '\'' +
                '}';
    }
}
