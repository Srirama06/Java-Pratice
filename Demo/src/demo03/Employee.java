package demo03;

public class Employee {
	
	static String employeeid="2345670";
	
	
	
	public void display()
	{
		for(int k=0;k<5;k++)
		{
			System.out.println("----------------"+k);
		}
		System.out.println("----------------"+employeeid);
	}
	


	public static void main(String[] args) {
		
		
		String employeeid="234567"; 
		//inside the static method we should use static variable
		
		System.out.println(employeeid);
		
		Employee emp=new Employee();
		emp.display();

	}
	

}
