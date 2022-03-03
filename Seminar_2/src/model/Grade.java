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
		this.student = new Student();
		this.course = new Course();
	}
	
	public Grade(long g_ID, int value, Student student, Course course)
	{
		super();
		this.g_ID = g_ID;
		this.value = value;
		this.student = student;
		this.course = course;
	}

	public long getG_ID() {
		return g_ID;
	}

	public void setG_ID(long g_ID) {
		this.g_ID = g_ID;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
