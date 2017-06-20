package com.pattern.service.Observer.pushModel;

import java.util.Observable;
import java.util.Observer;

/**
 * 接收推送过来的消息但是不处理此内容
 * Created by xuliangxiao on 2017/6/20 9:55
 */
public class PushObserver2 implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" PushObserver2 run ... " );
    }

}
