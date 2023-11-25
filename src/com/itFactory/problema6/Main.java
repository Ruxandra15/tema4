package com.itFactory.problema6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Persoana,Departament> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        map.put(new Persoana("ana1234","Ana"),new Departament("resurse umane"));
        map.put(new Persoana("ruxi@@","Ruxandra"),new Departament("resurse umane"));
        map.put(new Persoana("alex79","Alexandru"),new Departament("resurse umane"));




        System.out.println("introduceti id-ul :");
        String id=scanner.nextLine();
        System.out.println("introduceti numele:");
        String nume=scanner.nextLine();

        Persoana persoana=new Persoana(id,nume);

        if(map.containsKey(persoana)){
            System.out.println("introduceti noul departament");
            String numeDepartamentNou=scanner.nextLine();

            Departament DeparamentCurent=map.get(persoana);
            if(!DeparamentCurent.equals(new Departament(numeDepartamentNou))){
                map.put(persoana,new Departament(numeDepartamentNou));
                System.out.println("departamentul pentru persoana cu  numele " + nume + " a fost schimbat");
            }else{
                System.out.println("persoana cu numele "+nume + "este deja in departamentul " +numeDepartamentNou);
            }
        }else{
            System.out.println("persoana cu numele " + nume + " si id-ul "+id + " nu se afla in sistem ");
        }






    }
}
