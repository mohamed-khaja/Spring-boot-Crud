package com.intern.crud.model;

import org.springframework.stereotype.Component;

@Component
public class Students {

    private int rollNum;
    private String name;
    private float grade;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students [rollNum=" + rollNum + ", name=" + name + ", grade=" + grade + "]";
    }

}
