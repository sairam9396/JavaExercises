package ewallet;

public class Account {
	private int accountNumber;
	private float amount;
	private Customer customer;
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public int getaccountNumber(){
		return accountNumber;
	}
	
	public void setAmount(float amount){
		this.amount=amount;
	}
	
	public float getAmount(){
		return amount;
	}
	
	public void setCustomer(Customer customer){
		this.customer=customer;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	
	
	
	
	

}
