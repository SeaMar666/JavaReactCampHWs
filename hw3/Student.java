package hw3;

import hw3.User;

public class Student extends User {

    String course;

    public Student(int id, String name, String lastName, String userName, String email, String password, String course) {
        super(id, name, lastName, userName, email, password);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
