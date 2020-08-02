package io.javabrains.coronavirustracker;

public class LocationStats {

	private String state;
	private String country;
	private int cases;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	
	@Override
	public String toString()
	{
		return "Location Stats{"+" state="+state+", country="+country+", cases="+cases+'}';
		
	}
	
	
}
