

package az.perfect.main;

import az.perfect.util.Config;
import az.perfect.util.MenuUtil;


public class StudentManagementSystem {

    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.selectMenu();
    }
}
