package com.itFactory.problema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> lista=new ArrayList<>();

        Random random=new Random();
        int n;

        for(int i=0;i<10;i++){
            n= random.nextInt(0,2);
            if(n==0){

                lista.add(new Printer("buna"));
            }else{
                int nr1= random.nextInt(0,100);
                int nr2= random.nextInt(0,100);
               // System.out.println(nr1 + " " +nr2);
                lista.add(new Insumare(nr1,nr2));

            }

        }
        for(Task task:lista){
            task.executa();
        }

    }


}
