package demo03;

public class childArea extends Area {

	public childArea(int radius) {
		super(radius);
	}
	
public childArea(int lenght,int breadth) {
	super(lenght,breadth);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childArea area=new childArea(10);
		
		int circlearea=area.circleArea();
		System.out.println(circlearea);
		int squareArea=area.SquareArea();
		System.out.println(squareArea);
		childArea area1=new childArea(10,10);
		int rectangeArea=area1.rectangleArea();
		
		System.out.println(rectangeArea);
		
	}

}
