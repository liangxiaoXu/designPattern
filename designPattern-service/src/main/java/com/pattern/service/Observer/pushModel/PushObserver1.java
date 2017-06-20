package com.pattern.service.Observer.pushModel;

import java.util.Observable;
import java.util.Observer;

/**
 * 接收推送过来的消息并且处理此消息
 * Created by xuliangxiao on 2017/6/20 9:55
 */
public class PushObserver1 implements Observer{

    @Override
    public void update(Observable o, Object baseInfo) {
        System.out.println(" PushObserver1 run ... baseInfo :" + baseInfo);
    }

}
