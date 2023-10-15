/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DELL
 */
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
   private double price;

    public ShapeDecorator(Shape decoratedShape, double price){
      this.decoratedShape = decoratedShape;
      this.price = price;
    }    

    public void draw(){
        double totalCost = computeCost();
        decoratedShape.draw();
        System.out.println("Decoration Cost: " + totalCost);
    }	
    
    @Override
    public double getPrice() {
        return price;
    }

    private double computeCost() {
        return getPrice() + decoratedShape.getPrice();
    }
}
