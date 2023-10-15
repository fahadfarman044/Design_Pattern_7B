/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DELL
 */
public class Circle implements Shape {
    private double price;
    
    public Circle(double price){
        this.price = price;
    }

    @Override
    public void draw() {
        double totalCost = computeCost();
        System.out.println("Shape: Circle, Cost: " + totalCost);
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    private double computeCost() {
        return getPrice();
    }
   
}