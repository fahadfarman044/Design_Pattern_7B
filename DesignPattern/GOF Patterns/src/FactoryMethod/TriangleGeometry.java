/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author fa20-bse-044
 */
public class TriangleGeometry extends Geometery {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}