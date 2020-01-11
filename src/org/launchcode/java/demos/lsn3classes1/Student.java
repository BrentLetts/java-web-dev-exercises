package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    // fields/properties
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

//    public Student(String name, int numberOfCredits, double gpa){
//        this.name = name;
//        this.studentId = getStudentId();
//        this.numberOfCredits = numberOfCredits;
//        this.gpa = gpa;
//        setStudentId();
//    }


    //getters and setters
    public String studentInfo(){
        return ("Student's name: " + this.name + "\nStudent's ID: " +
                this.getStudentId() + "\nStudent's credits's: " +
                this.numberOfCredits + "\nStudent's GPA: " + this.gpa);
    }
    public String getName(){
        return this.name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public int getStudentId(){
        this.setStudentId();
        return this.studentId;
    }

    private void setStudentId(){
        this.studentId = nextStudentId;
        nextStudentId++;
    }

    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double aGpa){
        this.gpa = aGpa;
    }

}