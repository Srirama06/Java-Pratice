package oops;


class A
{
	int a=20;
}

class B extends A
{
	int b=30;
}

public class multipleInheritance extends B  {
	
	int c=40;
	//int b=30;
	//int a=20;
	public static void main(String[] args) {
		
		multipleInheritance multi=new multipleInheritance();
		
		System.out.println(multi.a);
		System.out.println(multi.b);
		System.out.println(multi.c);
	}

}
