package model;


public class Course 
{
	long c_ID;
	String title;
	int creditPoints;
	Professor professor;

	
	public Course()
	{
		super();
		this.c_ID = -1;
		this.title = "Title";
		this.creditPoints = 0;
		this.professor = Professor();
	}
	
	
	public Course(long c_ID, String title, int creditPoints, Professor professor)
	{
		super();
		this.c_ID = c_ID;
		this.title = title;
		this.creditPoints = creditPoints;
		this.professor = professor;
	}

}
