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
public class Main {
    public static void main(String[] args) {
      
        Creator creator = new ConcreteCreator();
        Product product = creator.create(ProductId.MINE);
        product.print();

        product = creator.create(ProductId.YOURS);
        product.print();
    }
}