import java.util.*;
class Staff
{
	String staffid;
	String name;
	String phone;
	double salary;
	Scanner read=new Scanner(System.in);
	void readData()
	{
		System.out.println("Enter Staffid, Staffname, Phone, Salary:");
		staffid=read.nextLine();
		name=read.nextLine();
		phone=read.nextLine();
		salary=read.nextDouble();
	}
	void displayData()
	{
		System.out.println("Staffid:"+staffid);
		System.out.println("Staffname:"+name);
		System.out.println("Phone number:"+phone);
		System.out.println("Staff Salary:"+salary);
	}
}
class TeachingStaff extends Staff
{
	String domain;
	String publications;
	Scanner read=new Scanner(System.in);
	void readTeachingData()
	{
		System.out.println("Enter domain and publications:");
		domain=read.nextLine();
		publications=read.nextLine();
	}
	void displayTeachingData()
	{
		System.out.println("Domain:"+domain);
		System.out.println("Publications:"+publications);
	}
}
public class Inheritence 
{
	public static void main(String[] args) 
	{
		TeachingStaff teachstaff=new TeachingStaff();
		teachstaff.readData();
		teachstaff.readTeachingData();
		teachstaff.displayData();
		teachstaff.displayTeachingData();
		
		
	}

}
