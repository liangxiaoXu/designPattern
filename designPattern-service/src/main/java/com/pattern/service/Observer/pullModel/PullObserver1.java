package com.pattern.service.Observer.pullModel;

import java.util.Observable;
import java.util.Observer;

/**
 * 需要打印出调用者的年龄，自己主动拉取
 * Created by xuliangxiao on 2017/6/20 14:25
 */
public class PullObserver1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" PullObserver1 run ... age = " + ((PullSubject) arg).getAge() );

    }

}
