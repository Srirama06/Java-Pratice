package demo03;

import javax.management.remote.SubjectDelegationPermission;

class parent
{
	public parent ()
	{
		//System.out.println("I am parent class");
	}
	
	public void display()
	{
		System.out.println("I am parent display method");
	}
}

public class Pratice extends parent{

	public Pratice() 
	{
		//super();
		///System.out.println("I am child class ");
	}
	
	public void display()
	{
		System.out.println("I am  child display method");
	}
	
	public void abc()
	{
		
		super.display();
		System.out.println("I am  child method abc");
	}

	public static void main(String[] args) {
		
		Pratice pr=new Pratice();
		
		pr.abc();
		
		
	
	}

}
