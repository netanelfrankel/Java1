package com.xpanxion.assignments.student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}
    static Scanner console = new Scanner(System.in);
    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name");
        String name = console.next();
        System.out.println(name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Enter a String");
        String input = console.next();
        int count = 0;

        for (char letter : input.toCharArray()){
            if(Character.isUpperCase(letter))count++;
        }
        System.out.println(count);
    }

    public void ex3() {
        System.out.println("Enter a sentence");
        String sentence = console.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence," ");
        boolean cap = true;
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            if (cap){
            word = word.replace(word.charAt(0),Character.toUpperCase(word.charAt(0)));
            }
            cap = !cap;
            System.out.println(word);
        }

    }

    public void ex4() {
        System.out.println("Enter a word");
        String word = console.next();
        word = word.toLowerCase();
        String output ="palindrome";
        for (int i = 0; i< word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                output = "not a palindrome";
                break;
            }

        }
        System.out.println(output);
    }

    public void ex5() {
        int constants= 0;
        int vowels = 0;
        String input="";
        while(!input.equals("quit")){
            System.out.println("Enter a string");
             input = console.nextLine();
            for(char letter: input.toCharArray()){
                if(letter=='a'||letter=='e'||letter=='o'||letter=='u'||letter=='y'){
                    vowels++;
                }
                else constants++;
            }
            System.out.println("constants "+constants);
            System.out.println("vowels "+vowels);
            constants =0;
            vowels =0;
        }

    }

    public void ex6() {
        System.out.println("Enter an int");
        int num1 = console.nextInt();
        System.out.println("Enter a second int");
        int num2 = console.nextInt();
        System.out.println("Result "+ (num1+num2));
    }

    public void ex7() {
        System.out.println("Enter an int");
        int num1 = console.nextInt();
        System.out.println("Enter a second int");
        int num2 = console.nextInt();
        System.out.println("Enter operation (add, sub, mul, div): ");
        String operation = console.next();
        switch (operation) {
            case "add" -> System.out.println(num1 + num2);
            case "sub" -> System.out.println(num1 -num2);
            case "mul" -> System.out.println(num1 *num2);
            case "div" -> System.out.println(num1 / num2);
        }
    }

    public void ex8() {
        boolean running = true;
        int total =0 ;
        String input;
        System.out.println("Enter price per square feet: ");
        double price  =console.nextDouble();
        console.nextLine();
        while(running){
            System.out.println("Enter room dimensions (width x height): ");
            input = console.nextLine();
            if(input.equals("done")){
                break;
            }
            String[] dimensions = input.split("x");
            int length = Integer.parseInt(dimensions[0].trim());
            int width = Integer.parseInt(dimensions[1].trim());
            total += length * width;

        }
        System.out.println(total*price);
    }

    public void ex9() {
        System.out.println("Guess a number 1-5");
        int answer = (int) Math.floor(Math.random() *5);
        while(true){
        int guess = console.nextInt();
        if (guess< answer){
            System.out.println("too low");
        } else if (guess>answer) {
            System.out.println("too high");
        }
        else{
            System.out.println("Thats right");
            break;
        }
        }

    }

    public void ex10() {
        System.out.println("Enter a String");
        StringTokenizer words = new StringTokenizer(console.nextLine());
        while (words.hasMoreTokens()){
            char[] word = words.nextToken().toCharArray();
            for(int i = 0, j =0; i< word.length;i++){
                while(j<i){
                    System.out.print(" ");
                    j++;
                }
                j=0;
                System.out.println(word[i]);
            }
        }
    }

    //
    // Private helper methods
    //
}
