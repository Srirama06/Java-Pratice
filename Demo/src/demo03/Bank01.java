package demo03;

public class Bank01 {
	

	
	  int initialAmount=5000;
	
	
	
	public   void deposit(int  amount)
	{
		initialAmount=initialAmount+amount;
		System.out.println(initialAmount);
	}
	public void withdraw(int  Amount)
	{
		
		initialAmount=initialAmount-Amount;
		System.out.println(initialAmount);
	}
     public void getBalalnce()
     {
    	 System.out.println(initialAmount);
     }

	public static void main(String[] args) {
	
		Bank01 bank=new Bank01();
		bank.deposit(500);
		bank.withdraw(100);
		bank.getBalalnce();
		bank.deposit(200);
		bank.getBalalnce();
		bank.withdraw(3250);
	
		
		 //System.out.println(bank.initialAmount);
	}
	



}
