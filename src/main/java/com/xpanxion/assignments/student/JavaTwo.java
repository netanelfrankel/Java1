package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {
    public void ex1(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("netanel","frankel"));
        people.add(new Person("Jake", "StateFarm"));
        people.add(new Person("yo", "mama"));

        for (Person p: people){
            System.out.println(p);
        }
    }
    public void ex2(){
        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(1,new Person("Peter", "Jones"));
        personMap.put(2,new Person("John" ,"Smith"));
        personMap.put(3,new Person("Mary", "Jane"));
        System.out.println(personMap.get(1));
        System.out.println(personMap.get(2));
        System.out.println(personMap.get(3));

    }
    public void ex3(){

        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex4(){
        ex3();
    }
    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    public void ex6(){
        Calculator example = new Calculator();
        example.Run();
    }
    public void ex7(){

        var personList = Arrays.asList(
                new Person("Charlie", "Jones"),
                new Person("Zoey", "Smith"),
                new Person("Adam", "Anderson")
        );
        var filteredList = personList.stream().peek(p-> p.setLastName("xxxx")).toList();

// TODO: Your code here

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }
    public void ex8(){
        var personList = Arrays.asList(
                new Person("Charlie", "Jones"),
                new Person("Zoey", "Smith"),
                new Person("Adam", "Anderson")
        );
        personList = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

// TODO: Your code here

        for (Person p : personList) {
            System.out.println(p);
        }
    }
    public void ex9(){
        var personList = Arrays.asList(
                new Person("Charlie", "Jones"),
                new Person("Zoey", "Smith"),
                new Person("Adam", "Anderson")
        );
        personList = personList.stream()
                .filter(p -> p.getFirstName().equals("Smith"))
                .collect(Collectors.toList());

// TODO: Your code here

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex10(){
        Queue<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Alice"));
        cats.add(new Cat("Bob"));
        cats.add(new Cat("Charlie"));
        cats.add(new Cat("Dan"));
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }



}
