package com.pattern.service.chainOfResponsibility.case3;

/**
 * Created by xuliangxiao on 2016/10/15.
 */
public class Student{
    private String name;
    private String occupation;//职业
    private boolean hairIsLang;//头发长短
    private boolean isDanger;//是否携带凶器

    public Student(String name, String occupation, boolean hairIsLang, boolean isDanger) {
        this.name = name;
        this.occupation = occupation;
        this.hairIsLang = hairIsLang;
        this.isDanger = isDanger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isHairIsLang() {
        return hairIsLang;
    }

    public void setHairIsLang(boolean hairIsLang) {
        this.hairIsLang = hairIsLang;
    }

    public boolean isDanger() {
        return isDanger;
    }

    public void setDanger(boolean danger) {
        isDanger = danger;
    }
}
