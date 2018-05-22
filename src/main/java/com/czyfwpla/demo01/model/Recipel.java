package com.czyfwpla.demo01.model;

import java.util.Date;

/**
 * @Auther: Chandler
 * @Date: 2018/5/22 23:29
 * @Description: 处方
 */
public class Recipel {
    private String RecipelId;
    private String Name;
    private Date cteateTime;
    private Date updateTime;

    public String getRecipelId() {
        return RecipelId;
    }

    public void setRecipelId(String recipelId) {
        RecipelId = recipelId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}