package demo03;

public class Area {
	
	int radius;
	int lenght;
	int breadth;
	

	public Area(int radius) {

        this.radius=radius;
        this.lenght=radius;
	}
	
	public Area(int lenght,int breadth) {

       this.lenght=lenght;
       this.breadth=breadth;
	}
	public int circleArea()
	{
		return (22/7*radius*radius);
	}
	
	public int rectangleArea()
	{
		return (lenght*breadth);
	}
	public int SquareArea()
	{
		return (lenght*lenght);
	}
	
	

}
