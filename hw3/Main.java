package hw3;

import hw3.Instructor;
import hw3.Student;

public class Main {

    public static void main(String[] args) {


        Instructor instructor = new Instructor(1,"Engin","Demirog","enginDe","eng@h.com","123","Java Camp");
        Student student = new Student(2,"Deniz","Aygun","denizA","dnz@g.com","0987654","Java Camp");


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

        

    }





}
