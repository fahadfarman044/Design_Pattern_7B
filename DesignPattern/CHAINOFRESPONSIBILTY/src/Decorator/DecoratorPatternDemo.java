/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author DELL
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
      Shape circle = new Circle(5.0);

      Shape redCircle = new RedShapeDecorator(new Circle(5.0), 20.0);

      Shape redRectangle = new RedShapeDecorator(new Rectangle(10.0), 8.0);
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();

    }
}
