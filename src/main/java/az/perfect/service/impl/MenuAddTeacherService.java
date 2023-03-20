
package az.perfect.service.impl;

import az.perfect.beans.Student;
import az.perfect.beans.Teacher;
import az.perfect.service.inter.MenuLoginServiceInter;
import az.perfect.util.Config;
import java.util.Scanner;


public class MenuAddTeacherService implements MenuLoginServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Surname:");
        String surname = sc.next();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
         System.out.print("Enter School Name:");
        String schoolName = sc.next();
        System.out.print("Enter Salary:");
        double salary= sc.nextInt();
        
        
        Teacher tc = new Teacher();
        tc.setName(name);
        tc.setSurname(surname);
       tc.setAge(age);
       tc.setSchoolName(schoolName);
       tc.setSalary(salary);
       
        Config.instance().setTeachers(tc);
                
            Config.save();            
    }
    
}
