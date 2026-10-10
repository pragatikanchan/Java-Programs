import java.util.*;
class GenerateException
{
	private int[] myarray=new int[5];
	private void readElements()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0;i<myarray.length;i++)
		{
			myarray[i]=Integer.parseInt(read.nextLine());
		}
	}
	private void divideElement()
	{
		int small=getSmallestElement();
		for(int i=0;i<myarray.length;i++)
		{
			double result=myarray[i]/small;
		}
		System.out.println("Division is Successfull");
	}
	private int getSmallestElement()
	{
		int small=myarray[0];
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i]<small)
				small=myarray[i];
		}
		return small;
	}
	private void displayElement()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the index you want to access : ");
		int idx=read.nextInt();
		int val=myarray[idx];
		System.out.println("Value is : " + val);
	}
	void compute()
	{
		readElements();
		divideElement();
		displayElement();
	}
}
public class Exception
{
	public static void main(String[] args)
	{
		GenerateException obj1=new GenerateException();
		try
		{
			obj1.compute();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Run time InputMismatch Error : " + ex.getMessage());
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Run time ArithmaticException Error : " + ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Run time ArrayIndexOutOfBoundsException Error : " + ex.getMessage());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Run time NumberFormatException Error : " + ex.getMessage());
		}
	}
}
