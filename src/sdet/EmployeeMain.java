package sdet;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();  // object creation of employee class
		employee1.employee_id = 101;
		employee1.employee_name = "John";
		employee1.job = "Manager";
		employee1.salary = 50000;
		System.out.println("---------- Employee1 Info ----------");
		employee1.display();
		Employee employee2 = new Employee();
		employee2.employee_id = 102;
		employee2.employee_name = "David";
		employee2.job = "Engineer";
		employee2.salary = 30000;
		System.out.println("---------- Employee2 Info ----------");
		employee2.display();
	}

}
