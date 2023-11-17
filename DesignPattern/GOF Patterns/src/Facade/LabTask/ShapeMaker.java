/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.LabTask;

import AbstractFactory.LabTask.Triangle;
import AbstractFactory.Square;

/**
 *
 * @author fa20-bse-044
 */
class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = (Shape) new Square();
        triangle = (Shape) new Triangle();
    }

    public void draw(String shapes) {
        StringBuilder builder = new StringBuilder();
        for (String shape : shapes.split(",")) {
            switch (shape) {
                case "circle":
                    circle.draw();
                    builder.append("Circle ");
                    break;
                case "rectangle":
                    rectangle.draw();
                    builder.append("Rectangle ");
                    break;
                case "square":
                    square.draw();
                    builder.append("Square ");
                    break;
                case "triangle":
                    triangle.draw();
                    builder.append("Triangle ");
                    break;
                default:
                    System.out.println("Unknown shape: " + shape);
            }
        }
        System.out.println("Drawn shapes: " + builder.toString());
    }

    void draw(String circlerectanglesquaretriangle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
