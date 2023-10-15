/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.ChainofResponsibility;

/**
 *
 * @author DELL
 */
public class Main {

	public static void main(String[] args) {
		BankEmployee clerk = new BankEmployee("Clerk",10000);
		BankEmployee assistantManager = new BankEmployee("Assistant Manager", 25000);
		BankEmployee manager = new BankEmployee("Manager", 100000);
		
		clerk.setNext(assistantManager);
		assistantManager.setNext(manager);
		
		Loan loan = new Loan("5", 30000, "house repair");
		clerk.process(loan);
		
		loan = new Loan("9", 300000, "car damage");
		clerk.process(loan);
		
		

	}

}