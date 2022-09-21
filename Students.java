package org.student;

public class Students {

	public void studentInfo(int id) {
		System.out.println("The student id is" + id);
	}
public void studentInfo(int id,String name) {
	System.out.println("The student name is"+name);
}
public void studentInfo(String email, long phonenumber) {
	System.out.println("The student emailid is"+email);
    System.out.println("The phone number is"+phonenumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students obj=new Students();
obj.studentInfo(5894);
obj.studentInfo(5894, "Vaishali");
obj.studentInfo("vaishali@gmail.com", 8940279179l);

	}
}
