
package az.perfect.util;

import java.util.Scanner;


public class MenuUtil {
    public static void showMenu(){
    Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i]!=Menu.UNKNOWN) {
                if (m[i]==Menu.LOGIN||m[i]==Menu.REGISTRY) {
                    if (!Config.isLoggedIn()) {
                     System.out.println(m[i]);    
                    }
                    
                    
                    
                }else if (Config.isLoggedIn()) {
                    
                     System.out.println(m[i]);    
                    
                }
                  
            }
          
        }
    
    }
    public static void selectMenu(){
        Scanner sc = new Scanner (System.in);
    
        System.out.println("Please select menu:");
        showMenu();
        int selectedNumber = sc.nextInt();
        Menu.findNumber(selectedNumber).enumProcess();
    
    }
    
}
