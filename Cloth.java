package com.example;
public class Cloth extends Product implements Platform{
    String size;
    Clothes type;
    private static int n = 10;
    
    public void getTax(int rawprice){
        tax= rawprice * 0.02f;
    }
    public void generateId(){
        id = "clth"+n;
        n++;
    }
    Cloth(String name, String size, Clothes type, int rawprice){
        super(name, rawprice);
        this.size= size;
        this.type= type;
    }
    void info(){
        System.out.println("\nName: "+ name + "\nType: "+ type +"\nSize: "+ size +"\nPrice: "+ this.getPrice() +"\nTax: "+ tax);
    }
}