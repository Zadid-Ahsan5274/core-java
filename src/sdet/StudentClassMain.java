package sdet;

public class StudentClassMain {

	public static void main(String[] args) {
		StudentClass student = new StudentClass();
		student.student_id = 101;
		student.student_name = "Smith";
		student.student_grad = 'A';
		student.printData();
		
		StudentClass student1 = new StudentClass();
		student.student_id = 102;
		student.student_name = "Peter";
		student.student_grad = 'B';
		student.printData();
	}

}
