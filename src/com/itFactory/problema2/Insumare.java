package com.itFactory.problema2;

public class Insumare implements Task {

    private int a;
    private int b;

    public Insumare(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void executa() {
        System.out.println(this.a + this.b);
    }

    public Insumare() {
    }

    @Override
    public String toString() {
        return "Insumare{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
