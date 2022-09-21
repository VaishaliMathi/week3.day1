package org.college;

public class Department extends College {
	public void departmentName() {
		System.out.println("The department name is civil");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Department obj=new Department();
           obj.departmentName();
          obj.collegeCode();
          obj.collegeName();
          obj.collegeRank();
	}

}
