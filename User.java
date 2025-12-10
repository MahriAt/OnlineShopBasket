package com.example;
import java.util.LinkedList;
public class User implements Platform {
    String name;
    private int id;
    private String adress;
    private int password;
    LinkedList previousOrders = new LinkedList();
    
    public void generateId(){
        id++;
    }
    User(String name, String adress, int password){
        generateId();
        this.name= name;
        this.adress= adress;
        this.password= password;
    }
    String getAdress(){
        return adress;
    }
    int getPassword(){
        return password;
    }
}