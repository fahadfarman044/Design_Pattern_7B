/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabMid;

/**
 *
 * @author DELL
 */
public class MessManagementApp {
    public static void main(String[] args) {
      
        MealComponent meal = new Dish("Pasta", 10.0);

        
        meal = new Starter(meal);
        meal = new MainDish(meal);
        meal = new Burger(meal);

        System.out.println("Meal Description: " + meal.getDescription());
        System.out.println("Total Price: $" + meal.getPrice());
    }
}
