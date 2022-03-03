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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		String alphabetDigit = "abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ1234567890";
		for(int i = 0; i < degree.length(); i++)
			if(alphabetDigit.indexOf(degree.charAt(i)) == -1) {
				this.degree = "InvaildDegreeName";
				return;
			}
		this.degree = degree;
	}

}
