package com.sapient.StudentSolution;

public class StudentRunner {

	public static void main(String[] args) {
		
		StudentImplementation si=new StudentImplementation();
		
		si.readStudent();
		
		si.displayStudent();
		
		si.displayStudentsOfCity("Hyderabad");
		
		si.displaySortedNames();
		
		si.displaySortedCity();
		
		si.displayStudentDetails("101");

	}

}
