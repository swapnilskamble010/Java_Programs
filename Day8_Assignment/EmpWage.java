package day_8;

public class EmpWage {
	final byte WAGE_PER_HOUR = 20;
	byte empHour = 0;
	void checkAttendance(double empCheck) {
		switch((int)empCheck) {
		case 1:
			System.out.println("Employee is Present");
			this.empHour = 8;
			break;
			
		case 2:
			System.out.println("Part time Employee is Present");
			this.empHour = 4;
			break;
			
		default:
			System.out.println("Employee is Absent");
			this.empHour = 0;		
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOP's concepts");
		
		int totalEmpWage = 0;
		EmpWage empWage = new EmpWage();
		for (int i = 1; i < 21; i++) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			empWage.checkAttendance(empCheck);
			int dailyEmpWage = empWage.WAGE_PER_HOUR * empWage.empHour;
			System.out.println("Daily Wage of Employee is : " + dailyEmpWage);
			totalEmpWage += dailyEmpWage;
			System.out.println("Monthly Wage of Employee is : " + totalEmpWage);
		}	
	}
}
