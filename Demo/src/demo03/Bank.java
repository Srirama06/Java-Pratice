package demo03;

import Day1.IntrestRate;

public class Bank extends IntrestRate {
	public void sbi()
	{
		
	}
	public void cnanrabank(int principle,int time)
	{
		
		int amount=(principle*time*intrestrate)/100;
		System.out.println("loan amount "+amount);
	}
	public void pnb()
	{
		
	}

	public Bank(int intr)
	{
		
		super(intr);  //parent class constructor
		
		
	}

	public static void main(String[] args) {
		Bank bk=new Bank(5);
         bk.cnanrabank(3000,5);
	}

}
