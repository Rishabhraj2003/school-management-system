package service;

import model.Student;
import model.Teacher;
import util.FileUtil;

import java.util.ArrayList;

public class SchoolService {

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    private final String STUDENT_FILE = "students.dat";
    private final String TEACHER_FILE = "teachers.dat";

    public SchoolService() {
        students = (ArrayList<Student>) FileUtil.loadObject(STUDENT_FILE);
        teachers = (ArrayList<Teacher>) FileUtil.loadObject(TEACHER_FILE);

        if (students == null) students = new ArrayList<>();
        if (teachers == null) teachers = new ArrayList<>();
    }

    // ---------- STUDENT ----------
    public void addStudent(Student s) {
        students.add(s);
        save();
        System.out.println("Student added");
    }

    public Student getStudentById(int id) {
        for (Student s : students)
            if (s.getId() == id)
                return s;
        return null;
    }

    public void viewStudents() {
        students.forEach(System.out::println);
    }

    // ---------- TEACHER ----------
    public void addTeacher(Teacher t) {
        teachers.add(t);
        save();
        System.out.println("Teacher added");
    }

    public Teacher getTeacherById(int id) {
        for (Teacher t : teachers)
            if (t.getId() == id)
                return t;
        return null;
    }

    public void viewTeachers() {
        teachers.forEach(System.out::println);
    }

    // ---------- MARKS ----------
    public void addMarks(int studentId, String subject, int marks) {
        Student s = getStudentById(studentId);
        if (s != null) {
            s.addMarks(subject, marks);
            save();
            System.out.println("Marks added");
        }
    }

    // ---------- ATTENDANCE ----------
    public void markAttendance(int studentId, double attendance) {
        Student s = getStudentById(studentId);
        if (s != null) {
            s.setAttendance(attendance);
            save();
            System.out.println("Attendance updated");
        }
    }

    private void save() {
        FileUtil.saveObject(students, STUDENT_FILE);
        FileUtil.saveObject(teachers, TEACHER_FILE);
    }
}
