/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabMid;

/**
 *
 * @author DELL
 */
abstract class MainDish extends MealDecorator {
    public MainDish(MealComponent meal) {
        super(meal);
    }

    public String getDescription() {
        return super.getDescription() + ", Main Dish";
    }

    public double getPrice() {
        return super.getPrice() + 5.0; // Additional cost for a main dish
    }
}
