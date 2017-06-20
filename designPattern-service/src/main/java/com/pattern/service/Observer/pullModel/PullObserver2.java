package com.pattern.service.Observer.pullModel;

import java.util.Observable;
import java.util.Observer;

/**
 * 不关注主题的内容，so,不需要拉取信息
 * Created by xuliangxiao on 2017/6/20 14:25
 */
public class PullObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" PullObserver2 run ... ");
    }

}
