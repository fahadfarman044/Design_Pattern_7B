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

public class Context {
    private Computer strategy;

    public Context(Computer strategy){
        this.strategy = strategy;
    }

    Context(OperationAdd operationAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Context(OperationSubstract operationSubstract) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Context(OperationMultiply operationMultiply) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Context(OperationDiv operationDiv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
   
    public int executeInRange(int num1, int num2){
        Computer ChainOfResponsibity = new OperationAdd(new OperationSubstract(new OperationMultiply(new OperationDiv(new OperationPow()))));
        return ChainOfResponsibity.ComputeInRange(num1, num2);
    }
    
}