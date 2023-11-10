/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.Labtask;

/**
 *
 * @author DELL
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1"); 
        Shape clonedShape4 = ShapeCache.getShape("4");
         Shape clonedShape5 = ShapeCache.getShape("5"); 
        System.out.println("Shape 1 Type: " + clonedShape1.getType());
        System.out.println("Shape 4 Type: " + clonedShape4.getType());
        System.out.println("Shape 5 Type: " + clonedShape5.getType());
    }
}