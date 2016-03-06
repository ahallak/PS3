package base;

import java.util.Calendar;
import java.util.Date;
/*
 * Test class
 * @author Amjed Hallak
 */
public class Test {
	
	/*
	 * This method gets the current date
	 */
	public static Date getCurrentDate(){
		Calendar currentDandT = Calendar.getInstance();
		Date currentDate = currentDandT.getTime();
		return currentDate;
	}
	
	public static void main(String[] args) throws InsufficientFundsException{
		
		Account testAcct;
		testAcct = new Account(1122, 20000.0, Test.getCurrentDate());
		testAcct.setInterestRate(4.5);
		testAcct.withdraw(2500);
		testAcct.deposit(3000);
		System.out.println("Balance: " + testAcct.getBalance() + "\nDate created: " + testAcct.getDate());
	}

}
