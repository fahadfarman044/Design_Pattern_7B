/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod.CsharpExample;

/**
 *
 * @author fa20-bse-044
 */
class ConcreteProductMINE implements Product {
    @Override
    public void print() {
        System.out.println("this=" + this + " print MINE");
    }
}