package model;


public class Grade 
{
	long g_ID;
	int value;
	Student student;
	Course course;

	
	public Grade()
	{
		super();
		this.g_ID = -1;
		this.value = 0;
		this.student = Student();
		this.course = Course();
	}
	
	public Grade(long g_ID, int value, Student student, Course course)
	{
		super();
		this.g_ID = g_ID;
		this.value = value;
		this.student = student;
		this.course = course;
	}

}
