package com.example;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Basket{
    User user;
    float totalPrice;
    int orderId;
    LinkedList addedProducts = new LinkedList();
    static int basketId;
    
    //----------Methods------------------//
    void add(Object o, int quantity, float price){
        int i = 0;
        while(i < quantity){
            addedProducts.add(o);
            totalPrice += price;
            i++;
        }
        System.out.println(quantity + " of "+ o +" Price: "+ price +" was added. \nYour total: "+ totalPrice);
    }
    void delete(Object o, int quantity, float price){
        int deletedNum = 0;
        for (int i = 0; i< addedProducts.size(); i++){
            Object obj = addedProducts.get(i);
            if(deletedNum == quantity) break;
            if(obj == o){
                addedProducts.remove(i);
                totalPrice -= price;
                deletedNum++;
            } 
        }
        System.out.println(quantity +" of "+ o +" was deleted. \nYour total: "+ totalPrice);
    }
    void listBasket(){
        if(addedProducts.size()==0){
            System.out.println("\nYour Basket is empty.");
        }
        else{
            int j=1;
            Object o1 = addedProducts.get(0);
            for (int i = 1; i< addedProducts.size(); i++){
                Object o2 = addedProducts.get(i);
                if(o1==o2){
                    j++;
                    o1 = o2;
                }
                else{
                    System.out.println(o1 +": "+ j);
                    o1=o2;
                    j = 1;
                }
            }
            System.out.println(o1 +": "+ j);
        }            
        System.out.println("\nTotal: "+ totalPrice);
    }
    void freeBasket(){
        Iterator itr = addedProducts.iterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        totalPrice = 0f;
    }
    void Acceptorder(){
        if(addedProducts.size()==0)
            System.out.println("\nYour Basket is empty.");
        else{
            System.out.println("To accept the order please confirm your password: ");
            Scanner input = new Scanner(System.in);
            int typedPassword = input.nextInt();
            if(typedPassword != user.getPassword()){
                System.out.println("\nYour password is incorrect, try again later.");
            }
            else{
                orderId += 10;
                user.previousOrders = addedProducts;
                System.out.println("\nYour order was accepted on "+ user.name +"\nDelivering adress: "+ user.getAdress() +"\nTotal: "+ totalPrice +"$" +"\nOrder Id:"+ orderId +"\nTankyou for buying from our platform");
                freeBasket();
            }
        }
    }
    //---------—---------------------------//
    
    Basket(User user){
        this.user= user;
        basketId +=100;
        orderId += basketId;
    }
    
}