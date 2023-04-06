package oops;

public class BankAccount {
   static double balance;
   
   public void deposit(double amount) {
	   balance += amount;
	   System.out.println(amount + " Rs. deposit successfully.");
   } 
   public void withdraw(double amount){
	   balance -=amount;
	   System.out.println(amount+" Rs. withdraw successfully.");
   }
   
   class GetBalance{
	   public double getBalance(){
		   return BankAccount.balance;
	   }
   }
}
