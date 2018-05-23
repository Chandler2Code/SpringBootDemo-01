package com.czyfwpla.demo01.model;

/**
 * @Auther: Chandler
 * @Date: 2018/5/22 23:30
 * @Description: 药
 */
public class RecipelDetail {
    private String RecipelDetailId;
    private String RecipelDetailNumber;
    private String DrugName;
    private String DrugDose;

    public String getRecipelDetailId() {
        return RecipelDetailId;
    }

    public void setRecipelDetailId(String recipelDetailId) {
        RecipelDetailId = recipelDetailId;
    }

    public String getRecipelDetailNumber() {
        return RecipelDetailNumber;
    }

    public void setRecipelDetailNumber(String recipelDetailNumber) {
        RecipelDetailNumber = recipelDetailNumber;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        DrugName = drugName;
    }

    public String getDrugDose() {
        return DrugDose;
    }

    public void setDrugDose(String drugDose) {
        DrugDose = drugDose;
    }
}