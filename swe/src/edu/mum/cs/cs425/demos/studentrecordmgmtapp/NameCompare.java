package edu.mum.cs.cs425.demos.studentrecordmgmtapp;

import java.util.Comparator;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class NameCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
