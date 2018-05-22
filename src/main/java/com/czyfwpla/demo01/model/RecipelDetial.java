package com.czyfwpla.demo01.model;

/**
 * @Auther: Chandler
 * @Date: 2018/5/22 23:30
 * @Description: 药
 */
public class RecipelDetial {
    private String recipelDetialId;
    private String receipelId;
    private String drugName;
    private String drugDose;

    public String getRecipelDetialId() {
        return recipelDetialId;
    }

    public void setRecipelDetialId(String recipelDetialId) {
        this.recipelDetialId = recipelDetialId;
    }

    public String getReceipelId() {
        return receipelId;
    }

    public void setReceipelId(String receipelId) {
        this.receipelId = receipelId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugDose() {
        return drugDose;
    }

    public void setDrugDose(String drugDose) {
        this.drugDose = drugDose;
    }
}