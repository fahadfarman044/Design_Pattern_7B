/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabMid;

/**
 *
 * @author DELL
 */
abstract class Starter extends MealDecorator {
    public Starter(MealComponent meal) {
        super(meal);
    }

    Starter(MealComponent meal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDescription() {
        return super.getDescription() + ", Starter";
    }

    public double getPrice() {
        return super.getPrice() + 2.0; // Additional cost for a starter
    }
}

