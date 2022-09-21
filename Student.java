package org.college;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Student extends Department {
	public void studentName(){
		System.out.println("The student name is vaishali");
	}
public void studentDepartment() {
	System.out.println("The student belongs to civil ");
}
public void studentId() {
	System.out.println("The student id is 89195");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        Student obj=new Student();
        obj.studentName();
        obj.studentId();
        obj.studentDepartment();
	    obj.departmentName();
	    obj.collegeCode();
	    obj.collegeName();
	    obj.collegeRank();
	
	
	
	}

}
