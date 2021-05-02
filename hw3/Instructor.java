package hw3;

public class Instructor extends User {

    String instructorOf;

    public Instructor(int id, String name, String lastName, String userName, String email, String password, String instructorOf) {
        super(id, name, lastName, userName, email, password);
        this.instructorOf = instructorOf;
    }

    public String getInstructorOf() {
        return instructorOf;
    }

    public void setInstructorOf(String instructorOf) {
        this.instructorOf = instructorOf;
    }
}
