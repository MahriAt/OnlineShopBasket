package com.example;

public abstract class Product implements Comparable<Product>{
    final static int platformInterest = 20;
    String name;
    String id;
    float tax;
    private float price;
    
    Product(String name, int rawprice){
        this.name = name;
        generateId();
        getTax(rawprice);
        calculatePrice(rawprice);
    }
    
    abstract void getTax(int n);
    abstract void generateId();
    public void calculatePrice(int rawprice){
        price = tax + platformInterest + rawprice;
    }
    public float getPrice(){
        return price;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Object o){
        Product p = (Product) o;
        return price == p.getPrice();
    }
    public int compareTo(Product p){
        return (int)(this.getPrice()-p.getPrice());
    }
}