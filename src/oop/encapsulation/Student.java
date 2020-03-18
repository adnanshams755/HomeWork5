package oop.encapsulation;

public class Student {
	private String stName;
	private String stDOB;
	private int stID;
	
	public Student() {}
	public Student(String stName, String stDOB, int stID) {
		super();
		this.stName = stName;
		this.stDOB = stDOB;
		this.stID = stID;
	}
	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDOB() {
		return stDOB;
	}
	public void setStDOB(String stDOB) {
		this.stDOB = stDOB;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	


}
