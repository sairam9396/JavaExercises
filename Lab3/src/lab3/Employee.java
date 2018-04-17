package lab3;

public class Employee {
	private String firstName;
	private String lastName;
	protected Date joiningDate;
	protected double salary;
	private static int count;
	private int id;
	
	public Employee(String firstName, String lastName, Date joiningDate,  double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.joiningDate = joiningDate;
		this.salary = salary;
		++count;
		this.id = count;
	}
	
	public void display(){
		System.out.print("First Name"+ firstName+ "\t");
		System.out.print("Last Name"+ lastName+ "\t");
		System.out.println("Joining Date"+ joiningDate+ "\t");
		System.out.println("Salary"+ salary+ "\t");
		System.out.println("Employee ID"+ id);
	}
	

}
