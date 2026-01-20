package model;

import java.util.HashMap;

public class Student extends Person {

    private int grade;
    private HashMap<String, Integer> marks;
    private double attendance;

    public Student(int id, String name, String email, int grade) {
        super(id, name, email);
        this.grade = grade;
        this.marks = new HashMap<>();
        this.attendance = 0.0;
    }

    public void addMarks(String subject, int score) {
        marks.put(subject, score);
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public double getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
                ", Grade: " + grade +
                ", Attendance: " + attendance + "%" +
                ", Marks: " + marks;
    }
}
