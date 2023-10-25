package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base {
    private ArrayList<Product> items;

    double totalCost;

    public Invoice(int id){
        super(id);
        this.totalCost = 0;
        this.items = new ArrayList<>();
    }
    public void addProduct(Product product){
        items.add(product);
        totalCost+=product.cost;
    }
    public double getTotalCost(){
        return totalCost;
    }
}
