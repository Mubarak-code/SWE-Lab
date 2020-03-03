package edu.mum.cs.cs425.demos.studentrecordmgmtapp;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	
	public static void printListOfStudent(List<Student> student) {
		
		Collections.sort(student, new NameCompare());
		
		for(Student s : student) {
			System.out.println(s);
		}
		
	}
	
	public static void getListOfPlatinumAlumniStudents(List<Student> student) {
		
	
		List<Student> alumni = new ArrayList<Student>();
		
		int yearNow = Year.now().getValue();
	
		for (Student s : student) {
			
			int year = s.getDateOfAdmission().getYear();
			
			if((yearNow - 30) > year) {
				
				alumni.add(s);
			}
			
		}
		
		Collections.sort(alumni, new YearCompare());
		
		System.out.println(alumni);
		
	}
	
	public static void printHelloWorld(int [] arr) {
		
		for(int s : arr) {
			if (s%5 == 0 && s%7== 0) {
				System.out.println("Hello World");
			}
			else if (s%7 == 0) {
				System.out.println("World ");
			}
			else if(s%5 == 0) {
				System.out.println("Hello ");
			}
		}
	}
	
	
	public static int findSecondBiggest(int [] arr) {
	
			int first = arr[0];
			int secondBiggest = first;
			
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > first) {
				secondBiggest = first;
				first = arr[i];
				
			}
		}

		
		return secondBiggest;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student a = new Student(110001, "Dave", LocalDate.of(1951, 11, 18));
		Student b = new Student(110002, "Anna", LocalDate.of(1990, 07, 12));
		Student c = new Student(110003, "Erica", LocalDate.of(1974, 01, 31));
		Student d = new Student(110004, "Carlos", LocalDate.of(2009, 8, 8));
		Student e = new Student(110005, "Bob", LocalDate.of(1990, 05, 03));
				
		
		
		List<Student> createStudent = new ArrayList<Student>();
		
		createStudent.add(a);
		createStudent.add(b);
		createStudent.add(c);
		createStudent.add(d);
		createStudent.add(e);
		
		int [] ar =  {35,49,15,21};
		
		//System.out.println(createStudent);
	
		//printListOfStudent(createStudent);
		
	 //getListOfPlatinumAlumniStudents(createStudent);
		
		
		
		//printHelloWorld(ar);
		
		System.out.println(findSecondBiggest(ar));
		
	
	}
}
