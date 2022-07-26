package dataPack;

import java.time.LocalTime;

public class Data {
	
	private String taxiname,startstation,endstation,customerID;
	
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	private int time,startdistance,enddistance,intertime,startamount,endamount;
	
	private LocalTime t;

	public String getTaxiname() {
		return taxiname;
	}

	public void setTaxiname(String taxiname) {
		this.taxiname = taxiname;
	}

	public String getStartstation() {
		return startstation;
	}

	public void setStartstation(String startstation) {
		this.startstation = startstation;
	}

	public String getEndstation() {
		return endstation;
	}

	public void setEndstation(String endstation) {
		this.endstation = endstation;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getStartdistance() {
		return startdistance;
	}

	public void setStartdistance(int startdistance) {
		this.startdistance = startdistance;
	}

	public int getEnddistance() {
		return enddistance;
	}

	public void setEnddistance(int enddistance) {
		this.enddistance = enddistance;
	}

	public int getIntertime() {
		return intertime;
	}

	public void setIntertime(int intertime) {
		this.intertime = intertime;
	}

	public int getStartamount() {
		return startamount;
	}

	public void setStartamount(int startamount) {
		this.startamount = startamount;
	}

	public int getEndamount() {
		return endamount;
	}

	public void setEndamount(int endamount) {
		this.endamount = endamount;
	}

	public LocalTime getT() {
		return t;
	}

	public void setT(LocalTime t) {
		this.t = t;
	}
	
}