package com.itFactory.problema6;

import java.util.Objects;

public class Departament {
    private String numeDepartament;

    public Departament() {
    }

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }

    public void setNumeDepartament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "numeDepartament='" + numeDepartament + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departament that)) return false;
        return Objects.equals(getNumeDepartament(), that.getNumeDepartament());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeDepartament());
    }
}