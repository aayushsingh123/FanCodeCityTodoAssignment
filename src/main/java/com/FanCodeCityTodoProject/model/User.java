package com.FanCodeCityTodoProject.model;


public class User {
    private int id;
  
    private String userId;
    private String title;
    private Boolean completed;
    private Address address;
	public User(int id, String userId, String title, Boolean completed, Address address) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.completed = completed;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the completed
	 */
	public Boolean getCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", title=" + title + ", completed=" + completed + ", address="
				+ address + "]";
	}
    
    
	

}