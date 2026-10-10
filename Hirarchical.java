import java.util.*;
class Staff
{
	Scanner read= new Scanner(System.in);
	String Staffid,Staffname,Staffphone;
	double salary;
	void readData()
	{
		System.out.println("Enter the Staffid, Staffname , Staffphone , Staffsalary :");
		Staffid=read.nextLine();
		Staffname=read.nextLine();
		Staffphone=read.nextLine();
		salary=read.nextDouble();
	}
	void displayData()
	{
		System.out.println("Staff ID : " + Staffid);
		System.out.println("Staff Name : " + Staffname);
		System.out.println("Staff Phone number : " + Staffphone);
		System.out.println("Staff Salary : " + salary);
	}
}
class Teaching extends Staff
{
	Scanner read= new Scanner(System.in);
	String domain,publications;
	void readData()
	{
		super.readData();
		System.out.println("Enter the domain and publications :");
		domain=read.nextLine();
		publications=read.nextLine();
	}
	void displayData()
	{
		super.displayData();
		System.out.println("Domain :" + domain);
		System.out.println("Publications :" + publications);
	}
}
class Technical extends Staff
{
	Scanner read= new Scanner(System.in);
	String skills;
	void readData()
	{
		super.readData();
		System.out.println("Enter the skills :");
		skills=read.nextLine();
	}
	void displayData()
	{
		super.displayData();
		System.out.println("Skills :" + skills);
	}
}
class Contract extends Staff
{
	Scanner read= new Scanner(System.in);
	int period;
	void readData()
	{
		super.readData();
		System.out.println("Enter the period :");
		period=read.nextInt();
	}
	void displayData()
	{
		super.displayData();
		System.out.println("Period :" + period);
	}
}
public class Hirarchical
{
	public static void main(String[] args)
	{
		Teaching teach=new Teaching();
		Technical tech=new Technical();
		Contract c=new Contract();
		System.out.println("---TEACHING STAFF DETAILS---");
		teach.readData();
		teach.displayData();
		System.out.println("\n---TECHNICAL STAFF DETAILS---");
		tech.readData();
		tech.displayData();
		System.out.println("\n---CONTRACT STAFF DETAILS---");
		c.readData();
		c.displayData();
	}

}
