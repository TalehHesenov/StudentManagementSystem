
package az.perfect.service.impl;

import az.perfect.beans.Student;
import az.perfect.service.inter.MenuShowStudentServiceInter;
import az.perfect.util.Config;
import java.util.LinkedList;


public class MenuShowStudentService implements MenuShowStudentServiceInter{

    @Override
    public void process() {
        LinkedList <Student> students = Config.instance().getStudents();
        for (Student s : students) {
            System.out.println(s);
            
        }
    
    }
    
}
