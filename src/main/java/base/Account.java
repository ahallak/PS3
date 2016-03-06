package base;

import java.util.Date;


/*
 * Account Class
 * @author: Amjed Hallak
 */
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//No-arg account constructor
	public Account(){
	}
	
	//Account constructor that takes an ID, a starting balance, and the current date
	public Account(int id, double balance,Date dateCreated){
		this.id = id;
		balance *= 100;
		balance = Math.round(balance);
		balance /= 100;
		this.dateCreated = dateCreated;
		this.balance = balance;
		
	}
	
	/*
	 * Below are all public getter and setter methods
	 */
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getInterestRate(){
		return annualInterestRate;
	}
	public void setInterestRate(double rate){
		this.annualInterestRate = rate;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	public Date getDate(){
		return dateCreated;
	}
	
	/*
	 * Withdraw method: Inputs the withdraw amount, and returns a new rounded balance to two decimal places.
	 */
	public void withdraw(double withdrawAmount)throws InsufficientFundsException{
		if(withdrawAmount <= balance){
	         balance -= withdrawAmount;
	      }
	      else
	      {
	         double needs = withdrawAmount - balance;
	         throw new InsufficientFundsException(needs);
	      }
		balance *= 100;
		balance = Math.round(balance);
		balance /= 100;
		this.balance = balance;
	}
	
	/*
	 * Deposit method: Inputs the deposit amount, and returns a new rounded balance to two decimal places.
	 */
	public void deposit(double depositAmount){
		double newAmount = balance + depositAmount;
		newAmount *= 100;
		newAmount = Math.round(newAmount);
		newAmount /= 100;
		this.balance = newAmount;
	}

}
