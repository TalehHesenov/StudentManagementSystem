
package az.perfect.util;

import az.perfect.service.impl.MenuAddStudentService;
import az.perfect.service.impl.MenuAddTeacherService;
import az.perfect.service.impl.MenuLoginService;
import az.perfect.service.impl.MenuRegisterService;
import az.perfect.service.impl.MenuShowStudentService;
import az.perfect.service.impl.MenuShowTeacherService;
import az.perfect.service.impl.MenuUnknownService;
import az.perfect.service.inter.MenuService;


public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()),
    REGISTRY(2,"Registry",new MenuRegisterService()),
    ADD_STUDENT(3,"Add Student",new MenuAddStudentService()),
    ADD_TEACHER(4,"Add Teacher",new MenuAddTeacherService()),
    SHOW_STUDENT(5,"Show All Student",new MenuShowStudentService()),
    SHOW_TEACHER(6,"Show All Teacher",new MenuShowTeacherService()),
    EXIT(7,"Exit",  null),
    UNKNOWN(new MenuUnknownService());

    private Menu(MenuService service) {
        this.service = service;
    }
    
    
    
    private int number;
    private String text;
    private MenuService service;

    @Override
    public String toString() {
        return number + "." + text;
    }
    
    
    
    

    private Menu(int number, String text,MenuService service) {
        this.number = number;
        this.text = text;
        this.service = service;
    }
    
    public void enumProcess(){
    
    service.process();
    MenuUtil.selectMenu();
    }

    public int getNumber() {
        return number;
    }
    public static Menu findNumber(int selectedMenu){
    
     Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
             if (selectedMenu==m[i].getNumber()) {
            return m[i];
        }
        }return Menu.UNKNOWN;
       
    
    }
}
