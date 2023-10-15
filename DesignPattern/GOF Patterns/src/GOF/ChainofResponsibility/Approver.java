/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GOF.ChainofResponsibility;

/**
 *
 * @author DELL
 */
public interface Approver {
	void setNext(Approver next);
	void process(Loan loan);
}