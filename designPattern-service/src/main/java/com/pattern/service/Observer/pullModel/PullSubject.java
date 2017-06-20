package com.pattern.service.Observer.pullModel;

import java.util.Observable;

/**
 * Created by xuliangxiao on 2017/6/20 14:26
 */
public class PullSubject  extends Observable {

    private int age;    //假如是用户的年龄

    public PullSubject(int age) {
        this.age = age;
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
