package getset;

public class Employee {
	private String name;
	private Address address;
	
	public void setEmployeeName(String name){
		this.name=name;
	}
	
	public String getEmployeeName(){
		return name;
	}
	
	public void setAddress(Address address){
		this.address=address;
	}
	
	public Address getAddress(){
		return address;
	}
}
