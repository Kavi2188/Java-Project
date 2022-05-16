package com.day1;

public class StudentDetails {
	
	public void studentName() {
		
System.out.println("Kavitha");
System.out.println("Prathi");
System.out.println("Kalai");
	}
public void studentId() {
System.out.println("123");
System.out.println("456");
System.out.println("789");
}

public void studentYear() {
System.out.println("1987");
System.out.println("1988");
System.out.println("1989");
}

public static void main(String[] args) {
	StudentDetails sd= new StudentDetails();
	sd.studentName();
	sd.studentId();
	sd.studentYear();
}

	

}
