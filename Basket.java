package com.example;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Scanner;

public class Basket{
    User user;
    float totalPrice;
    int orderId;
    LinkedList<Product> addedProducts = new LinkedList<>();
    static int basketId;
    
    //----------Methods------------------//
    void add(Product p, int quantity, float price){
        int i = 0;
        while(i < quantity){
            addedProducts.add(p);
            totalPrice += price;
            i++;
        }
        System.out.println(quantity + " of "+ p +" Price: "+ price +" was added. \nYour total: "+ totalPrice);
        Collections.sort(addedProducts);
    }
    void delete(Product o, int quantity, float price){
        int deletedNum = 0;
        for (int i = 0; i< addedProducts.size(); i++){
            Product product = addedProducts.get(i);
            if(deletedNum == quantity) break;
            if(product.equals(o)){
                addedProducts.remove(i);
                totalPrice -= price;
                deletedNum++;
            } 
        }
        System.out.println(quantity +" of "+ o +" was deleted. \nYour total: "+ totalPrice);
    }
    void listBasket(){
        ListIterator itr = addedProducts.listIterator();
        if(addedProducts.size()==0){
            System.out.println("\nYour Basket is empty.");
        }
        else{
            int j=0;
            Product o1 = addedProducts.get(0);
            for(Product p : addedProducts){
                if(o1.equals(p)){
                    j++;
                }
                else{
                    System.out.println(o1+ ":  " + j);
                    j= 1;
                    o1 = p;
                }
            }
            System.out.println(o1+ ":  " + j);
        System.out.println("\nTotal: "+ totalPrice);
    }}
    void freeBasket(){
        ListIterator itr = addedProducts.listIterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        totalPrice = 0f;
        System.out.println("\nYour Basket is empty.");
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