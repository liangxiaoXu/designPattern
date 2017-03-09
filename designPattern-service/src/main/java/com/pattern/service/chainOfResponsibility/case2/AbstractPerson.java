package com.pattern.service.chainOfResponsibility.case2;

/**
 * 抽象类,提供设置下一个报数的人的方法
 * Created by xuliangxiao on 2016/10/14.
 */
public abstract class AbstractPerson {
    //下一个报数的人
    private Person nextPerson;

    public Person getNextPerson() {
        return nextPerson;
    }
    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }
}
