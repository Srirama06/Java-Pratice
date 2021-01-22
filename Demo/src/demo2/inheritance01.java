package demo2;



class Parent
{
	int a=10;
	void display(int a){System.out.println("****************"+a);};
	void m2(){System.out.println("M2 of B");};
	
	
}
class child01 extends Parent
{
	
	void m3(){System.out.println("M3 of C");};
}
class child02 extends child01
{
	
	void m4(){System.out.println("M4 of C456456456454weewrw");};
	void m5(){System.out.println("M5 of C");};
	
}
public class inheritance01 extends child02 {
	
	
	void m6(){System.out.println("M6 Inheritance");};


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		inheritance01 ino1=new inheritance01();
		ino1.display(20);
		
		System.out.println(ino1.a);
		
	}

}
