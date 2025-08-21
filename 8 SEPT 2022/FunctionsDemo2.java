package package1;

public class FunctionsDemo2 {

	public void areaOfCircle() {
		int radius = 3;
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle  : " + area);
	}
	
	public double areaOfTriangle() {
		int base = 2, height = 3;
		double area = 0.5 * base * height;
		return area;
	}
	
	public void areaOfSquare(int side) {
		int result = side * side; 
		System.out.println("Area of Square  : " + result);
	}
	
	public int areaOfRectangle(int length, int breadth) {
		return length * breadth;	
	}
	
	public static void main(String[] args) {
		FunctionsDemo2 fd1 = new FunctionsDemo2();
		fd1.areaOfCircle();
		System.out.println("Area of Triangle : " + fd1.areaOfTriangle());
		fd1.areaOfSquare(3);
		int temp = fd1.areaOfRectangle(3, 5);
		System.out.println("Area of Rectangle : " + temp);
		
		double x = 0;
		x = x + fd1.areaOfTriangle();
	}
}
