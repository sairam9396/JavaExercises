package lab3;

public class Contractor {
	private String name;
	private double rate;
	private contractEmployee[]conEmployees;

	public void setContractorName(String name){
		this.name=name;
	}
	
	public String getContractorName(){
		return name;
	}
	
	public void setRate(double rate){
		this.rate=rate;
	}
	
	public double getRate(){
		return rate;
	}
	
	
}
