package com.example;

public class Other extends Product implements Platform{
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
    
    
    Other(String name, String description, int rawprice){
        super(name, rawprice);
        this.description = description;
        
    }
    
    void info(){
        System.out.println("\nId: "+ id +"\nName: "+ name +"\nDescription: "+ description +"\nPrice: "+ this.getPrice());
    }
}