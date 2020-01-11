package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Brent Letts");
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

        Student student1 = new Student();
        student1.setName("George Wentz");
        student1.setNumberOfCredits(2);
        student1.setGpa(3.5);

        Student student2 = new Student();
        student2.setName("Roger Rabbit");
        student2.setNumberOfCredits(5);
        student2.setGpa(3.75);

        Teacher teacher = new Teacher();
        teacher.setFirstName("Bob");
        teacher.setLastName("Sagat");
        teacher.setSubject("Underwater Basket Weaving");
        teacher.setYearsTeaching(15);

        Course course = new Course();
        ArrayList<Student> courseStudents = new ArrayList<>();
        courseStudents.add(student);
        courseStudents.add(student1);
        courseStudents.add(student2);
        course.students = courseStudents;
        course.teacher = teacher;
        course.setCourseName("Underwater Basket Weaving");
        course.setCourseCredit(5);

        System.out.println(course.courseInfo());
        System.out.println("\n\nTeacher Info: \n" + teacher.getTeacherInfo());
    }
}
