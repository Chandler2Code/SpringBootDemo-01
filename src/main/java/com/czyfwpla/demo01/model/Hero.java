package com.czyfwpla.demo01.model;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 02:59
 * @Description: 英雄实体
 */
public class Hero {
    private String id;
    private String name;
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //生存能力
    private Integer viability;
    //技能效果
    private Integer skillEffect;
    //攻击力
    private Integer attackCapability;
    //上手难度
    private Integer difficultStart;
    //使用简介
    private String Recommendations;

    public Integer getSkillEffect() {
        return skillEffect;
    }

    public void setSkillEffect(Integer skillEffect) {
        this.skillEffect = skillEffect;
    }

    public Integer getAttackCapability() {
        return attackCapability;
    }

    public void setAttackCapability(Integer attackCapability) {
        this.attackCapability = attackCapability;
    }

    public Integer getDifficultStart() {
        return difficultStart;
    }

    public void setDifficultStart(Integer difficultStart) {
        this.difficultStart = difficultStart;
    }

    public String getRecommendations() {
        return Recommendations;
    }

    public void setRecommendations(String recommendations) {
        Recommendations = recommendations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getViability() {
        return viability;
    }

    public void setViability(Integer viability) {
        this.viability = viability;
    }
}