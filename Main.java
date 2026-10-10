abstract class Shape
{
	String color;
	Shape(String color)
	{
		this.color=color;
	}
	abstract void draw();
	abstract double area();
	String getColor()
	{
		return color;
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius,String color)
	{
		super(color);
		this.radius=radius;
	}
	void draw()
	{
		System.out.println("Drawing a Circle with radius:"+radius);
	}
	double area()
	{
		return Math.PI*radius*radius;
	}
}
class Square extends Shape
{
	double side;
	Square(String color,double side)
	{
		super(color);
		this.side=side;
	}
	void draw()
	{
		System.out.println("Drawing a Square with side:"+side);
	}
	double area()
	{
		return side*side;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Circle c=new Circle(3.5,"green");
		c.draw();
		System.out.println("Area of Circle:"+c.area());
		System.out.println("Colour of Circle:"+c.getColor());
		Square s=new Square("Red",4);
		s.draw();
		System.out.println("Area of Square:"+s.area());
		System.out.println("Colour of Square:"+s.getColor());
	}
}