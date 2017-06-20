package com.pattern.service.Observer.pushModel;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xuliangxiao on 2017/6/20 9:55
 */
public class PushObserver1 implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" PushObserver1 run ... " );
    }

}
