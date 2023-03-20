
package az.perfect.service.impl;

import az.perfect.beans.Student;
import az.perfect.service.inter.MenuLoginServiceInter;
import az.perfect.util.Config;
import java.util.Scanner;


public class MenuAddStudentService implements MenuLoginServiceInter{

    @Override
    public void process() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Surname");
        String surname = sc.next();
        System.out.println("Enter Age");
        int age = sc.nextInt();
         System.out.println("Enter School Name");
        String schoolName = sc.next();
        System.out.println("Enter Scholarship");
        double scholarship= sc.nextInt();
        
        
        Student st = new Student();
        st.setName(name);
        st.setSurname(surname);
       st.setAge(age);
       st.setSchoolName(schoolName);
       st.setScholarship(scholarship);
       
       Config.instance().setStudents(st);
       
       
                
                        
    }
    
}
