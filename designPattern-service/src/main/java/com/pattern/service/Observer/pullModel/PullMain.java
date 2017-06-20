package com.pattern.service.Observer.pullModel;


/**
 *
 * Created by xuliangxiao on 2017/6/6 11:41
 */
public class PullMain {
    public static void main(String[] args) {
        PullSubject observable = new PullSubject(10);

        observable.addObserver( new PullObserver1() );
        observable.addObserver( new PullObserver2() );

        observable.setChanged();//设置状态变化，so 观察者们才会执行相应的操作

        observable.notifyObservers( observable );//拉模式，把主题本身的引用传递过去，观察者根据需要自主的拉取内容

    }
}
