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
class ConcreteCreator implements Creator {
    @Override
    public Product create(ProductId id) {
        if (ProductId.MINE == id) return new ConcreteProductMINE();
        if (ProductId.YOURS == id) return new ConcreteProductYOURS();
        // repeat for remaining products...

        return null;
    }
}