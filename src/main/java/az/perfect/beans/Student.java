
package az.perfect.beans;

public class Student extends Person{
    private String schoolName;
    private double scholarship;

    @Override
    public String toString() {
        return "Student\n"+ "Name:" + getName() + "\nSurname:" + getSurname() + 
                "\nAge:" + getAge() + "\nSchool Name:" + schoolName + "\nScholarship:" + scholarship ;
    }
    
     

    public Student(String name, String surname, int age, String schoolName, double scholarship) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.scholarship = scholarship;
    }

    
    
    
    public Student() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    
    
    
}
