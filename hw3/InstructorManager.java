package hw3;

import hw3.Instructor;
import hw3.UserManager;

public class InstructorManager extends UserManager {

    public void addInstructor(Instructor instructor)
    {
        System.out.println(instructor.getName() + " eklendi.");

    }
}
