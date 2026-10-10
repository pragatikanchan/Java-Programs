import java.util.*;
class Numbers
{
	double sum;
	Scanner read=new Scanner(System.in);
	void Add(int a,int b)
	{
		System.out.println("Enter the two integers to be added : ");
		a=read.nextInt();
		b=read.nextInt();
		sum=a+b;
		System.out.println("The sum of two integers is :" + sum);
	}
	void Add(double x,double y)
	{
		System.out.println("Enter the two decimal numbers to be added : ");
		x=read.nextDouble();
		y=read.nextDouble();
		sum=x+y;
		System.out.println("The sum of two decimals is :" + sum);
	}
	void Add(int p,int q,int r)
	{
		System.out.println("Enter the three integers to be added : ");
		p=read.nextInt();
		q=read.nextInt();
		r=read.nextInt();
		sum=p+q+r;
		System.out.println("The sum of three integers is :" + sum);
	}
}
public class Addition
{
	public static void main(String[] args)
	{
		Numbers n=new Numbers();
		n.Add(0,0);
		n.Add(0.0,0.0);
		n.Add(0,0,0);
		
	}
}
