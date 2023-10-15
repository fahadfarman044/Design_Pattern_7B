/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author DELL
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