package day_8;

public class EmpWage {
	final byte WAGE_PER_HOUR = 20;
	byte empHour = 0;
	void checkAttendance(double empCheck) {
		if (empCheck == 1) {
			System.out.println("Employee is Present");
			this.empHour = 8;
		}
		else if (empCheck == 2) {
			System.out.println("Part time Employee is Present");
			this.empHour = 4; 	//Assuming part time hour 4
		}
		else {
			System.out.println("Employee is Absent");
			this.empHour = 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOP's concepts");
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		EmpWage empWage = new EmpWage();
		empWage.checkAttendance(empCheck);
		int dailyEmpWage = empWage.WAGE_PER_HOUR * empWage.empHour;
		System.out.println("Daily Wage of Employee is : " + dailyEmpWage);
		
	}
}
