
package az.perfect.util;

import java.util.Scanner;


public class MenuUtil {
    public static void showMenu(){
    Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i]!=Menu.UNKNOWN) {
                  System.out.println(m[i]);
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
