package model;

// Each course record is characterized by the title, marks, instructor.

public class CourseRecord {
	public String title; // notice that the String is not a primitive type, it is a reference type.
	public int marks; // final raw marks out of 100
	// Reminder: when declaring the type of an attribute, you may use the name of an existing class.
	public Faculty instructor; // stores the address of some faculty objects
	
	public CourseRecord() {
		// Version 1: no attributes will be initialized
		// Instead, each attribute will be initialized by its DEFAULT VALUE
		// int = 0, double = 0.0, boolean = false, reference type = null (no address)
		// if the attribute is of type String, if without being initialized, its default value is null.
	}
	
	public CourseRecord(String title) {
		this.title = title;
		// Only title attribute is initialized with input 'title'.
		// All other attributes (marks and instructor) will have their defualt values.
	}
	
	public CourseRecord(String title, int marks) {
		this.title = title;
		this.marks = marks;
		// Only title and marks attributes are initialized with input 'title' and 'marks'.
		// All other attributes (instructor) will have their defualt values.
	}
	
	public String getTitle() {
		return title;
	}

	public int getMarks() {
		return marks;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	String getLetterGrade() {
		String lg = "";
		if (this.marks >= 90) {
			lg = "A+";
		}
		else if (this.marks >= 80) {
			lg = "A";
		}
		else if (this.marks >= 70) {
			lg = "B";
		}
		else if (this.marks >= 60) {
			lg = "C";
		}
		else if (this.marks >= 50) {
			lg = "D";
		}
		else { // < 50
			lg = "F";
		}
		return lg;
	}
	
	public String getDescription() {
		// Version 1: this.instructor will give you the address of the Faculty object
		// return "Course " + this.title + " (raw marks: " + this.marks + ") " + this.instructor;
		
		// Version 2: this.instructor.getDescription() will give you the description of the Faculty object
		String desc = "";
		if (this.instructor == null) {
			desc = "Course " + this.title + " (raw marks: " + this.marks + ") has no instructor";
		}
		else {
			desc = "Course " + this.title + " (raw marks: " + this.marks + " letter grade " + this.getLetterGrade() + ") has instructor (" + this.instructor.getDescription() + ")";
		}
		return desc;
	}
	
}
