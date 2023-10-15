/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.ChainofResponsibility;

/**
 *
 * @author DELL
 */
public class BankEmployee extends BaseApprover{
	private String title;
	private int approvalLimit;

	public BankEmployee(String title, int approvalLimit) {
		this.title = title;
		this.approvalLimit = approvalLimit;
	}

    @Override
    public void process(Loan loan) {
        if(loan.getAmount()<=approvalLimit){
			System.out.println(loan+" is approved by "+title);
		}
		else if(next!=null){
			System.out.println(title+" forwards the loan "+loan.getNumber()+" for processing");
			next.process(loan);
		}
		else{
			System.out.println(loan+" cannot be processed");
		}
		  }

	
	
}