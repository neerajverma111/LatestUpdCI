package neeraj;
interface Polygon{
	void getArea(int lenght, int breadth);
}
class Rectangle implements Polygon{
	public void getArea(int length, int breadth) {
	  System.out.println("the AREA of the rectangle is " + (length * breadth));
	                                                                
	}
	
}

public class Interface {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.getArea(5,6);
	}

}
