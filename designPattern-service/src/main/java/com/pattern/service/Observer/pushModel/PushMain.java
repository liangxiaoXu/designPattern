package com.pattern.service.Observer.pushModel;

import java.io.File;

/**
 *
 * Created by xuliangxiao on 2017/6/6 11:41
 */
public class PushMain {
    public static void main(String[] args) {
        PushSubject observable = new PushSubject();

        observable.addObserver( new PushObserver1() );
        observable.addObserver( new PushObserver2() );

        observable.setChanged();//设置状态变化，so 观察者们才会执行相应的操作
        String pushInfo = "you changed!";
        observable.notifyObservers( pushInfo );

//        File f = new File("D:\\IdeaProjects\\designPattern\\gitignore");
//        f.renameTo(new File("D:\\IdeaProjects\\designPattern\\.gitignore"));
    }
}
