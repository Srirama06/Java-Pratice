package oops;

public class demo03 {
	
	
	demo03()
	{
		System.out.println("I am constructor");
	}
	demo03(int b)
	{// this();
		System.out.println("I am parameterized constructor "+b);
	}

	public static void main(String[] args)
	{
		
		demo03 dm=new demo03(10);
	}

}
