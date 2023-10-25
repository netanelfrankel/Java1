package com.xpanxion.assignments.student;

public class Product extends Base {
     int id;
     String name;
     double cost;

     public Product(int id , String name, double cost){
         super(id);
         this.name = name;
         this.cost = cost;
     }
}
