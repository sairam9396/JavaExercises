package getset;

public class Main {
	public static void main(String[] args){
		
		int i=0;
		Employee[] employees = new Employee[5];
		
		City cty = new City();
		cty.setCityName("Mumbai");
		Country cntry = new Country();
		cntry.setCountryName("India");
		cntry.setCity(cty);
		Address add = new Address();
		add.setAddressLine("502, Mahesh Avenue");
		add.setCountry(cntry);
		employees[i] = new Employee();
		employees[i].setEmployeeName("Jeje Lalpekhlua");
		employees[i].setAddress(add);
		
		City cty1 = new City();
		cty1.setCityName("Buenos Aires");
		Country cntry1 = new Country();
		cntry1.setCountryName("Argentina");
		cntry1.setCity(cty1);
		Address add1 = new Address();
		add1.setAddressLine("A1, Jesus Rue");
		add1.setCountry(cntry1);
		employees[i+1] = new Employee();
		employees[i+1].setEmployeeName("Fernando Gago");
		employees[i+1].setAddress(add1);
		
		City cty2 = new City();
		cty2.setCityName("Marseille");
		Country cntry2 = new Country();
		cntry2.setCountryName("France");
		cntry2.setCity(cty2);
		Address add2 = new Address();
		add2.setAddressLine("La Rue de la Printemps");
		add2.setCountry(cntry2);
		employees[i+2] = new Employee();
		employees[i+2].setEmployeeName("Laurent Koscielny");
		employees[i+2].setAddress(add2);
		
		City cty3 = new City();
		cty3.setCityName("Madrid");
		Country cntry3 = new Country();
		cntry3.setCountryName("Spain");
		cntry3.setCity(cty3);
		Address add3 = new Address();
		add3.setAddressLine("Block 79, Baston Arcade");
		add3.setCountry(cntry3);
		employees[i+3] = new Employee();
		employees[i+3].setEmployeeName("Francisco Alarcon");
		employees[i+3].setAddress(add3);
		
		City cty4 = new City();
		cty4.setCityName("Rome");
		Country cntry4 = new Country();
		cntry4.setCountryName("Italy");
		cntry4.setCity(cty4);
		Address add4 = new Address();
		add4.setAddressLine("21, Pirlo Street");
		add4.setCountry(cntry4);
		employees[i+4] = new Employee();
		employees[i+4].setEmployeeName("Stephen el Sharaawy");
		employees[i+4].setAddress(add4);
		
		for(i=0;i<=employees.length;i++){
			System.out.println("Name: " +employees[i].getEmployeeName());
			System.out.println("Address Line: " +employees[i].getAddress().getAddressLine());
			System.out.println("City: " +employees[i].getAddress().getCountry().getCity().getCityName());
			System.out.println("Country:" +employees[i].getAddress().getCountry().getCountryName());
			System.out.println("-------------------------------------------------------------------");
			
		}
		
		
	}

}
