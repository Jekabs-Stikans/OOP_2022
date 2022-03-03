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
		this.professor = new Professor();
	}
	
	
	public Course(long c_ID, String title, int creditPoints, Professor professor)
	{
		super();
		this.c_ID = c_ID;
		this.title = title;
		this.creditPoints = creditPoints;
		this.professor = professor;
	}


	public long getC_ID() {
		return c_ID;
	}


	public void setC_ID(long c_ID) {
		this.c_ID = c_ID;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		String alphabetDigit = "abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ1234567890";
		for(int i = 0; i < title.length(); i++)
			if(alphabetDigit.indexOf(title.charAt(i)) == -1) {
				this.title = "InvaildTitle";
				return;
			}
		this.title = title;
	}


	public int getCreditPoints() {
		return creditPoints;
	}


	public void setCreditPoints(int creditPoints) {
		if(creditPoints < 0)
			creditPoints = 0;
		this.creditPoints = creditPoints;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
