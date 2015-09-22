package MainPackage;


import java.util.Calendar;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account(){
		
	}
	
	Account(int id, double initialBalance){
		this.id = id;
		this.balance = initialBalance;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double interestRate){
		this.annualInterestRate = interestRate;
	}
	
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (this.getAnnualInterestRate())/12;
	}
	
	public void withdraw(double amount)throws InsufficientFundsException{
		double balance = this.getBalance();
		if (balance >= amount){
			balance -= amount;
			this.setBalance(balance);
		}
		else{
			double need = amount - balance;
			throw new InsufficientFundsException(need);
		}
	}
	
	public void deposit(double amount){
		double balance = this.getBalance();
		balance += amount;
		this.setBalance(balance);
	}

}
