package com.itFactory.problema9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problema9 {
    public static void main(String[] args) {

        Queue<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(5);
        linkedlist.add(9);
        linkedlist.add(20);
        linkedlist.add(17);
        linkedlist.add(50);
        linkedlist.add(15);
        linkedlist.add(21);
        linkedlist.add(58);
        linkedlist.add(70);
        linkedlist.add(70);
        linkedlist.add(70);
        linkedlist.add(70);

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        //stack.push(3);



        while (!stack.isEmpty()) {
            int n = stack.pop();
            System.out.println("am extras element din stiva " + n);
            if(!linkedlist.isEmpty()) {
                for (int i = 0; i < n; i++) {
                    if (!linkedlist.isEmpty()) {
                        System.out.println("am elimina din queue elementul :" + linkedlist.peek());
                        linkedlist.poll();
                    } else {
                        System.out.println("queue is empty");
                        break;
                    }
                }
            }

        }

        if (!linkedlist.isEmpty()) {
            System.out.println("Elemente ramase in Queue:");
            for (int elementRamas : linkedlist) {
                System.out.println(elementRamas);
            }
        }
       if(stack.isEmpty()){
           System.out.println("stack is empty");
       }

    }
}
