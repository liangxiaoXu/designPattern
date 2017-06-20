package com.pattern.service.Observer.pushModel;

import java.util.Observable;

/**
 * Created by xuliangxiao on 2017/6/20 10:11
 */
public class PushSubject extends Observable {
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
