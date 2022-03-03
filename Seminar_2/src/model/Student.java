package model;


public class Student {
	long st_ID;
	String name;
	String surname;

	
	public Student() {
		super();
		this.st_ID = -1;
		this.name = "Name";
		this.surname = "Surname";
	}
	
	public Student(long st_ID, String name, String surname) {
		super();
		this.st_ID = st_ID;
		this.name = name;
		this.surname = surname;
	}

	public long getSt_ID() {
		return st_ID;
	}

	public void setSt_ID(long st_ID) {
		this.st_ID = st_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
