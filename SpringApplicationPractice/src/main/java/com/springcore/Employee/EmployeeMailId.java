package com.springcore.Employee;

public class EmployeeMailId {
	
	//attributes to hold employee mail id
	
	private String Gmail;
	private String Yahoomail;
	private String Outlookmail;
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getYahoomail() {
		return Yahoomail;
	}
	public void setYahoomail(String yahoomail) {
		Yahoomail = yahoomail;
	}
	public String getOutlookmail() {
		return Outlookmail;
	}
	public void setOutlookmail(String outlookmail) {
		Outlookmail = outlookmail;
	}
	@Override
	public String toString() {
		return "\n Gmail : " + Gmail + "\n Yahoomail : " + Yahoomail + "\n Outlookmail : " + Outlookmail + "\n";
	}
	
	//getters and setters
	
		

}
