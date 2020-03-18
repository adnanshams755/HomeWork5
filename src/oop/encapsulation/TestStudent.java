package oop.encapsulation;



public class TestStudent {

	public static void main(String[] args) {
		Student st3 = new Student("Adnan","12-12-1981", 101);
		Student st4 = new Student("masud","11-12-1987", 102);
		
		System.out.println(st3.getStName()+" "+st3.getStDOB()+" "+st3.getStID());
		System.out.println(st4.getStName()+" "+st4.getStDOB()+" "+st4.getStID());
		

	}

}
