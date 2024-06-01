package com.FanCodeCityTodoProject.model;


public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	public boolean isCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	public Todo(int userId, int id, String title, boolean completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
    
    
}
