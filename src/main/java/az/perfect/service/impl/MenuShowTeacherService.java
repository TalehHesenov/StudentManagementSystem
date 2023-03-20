
package az.perfect.service.impl;


import az.perfect.beans.Teacher;
import az.perfect.service.inter.MenuShowTeacherServiceInter;
import az.perfect.util.Config;
import java.util.LinkedList;


public class MenuShowTeacherService implements MenuShowTeacherServiceInter{

    @Override
    public void process() {
        LinkedList <Teacher> teacher = Config.instance().getTeachers();
        for (Teacher s : teacher) {
            System.out.println(s);
            
        }
    
    }
    
}
