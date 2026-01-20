package model;

public class Teacher extends Person {

    private String subject;

    public Teacher(int id, String name, String email, String subject) {
        super(id, name, email);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Subject: " + subject;
    }
}
