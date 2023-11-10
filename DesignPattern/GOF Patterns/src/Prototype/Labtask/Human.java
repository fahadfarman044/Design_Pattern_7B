/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Labtask;

/**
 *
 * @author DELL
 */
class Human extends Shape {
    public Human() {
        type = "Human";
    }

    @Override
    public void draw() {
        System.out.println("Inside Human::draw() method.");
    }
}