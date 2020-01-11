package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    public ArrayList<Student> students;
    public Teacher teacher;
    private String courseName;
    private int courseCredit;

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String aCourseName){
        this.courseName = aCourseName;
    }

    public int getCourseCredit(){
        return this.courseCredit;
    }

    public void setCourseCredit(int aCourseCredit){
        this.courseCredit = aCourseCredit;
    }




    public String courseInfo(){

        String returnString = "Course Name: " + "\n\t" + this.getCourseName();
        returnString += "\nCourse Teacher: " + "\n\tName: " + this.teacher.getName();
        returnString += "\nCourse Credit: " + "\n\t" + this.getCourseCredit();
        returnString += "\nStudents: ";
        for(Student student : this.students){
            String name = student.getName();
            returnString += "\n\tName: " + name;
        };
        return returnString;
    }
}
