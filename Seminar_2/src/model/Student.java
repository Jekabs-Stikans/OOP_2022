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
		String alphabet = "abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ";
		for(int i = 0; i < name.length(); i++)
			if(alphabet.indexOf(name.charAt(i)) == -1) {
				this.name = "InvaildName";
				return;
			}
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		String alphabet = "abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ";
		for(int i = 0; i < surname.length(); i++)
			if(alphabet.indexOf(surname.charAt(i)) == -1) {
				this.surname = "InvaildSurname";
				return;
			}
		this.surname = surname;
	}

}
