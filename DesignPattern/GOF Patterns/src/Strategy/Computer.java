/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author fa20-bse-044
 */
abstract class Computer implements Strategy{
    Computer nextStrategy = null;
    public abstract int ComputeInRange(int num1, int num2);
}
