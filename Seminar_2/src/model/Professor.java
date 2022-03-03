package model;


public class Professor {
	long p_ID;
	String name;
	String surname;
	String degree;

	
	public Professor() {
		super();
		this.p_ID = -1;
		this.name = "Name";
		this.surname = "Surname";
		this.degree = "Degree";
	}
	
	public Professor(long p_ID, String name, String surname, String degree) {
		super();
		this.p_ID = p_ID;
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}

	public long getP_ID() {
		return p_ID;
	}

	public void setP_ID(long p_ID) {
		this.p_ID = p_ID;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

}
