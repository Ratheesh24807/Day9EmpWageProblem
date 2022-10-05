package com.EmpWageProblem;

public class EmployeeAttendanceComputationUC1
{
	
public int IS_FULL_TIME = 1;
	
	public void getAttendance() 
	{

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		   System.out.println("Employee is present");
		else
		   System.out.println("Employee is Absent");
     }

	public static void main(String[] args)
	{
		EmployeeAttendanceComputationUC1 emp = new EmployeeAttendanceComputationUC1();
		emp.getAttendance();
		

	}


}
