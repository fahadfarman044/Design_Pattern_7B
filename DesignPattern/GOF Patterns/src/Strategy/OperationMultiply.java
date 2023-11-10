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
public class OperationMultiply extends Computer{
    
    public OperationMultiply(){}
    
    public OperationMultiply(OperationDiv nextStrategy){
       //this.nextStrategy = nextStrategy;
    }

    OperationMultiply(OperationDiv operationDiv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int doOperation(int num1, int num2) {
       return num1 * num2;
    }

  @Override
    public int ComputeInRange(int num1, int num2) {
        if(num1<= 300 &&  num1>=200 && num2<=300 && num2>=200){
            return num1 * num2;
        }
        if(nextStrategy==null){
            System.out.println("Support not available...");
        }
        else{
            nextStrategy.ComputeInRange(num1, num2);
        }
    
        return 0;
        
    }
}