package com.czyfwpla.demo01.DTO;

import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/21 22:31
 * @Description:
 */
public class EmrDTO {
    private String SecTion;
    private String Time;
    private String Name;
    private String Sex;
    private String Age;
    private String Phone;
    private String IdCard;
    private String Unit;
    private String Zhushu;
    private String Sizhen;
    private String Lczd;
    private String Zxing;
    private String Ywgms;
    private String Zhifa;
    private String BingW;
    private String Bxing;
    private List<DrugDTO> drugDTOS;

    public List<DrugDTO> getDrugDTOS() {
        return drugDTOS;
    }

    public void setDrugDTOS(List<DrugDTO> drugDTOS) {
        this.drugDTOS = drugDTOS;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }


    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getZhushu() {
        return Zhushu;
    }

    public void setZhushu(String zhushu) {
        Zhushu = zhushu;
    }

    public String getSizhen() {
        return Sizhen;
    }

    public void setSizhen(String sizhen) {
        Sizhen = sizhen;
    }

    public String getLczd() {
        return Lczd;
    }

    public void setLczd(String lczd) {
        Lczd = lczd;
    }

    public String getZxing() {
        return Zxing;
    }

    public void setZxing(String zxing) {
        Zxing = zxing;
    }

    public String getYwgms() {
        return Ywgms;
    }

    public void setYwgms(String ywgms) {
        Ywgms = ywgms;
    }

    public String getZhifa() {
        return Zhifa;
    }

    public void setZhifa(String zhifa) {
        Zhifa = zhifa;
    }

    public String getBingW() {
        return BingW;
    }

    public void setBingW(String bingW) {
        BingW = bingW;
    }

    public String getBxing() {
        return Bxing;
    }

    public void setBxing(String bxing) {
        Bxing = bxing;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSecTion() {
        return SecTion;
    }

    public void setSecTion(String secTion) {
        SecTion = secTion;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}