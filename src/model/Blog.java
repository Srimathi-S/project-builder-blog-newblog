package model;

import java.time.LocalDate;

// Type your code
public class Blog
{
	private String title;
	private String description;
	private LocalDate postedOn;
	
	//constructor
	public Blog(String title, String description, LocalDate postedOn) {
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	
	//Getters and setters for title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//Getters and setters for description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//Getters and setters for posted on
	public LocalDate getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}

	public void printDetails() {
		System.out.println("Blog Title: "+title);
		System.out.println("Blog Description: "+description);
		System.out.println("Posted on: "+postedOn);
	}

	
	
}