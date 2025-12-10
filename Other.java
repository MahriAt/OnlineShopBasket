package com.example;

public class Other implements Platform,Product{
    String name;
    String id;
    String description;
    float tax;
    float price;
    static int index;
    
    public void generateId(){
        id = "oth" + index;
        index++;
    }
    public void getTax(int rawprice){
        tax = rawprice * 0.15f;
    }
    public void calculatePrice(int rawprice){
        price = tax + platformInterest + rawprice;
    }
    
    Other(String name, String description, int rawprice){
        this.name = name;
        this.description = description;
        generateId();
        getTax(rawprice);
        calculatePrice(rawprice);
    }
    
    void info(){
        System.out.println("\nId: "+ id +"\nName: "+ name +"\nDescription: "+ description +"\nPrice: "+ price);
    }
    public float getPrice(){
        return price;
    }
    public String toString(){
        return name;
    }
}