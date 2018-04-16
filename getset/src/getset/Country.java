package getset;

public class Country {
	private String name;
	private City city;
	
	public void setCountryName(String name){
		this.name = name;
	}
	
	public String getCountryName(){
		return name;
	}
	
	public void setCity(City city){
		this.city = city;
	}
	
	public City getCity(){
		return(city);
	}
}
