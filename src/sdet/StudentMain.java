package sdet;

public class StudentMain {
    static void main(String[] args) {
        Student std = new Student();

        // 1. using object reference variables
        /* std.student_id = 101;
        std.student_name = "John";
        std.student_grade = 'A';

        std.printStudentData(); */

        // 2. using method
        std.setStudentData(101,"David",'A');
        std.printStudentData();

        // 3. using constructor
        Student std1 = new Student(102,"John",'B');
        std1.printStudentData();
    }
}
