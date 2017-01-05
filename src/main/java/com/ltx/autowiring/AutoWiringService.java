package com.ltx.autowiring;

/**
 * Created by Rain on 2017/1/5.
 */
public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        System.out.println("AutoWiringService constructor");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say() {
        autoWiringDAO.say("AutoWiringService");
    }

}
