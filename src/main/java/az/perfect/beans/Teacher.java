
package az.perfect.beans;


public class Teacher extends Person{
    private String schoolName;
    private double salary;

    
    
      @Override
    public String toString() {
        return "Student\n"+ "Name:" + getName() + "\nSurname:" + getSurname() + 
                "\nAge:" + getAge() + "\nSchool Name:" + schoolName + "\nSalary:" + salary ;
    }
    
    
    
    public Teacher(String name, String surname, int age, String schoolName, double salary) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.salary = salary;
    }
    
    
   

    public Teacher() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
