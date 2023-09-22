/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author FA20-BSE-044
 */
public class Test {
    public static void main(String [] args){
        BillingSystem billingSystem = BillingSystem.getInstance();

        billingSystem.generateInvoice("Customer Talah", 800.0);
        billingSystem.generateInvoice("Customer Faizan", 7199.5);
        billingSystem.generateInvoice("Customer Sunny", 20000.25);

        billingSystem.printInvoices();
    }
}
