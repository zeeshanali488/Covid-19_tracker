package com.csu.coronavirustracker.models;

public class LocationStats {

	
	private String county;
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}
	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	@Override
	public String toString() {
		return "LocationStats [county=" + county + ", state=" + state + ", country=" + country + ", latestTotalCases="
				+ latestTotalCases + ", diffFromPreviousDay=" + diffFromPreviousDay + "]";
	}
	
	
	
}
