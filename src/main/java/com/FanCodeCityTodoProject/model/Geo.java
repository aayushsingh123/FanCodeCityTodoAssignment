package com.FanCodeCityTodoProject.model;


public class Geo {
    private String lat;
    private String lng;
	/**
	 * @return the lat
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * @return the lng
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * @param lng the lng to set
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "Geo [lat=" + lat + ", lng=" + lng + "]";
	}
	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
    
    
}