package lab3;

public class contractEmployee extends Employee {
	private int numberOfHours;
	private static int count;
	private Contractor contractor;
	public double getSalary(){
		salary = numberOfHours * Contractor.getRate();
		return salary;
	}
	
	public void setContractor(Contractor contractor){
		this.contractor=contractor;
	}
	
	public Contractor getContractor(){
		return contractor;
	}
	
	public contractEmployee(String firstName,String lastName,String grade,Date dateOfJoining)
 	{
 		super(firstName, lastName, contractEmployee.getSalary(), dateOfJoining);
 		this.count=count++;
 	} 
	
	
	

}
