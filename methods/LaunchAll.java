package methods;

public class LaunchAll 
{
	//NP,NR
	public void areaOfCircle()
	{
		int radius=4;
		double circle=3.14*radius*radius;
		System.out.println("Area of Circle is: " +circle);
	}
	//	NP,R
	public double areaOfTrangle()
	{
		int base=5,height=4;
		double trangle=0.5*base*height;
		return trangle;
	}
	//P,NR
	public void areaOfSquare(float side)
	{
		float square=side*side;
		System.out.println("Area of Square is: " +square);
	}
	//P,R
	public int areaOfRectangle(int length,int breath)
	{
		int rectangle=length*breath;
		return rectangle;
	}
	
	public static void main(String[] args) 
	{
		LaunchAll l=new LaunchAll();
		
		l.areaOfCircle();
		System.out.println("Area of Trangle is: " +l.areaOfTrangle());
		l.areaOfSquare(4.5f);
		int rect=l.areaOfRectangle(5,8);
		System.out.println("Area of Rectangle is: " +rect);

	}

}
