package com.test.quarkus.model;


import java.util.Date;

public class Flight {

	long flightId;
	String flightBrand;
	Date flighttime;
	String fromcity;
	String tocity;
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getFlightBrand() {
		return flightBrand;
	}
	public void setFlightBrand(String flightBrand) {
		this.flightBrand = flightBrand;
	}
	public Date getFlighttime() {
		return flighttime;
	}
	public void setFlighttime(Date flighttime) {
		this.flighttime = flighttime;
	}
	public String getFromcity() {
		return fromcity;
	}
	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}
	public String getTocity() {
		return tocity;
	}
	public void setTocity(String tocity) {
		this.tocity = tocity;
	}
	
	
}
