package com.cts.core;

import java.util.Iterator;
import java.util.List;

public class Practioners {
	
	private int id;
	private String name;
	private List<String> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Practioners [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	
	public void show()
	{
		System.out.println("Practioner ID"+id);
		System.out.println("Practioner Name"+name);
		Iterator <String> itr = courses.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
