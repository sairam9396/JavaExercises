package lab3;

public class Date {
		private int day;
		private int month;
		private int year;

		
	public Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getdateinformat(){
		String dateinformat =  day + "/"+ month + "/"+ year;
		return dateinformat;
	}


	@Override
	public String toString() {
		return getdateinformat();
	}


}
