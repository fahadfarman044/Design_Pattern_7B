/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.util.ArrayList;

/**
 *
 * @author fa20-bse-044
 */
public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		CricleGeometry cricleGeomerty = new CricleGeometry();
		SquareGeometry squareGeometry = new SquareGeometry();
		
		shapes.add(cricleGeomerty.createShape());
		shapes.add(squareGeometry.createShape());
		shapes.add(squareGeometry.createShape());
                Shape circle = ShapeFactory.createShape("circle");
circle.draw();

Shape square = ShapeFactory.createShape("square");
square.draw();

Shape triangle = ShapeFactory.createShape("triangle");
triangle.draw();
		
		for(Shape s:shapes){
			s.draw();
		}

	}

}