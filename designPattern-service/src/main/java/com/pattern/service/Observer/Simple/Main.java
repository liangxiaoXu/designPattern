package com.pattern.service.Observer.Simple;

/**
 * Created by xuliangxiao on 2017/6/6 11:41
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.addObserver(new MyObserver());
        subject.operator();
    }
}
