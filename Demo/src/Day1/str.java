package Day1;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="abc";
		
		System.out.println(s);
		
		String s1="abc";
		System.out.println(s1);
		
		if(s==s1)  ///address 
			System.out.println(true);
		else
			System.out.println(false);
		
		
		
		
		
		
		String str1=new String("basent");
		
		System.out.println(str1);
		
		String str2=new String("basent");
		
		System.out.println(str2);
		
		if(str1==(str2)) ///address
			System.out.println(true);
		else
			System.out.println(false);
		
		
		String abc="    basent technology    ";
		
		System.out.println(abc.length());
		
		
		System.out.println(abc.charAt(1));
		
		
		/*
		 * for(int t=0;t<abc.length();t++) { System.out.println(abc.charAt(t)); }
		 */
		System.out.println(abc);
		System.out.println(abc.trim());
		
		String str="bangalore";
		
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2,6));
		
		System.out.println(str.concat(abc));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		
		System.out.println(str.equals(abc)); 
		
		System.out.println("abc".compareTo("def")); 
		//system.out.println(str.toLowerCase());
		
		

	   
				
				

	}

}
