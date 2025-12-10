package com.example;
public class Cloth implements Platform, Product{
    String name;
    String size;
    String Id;
    Clothes type;
    float tax;
    float price;
    String description;
    private static int n = 10;
    
    public void getTax(int rawprice){
        tax= rawprice * 0.02f;
    }
    public void calculatePrice(int rawprice){
        price = rawprice + tax + platformInterest;
    }
    public void generateId(){
        Id = "clth"+n;
        n++;
    }
    Cloth(String name, String size, Clothes type, int rawprice){
        this.name = name;
        this.size= size;
        this.type= type;
        generateId();
        getTax(rawprice);
        calculatePrice(rawprice);
    }
    void info(){
        System.out.println("\nName: "+ name + "\nType: "+ type +"\nSize: "+ size +"\nPrice: "+ price +"\nTax: "+ tax);
    } 
    public float getPrice(){
        return price;
    }
    public String toString(){
        return name;
    }
}