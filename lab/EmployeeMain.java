/*Create a base class Employee with attributes: name and salary.
Create a subclass Manager that adds a department field.
Write methods to display the details of both Employee and Manager.*/

package lab;

//Base class
class Employee 
{
	String name;
	double salary;

	// Constructor
	public Employee(String name, double salary) 
	{
		this.name = name;
		this.salary = salary;
	}

	// Method to display employee details
	public void displayDetails() 
	{
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

//Subclass
class Manager extends Employee 
{
	String department;

	// Constructor
	public Manager(String name, double salary, String department) 
	{
		// Call parent constructor
		super(name, salary);
		this.department = department;
	}

	// Method to display manager details
	public void displayManagerDetails() 
	{
		// Display base class details
		super.displayDetails();
		// Display manager-specific detail
		System.out.println("Department: " + department);
	}
}

//Main class
public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		// Create Employee object
		Employee emp1 = new Employee("Kiran Pawar", 35000);
		System.out.println("=== Employee Details ===");
		emp1.displayDetails();

		System.out.println();

		// Create Manager object
		Manager mgr1 = new Manager("Rohit Patil", 55000, "IT");
		System.out.println("=== Manager Details ===");
		mgr1.displayManagerDetails();
	}
}

//OutPut
//=== Employee Details ===
//Name: Kiran Pawar
//Salary: 35000.0

//=== Manager Details ===
//Name: Rohit Patil
//Salary: 55000.0
//Department: IT






