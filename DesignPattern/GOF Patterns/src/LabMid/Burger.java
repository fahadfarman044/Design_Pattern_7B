/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabMid;

/**
 *
 * @author DELL
 */
abstract class Burger extends MealDecorator {
    public Burger(MealComponent meal) {
        super(meal);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Burger";
    }

    public double getPrice() {
        return super.getPrice() + 3.0; // Additional cost for a dessert
    }
}