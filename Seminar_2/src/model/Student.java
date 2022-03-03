package model;


public class Student 
{
	long st_ID;
	String name;
	String surname;

	
	public Student()
	{
		super();
		this.st_ID = -1;
		this.name = "Name";
		this.surname = "Surname";
	}
	
	public Student(long st_ID, String name, String surname)
	{
		super();
		this.st_ID = st_ID;
		this.name = name;
		this.surname = surname;
	}

}
