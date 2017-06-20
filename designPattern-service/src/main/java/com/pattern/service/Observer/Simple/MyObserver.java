package com.pattern.service.Observer.Simple;

/**
 * Created by xuliangxiao on 2017/6/6 11:41
 */
public class MyObserver implements Observer{
    @Override
    public void update() {
        System.out.println("MyObserver 得到了通知，run...");
    }
}
