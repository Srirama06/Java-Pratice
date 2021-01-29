package oops;


class AAA
{
	int a=50;
}
class BBB extends AAA
{
	public void display()
	{
		System.out.println("I am BBB class");
		System.out.println(a);
	}
}

public class InherichicalInheritance extends AAA {

	public static void main(String[] args) {
		
		AAA aa=new AAA();
		
		System.out.println(aa.a);
		BBB bb=new BBB();
		bb.display();

	}

}
