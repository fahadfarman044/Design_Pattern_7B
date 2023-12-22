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
interface Creator {
    Product create(ProductId id);
}

enum ProductId {MINE, YOURS}
