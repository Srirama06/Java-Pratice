package demo2;

public class Oops_3 {
	
	void sum(int a, int b)
	{
		System.out.println("sum ="+(a+b));
	}
	
	void sum2(int a, int b, int c)    ////method overloding
	{
		System.out.println("sum ="+(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oops_3 op=new Oops_3();
		
		op.sum2(2,3,6);
		//op.sum1(2,3);
		
		//op.display();;
		
		//op.print();
	}

}
