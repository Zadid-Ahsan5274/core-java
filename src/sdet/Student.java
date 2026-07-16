package sdet;

public class Student {
    int student_id;
    String student_name;
    char student_grade;

    void printStudentData()
    {
        System.out.println(student_id + " "+student_name+" "+student_grade);
    }

    void setStudentData(int id, String name, char grade)
    {
        student_id = id;
        student_name = name;
        student_grade = grade;
    }

    Student()
    {

    }

    Student(int sid, String sname, char sgrade)
    {
        student_id = sid;
        student_name = sname;
        student_grade = sgrade;
    }
}
