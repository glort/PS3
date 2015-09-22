package MainPackage;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account myAccount = new Account(1122, 20000);
		
		myAccount.setAnnualInterestRate(0.045);
		
		try{
		myAccount.withdraw(2500);
		}
		catch (InsufficientFundsException e){
			System.out.println("Sorry.  You are short " + e.getAmount() + " dollars.");
		}
		
		myAccount.deposit(3000);
		
		System.out.println("Balance: " + myAccount.getBalance());
		
		System.out.println("Monthly interest rate: " + myAccount.getMonthlyInterestRate());
		
		Date myDate = myAccount.getDateCreated();
		
		System.out.println(myDate);
		
		try{
			myAccount.withdraw(11111111);
			}
			catch (InsufficientFundsException e){
				System.out.println("Sorry.  You are short " + e.getAmount() + " dollars.");
			}
		

	}

}
