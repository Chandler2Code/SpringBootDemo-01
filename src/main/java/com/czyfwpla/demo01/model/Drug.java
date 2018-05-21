package com.czyfwpla.demo01.model;

/**
 * @Auther: Chandler
 * @Date: 2018/5/22 00:02
 * @Description:
 */
public class Drug {
    private String Name;
    private String Dose;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDose() {
        return Dose;
    }

    public void setDose(String dose) {
        Dose = dose;
    }

    public Drug(String name, String dose) {
        Name = name;
        Dose = dose;
    }
}