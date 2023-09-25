
import java.util.Scanner;
public class EmployeePayroll {
	int empNo;//employee number
	String name;//employee name
	double basic_sal;//employees basic salary
	double da,hra,pf;
	double netSalary;//total salary of employee including DA, HRA,PF.
	public EmployeePayroll(int empNo,String name,double basic_sal)
	{
		this.empNo=empNo;
		this.name=name;
		this.basic_sal=basic_sal;
	}
	//method to calculate net salary
	public void calculate()
	{
		da=0.12*basic_sal;
		hra=0.15*basic_sal;
		pf=0.08*basic_sal;
		netSalary=(basic_sal+da+hra)-pf;
	}
	//method displays all details of empolyee
	public void display()
	{
		System.out.println("Employee code : "+empNo);
		System.out.println("Employee name : "+name);
		System.out.println("Basic salary : "+basic_sal);
		System.out.println("net_salary : "+netSalary);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee No., Name and Basic Salary ");
		int empNo=sc.nextInt();;
		String name=sc.next();
		double basic_sal=sc.nextDouble();
		EmployeePayroll ee1=new EmployeePayroll(empNo, name,basic_sal);
		ee1.calculate();
		ee1.display();
	}
}
