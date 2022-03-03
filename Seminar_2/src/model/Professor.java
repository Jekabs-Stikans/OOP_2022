package model;


public class Professor 
{
	long p_ID;
	String name;
	String surname;
	String degree;

	
	public Professor()
	{
		super();
		this.p_ID = -1;
		this.name = "Name";
		this.surname = "Surname";
		this.degree = "Degree";
	}
	
	public Professor(long p_ID, String name, String surname, String degree)
	{
		super();
		this.p_ID = p_ID;
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}

}
