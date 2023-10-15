/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.ChainofResponsibility;

/**
 *
 * @author DELL
 */
public class Loan {
	private String number;
	private double amount;
	private String purpose;
	public Loan(String number, double amount, String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}
	public String getNumber() {
		return number;
	}
	public double getAmount() {
		return amount;
	}
	public String getPurpose() {
		return purpose;
	}
	@Override
	public String toString() {
		return "Loan [number=" + number + ", amount=" + amount + ", purpose=" + purpose + "]";
	}
	
}