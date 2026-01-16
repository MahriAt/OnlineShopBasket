
package com.example;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //----------Initializing-------//
        User u1 = new User("Ben", "USA", 123);
        User u2 = new User("Alice", "Turkiye", 345);
        
        Product c1 = new Cloth(" Black Dress","M", Clothes.DRESS, 250);
        Product c2 = new Cloth("H&M jeans, Blue", "S", Clothes.JEANS, 389);
        Product c3 = new Cloth("DeFacto T-Shirt", "XL", Clothes.TSHIRT, 500);
        Product c4 = new Cloth("Winter Coat", "L", Clothes.COAT, 1200);
        Product c5 = new Cloth("Sport Shorts","M",Clothes.SHORTS,500);
        
        Product oth1 = new Other("Iphone 7", "Brand new phone with screen protector", 500);
        Product oth2 = new Other("Umprella", "Black, red an purpule umbrella", 60);
        Product oth3 = new Other("Laptop Lenovo", "RAM:32 SSD: 2TB CPU: i5", 13000);
        Product oth4 = new Other("Pencils", "Colorful pencils", 45);
        Product oth5 = new Other("JBL Headphones", "Bluetooth Headphones", 1600);
        
        Basket b1 = new Basket(u1);
        Basket b2 = new Basket(u2);
        //--------------------------------//
        
        //------------User1--------------//
        System.out.println("\nWelcome "+u1.name);
        b1.add(c1, 2, c1.getPrice());
        b1.add(c2, 1, c2.getPrice());
        b1.add(c4, 4, c4.getPrice());
        b1.add(c5, 10, c5.getPrice());
        b1.add(oth1, 2, oth1.getPrice());
        b1.add(oth4, 3, oth4.getPrice());
        b1.listBasket();
        b1.delete(c5, 5, c5.getPrice());
        b1.delete(c2, 1, c2.getPrice());
        b1.listBasket();
        b1.Acceptorder();
        b1.listBasket();
        
        //------------User2--------------//
        System.out.println("\nWelcome "+u2.name);
        b2.add(oth5, 7, oth5.getPrice());
        b2.add(c5, 3, c5.getPrice());
        b2.add(oth3, 1, oth3.getPrice());
        b2.add(c4, 6, c4.getPrice());
        b2.listBasket();
        b2.freeBasket();
        b2.add(oth5, 9, oth5.getPrice());
        b2.add(c1, 2, c5.getPrice());
        b2.delete(oth5, 5, oth5.getPrice());
        b2.listBasket();
        b2.Acceptorder();
        b2.listBasket(); 
    }
}