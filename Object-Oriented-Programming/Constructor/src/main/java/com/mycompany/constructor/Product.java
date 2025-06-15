/*
 * Rules for creating Java constructor:
    1. Constructor name must be the same as its class name
    2. A Constructor must have no explicit return type
    3. A Java Constructor cannot be abstract, static, final, and synchronized
 */
package com.mycompany.constructor;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
    
    
    // 1- Default Constructor => a constructor that is automatically created by the Java compiler if it is not explicitly defined.
    //public Product() {}
    
    // 2- No-Arg Constructor => a constructor that does not accept any arguments.
    public Product() {
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }
    
    // 3- Parameterized Constructor => constructor that accepts arguments.
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        
        //System.out.println("constructor: 5");
    }
    public Product(String name, String description, float price, int quantity, float discount, String color) {
        //Constructor Chaining: => When A constructor calls another constructor of same class then this is called constructor chaining.
        this (name, description, price, quantity, discount);
        this.color = color;
        
        //System.out.println("constructor: 6");
    }
    public Product(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    //4- Copy Constructor => A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.
    public Product(Product obj) {
        this (obj.name, obj.description, obj.price, obj.quantity, obj.discount, obj.color);
    }

    
    // Getters and Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Description = " + description);
        System.out.println("price = " + price);
        System.out.println("quantity = " + quantity);
        System.out.println("discount = " + discount);
    }
}
