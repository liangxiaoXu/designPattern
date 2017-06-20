package com.pattern.service.Observer.Simple;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by xuliangxiao on 2017/6/6 11:37
 */
public class MySubject implements Subject{

    private Vector<Observer> observers = new Vector<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.addElement( observer );
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove( observer );
    }

    @Override
    public void notifyAllObservers() {
        Enumeration<Observer> enumeration = observers.elements();
        while(enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }

    @Override
    public void operator() {
        //状态变化了
        System.out.println("MySubject run...");
        //通知所有的观察者
        notifyAllObservers();
    }
}
