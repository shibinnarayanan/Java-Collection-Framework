package com.svv6.comparable;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	
	// comparable method
	@Override
	public int compareTo(Student Stud) {
		
		if(id == Stud.id)
		{
			return 0;
		}
		else if(id>Stud.id)
		{
			return 1;
		}
		else 
			return -1;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
	
	

}
