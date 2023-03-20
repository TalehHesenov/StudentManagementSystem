
package az.perfect.service.impl;

import az.perfect.service.inter.MenuLoginServiceInter;
import az.perfect.util.Config;
import java.util.Scanner;


public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {
       Scanner sc = new Scanner (System.in);
        System.out.print("Enter UserName:");
        String userName =sc.next();
        System.out.print("Enter Password:");
        String password = sc.next();
        if (!(userName.equals("admin")&&password.equals("123"))) {
            System.exit(0);
        }
        
        Config.setLoggedIn(true);
        
    }
    
}
