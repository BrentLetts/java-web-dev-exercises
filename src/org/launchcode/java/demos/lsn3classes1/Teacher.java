package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String aFirstName){
        this.firstName = aFirstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String aLastName){
        this.lastName = aLastName;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public int getYearsTeaching(){
        return this.yearsTeaching;
    }

    public void setYearsTeaching(int aYearsTeaching){
        this.yearsTeaching = aYearsTeaching;
    }

    public String getTeacherInfo(){
        return ("Teacher Name: " + "\n\t" + this.getName() +
                "\nTeacher Subject: " + "\n\t" +  this.getSubject() +
                "\nYears Teaching: " + "\n\t" +  this.getYearsTeaching());
    }
}
