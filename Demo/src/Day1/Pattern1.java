package Day1;

public class Pattern1 {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=1;i<=n;i++)   ///line number
		{
			
			for(int k=0;k<n-i;k++) ///print spaces
			{
				System.out.print(" ");
				
				
			}
			for(int k=0;k<i;k++)   ///print *
			{
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
	}

}
