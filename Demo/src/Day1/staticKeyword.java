package Day1;

public class staticKeyword {
	
	static int a=10;   //static
	
	int b=20;   /// non static
	
	public void display()   //non static
	{
		System.out.println(a);
		
		System.out.println(b);
		
	}

	public static void main(String[] args) {   //static
		
		System.out.println(a);
		
		//System.out.println(b);
		
	}

}
