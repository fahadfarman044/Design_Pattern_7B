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
public class OperationDiv extends Computer{
    
    public OperationDiv(){}
    
    public OperationDiv(OperationPow nextStrategy){
        this.nextStrategy = nextStrategy;
    }

    OperationDiv(OperationPow operationPow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int doOperation(int num1, int num2) {
        return num1/num2;
    }

  @Override
    public int ComputeInRange(int num1, int num2) {
        if(num1<= 400 &&  num1>=300 && num2<=400 && num2>=300){
            return num1 / num2;
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