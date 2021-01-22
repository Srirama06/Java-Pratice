package Day1;

public class Reverse_the_number {
	
	
	public static void main(String[] args) {
		
		
		int number=435;  ////674
		
		int reverse=0;
	
		   
		
    while(number >0)
    {
    	int n=number%10;    //// 5   ////3
    	reverse=reverse*10+n;   /// 5   ----534
    	number=number/10;/// ///43
    	
    	
    }
    
    System.out.println(reverse);
		
	}

}
