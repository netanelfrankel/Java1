package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    static Scanner console = new Scanner(System.in);
    private ArrayList<String> history;
    public Calculator(){
            this.history = new ArrayList<>();
    }
    public void Run() {

        boolean running =true;
        while (running){
        System.out.println("Enter an int");
        int num1 = console.nextInt();
        System.out.println("Enter a second int");
        int num2 = console.nextInt();
        System.out.println("Enter operation (add, sub, mul, div, done): ");
        String operation = console.next();

        switch (operation) {
            case "add" -> {
                System.out.println(num1 + num2);
                history.add(num1 + " + "+ num2 +" = "+(num1+num2));
            }
            case "sub" -> {
                System.out.println(num1 - num2);
                history.add(num1 + " - "+ num2 +" = "+(num1-num2));
            }
            case "mul" -> {
                System.out.println(num1 * num2);
                history.add(num1 + " * "+ num2 +" = "+(num1*num2));
            }
            case "div" -> {
                System.out.println(num1 / num2);
                history.add(num1 + " / "+ num2 +" = "+(num1/num2));
            }
            case "done" ->{
                running = false;
                for (String cal: history){
                System.out.println(cal);}
            }
        }}
    }
}


