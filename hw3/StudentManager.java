package hw3;

import hw3.UserManager;

public class StudentManager extends UserManager {

    public void add(Student student)
    {
        System.out.println(student.getUserName() + " kaydedildi.");

    }

}
