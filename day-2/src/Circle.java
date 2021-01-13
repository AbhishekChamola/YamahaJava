
public class Circle {

	private double r;
	private String color;
	Circle()
	{
		r=1.0;
		color="red";
	}

	Circle(double r)
	{
		this.r=r;
		color="red";
	}
	
	double getRadius()
	{
		return r;
	}
	
	double getArea()
	{
		return (0.5*3.14*r*r);
	}
	
	public static void main(String[] a)
	{
		Circle c1=new Circle();
		double r1=c1.getRadius();
		System.out.println("Radius: "+r1);
		double area=c1.getArea();
		System.out.println("Area: "+area);
		
		Circle c2=new Circle(5);
		r1=c2.getRadius();
		System.out.println("Radius: "+r1);
		area=c2.getArea();
		System.out.println("Area: "+area);
	}
}
