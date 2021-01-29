package oops;


class ParentsOOPS
{
int b=10;

public void display()
{
	System.out.println("I am a parent class");
}
}


public class SingleHeritance extends ParentsOOPS{
	
	public void display()
	{
		super.display();
		System.out.println("I am a child class");
	}

	public static void main(String[] args) {
		
		SingleHeritance single=new SingleHeritance();
		
		System.out.println(single.b);
		
		single.display();

	}

}
