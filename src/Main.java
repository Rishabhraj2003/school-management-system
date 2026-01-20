import model.Admin;
import model.Student;
import model.Teacher;
import service.SchoolService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SchoolService service = new SchoolService();
        Admin admin = new Admin();

        while (true) {
            System.out.println("\n1. Admin Login");
            System.out.println("2. Teacher Login");
            System.out.println("3. Student Login");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();

                    if (admin.login(u, p))
                        adminMenu(sc, service);
                    else
                        System.out.println("Invalid credentials");
                }

                case 2 -> {
                    System.out.print("Teacher ID: ");
                    int id = sc.nextInt();
                    Teacher t = service.getTeacherById(id);
                    if (t != null)
                        teacherMenu(sc, service);
                }

                case 3 -> {
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    Student s = service.getStudentById(id);
                    if (s != null)
                        studentMenu(sc, s);
                }

                case 4 -> System.exit(0);
            }
        }
    }

    static void adminMenu(Scanner sc, SchoolService s) {
        System.out.println("1. Add Student\n2. Add Teacher\n3. View Students\n4. View Teachers");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("ID: "); int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: "); String n = sc.nextLine();
            System.out.print("Email: "); String e = sc.nextLine();
            System.out.print("Grade: "); int g = sc.nextInt();
            s.addStudent(new Student(id, n, e, g));
        }
        if (c == 2) {
            System.out.print("ID: "); int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: "); String n = sc.nextLine();
            System.out.print("Email: "); String e = sc.nextLine();
            System.out.print("Subject: "); String sub = sc.nextLine();
            s.addTeacher(new Teacher(id, n, e, sub));
        }
        if (c == 3) s.viewStudents();
        if (c == 4) s.viewTeachers();
    }

    static void teacherMenu(Scanner sc, SchoolService s) {
        System.out.println("1. Add Marks\n2. Mark Attendance");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("Student ID: "); int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Subject: "); String sub = sc.nextLine();
            System.out.print("Marks: "); int m = sc.nextInt();
            s.addMarks(id, sub, m);
        }
        if (c == 2) {
            System.out.print("Student ID: "); int id = sc.nextInt();
            System.out.print("Attendance: "); double a = sc.nextDouble();
            s.markAttendance(id, a);
        }
    }

    static void studentMenu(Scanner sc, Student s) {
        System.out.println("1. Profile\n2. Marks\n3. Attendance");
        int c = sc.nextInt();
        if (c == 1) System.out.println(s);
        if (c == 2) System.out.println(s.getMarks());
        if (c == 3) System.out.println(s.getAttendance());
    }
}
