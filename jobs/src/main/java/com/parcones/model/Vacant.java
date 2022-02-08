package com.parcones.model;

import java.util.Date;

public class Vacant {
	
	private Integer id;
	private String name;
	private String description;
	private Date date;
	private Double salary;
	private Integer highlated;
	private String image = "no-image.png";
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getHighlated() {
		return highlated;
	}
	public void setHighlated(Integer highlated) {
		this.highlated = highlated;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Vacant [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", salary="
				+ salary + "]";
	}
	
}
