package com.itFactory.problema6;

import java.util.Objects;

public class Persoana {
    private String id;
    private String nume;

    public Persoana(String id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Persoana() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persoana persoana = (Persoana) obj;
        return id.equals(persoana.id) && nume.equals(persoana.nume);
    }
}
