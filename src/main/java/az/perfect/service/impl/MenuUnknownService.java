
package az.perfect.service.impl;

import az.perfect.service.inter.MenuService;


public class MenuUnknownService implements MenuService{

    @Override
    public void process() {
        System.out.println("please correct menu");
    }
    
}
