package com.pattern.service.Observer.Simple;

/**
 * 主题接口
 * Created by xuliangxiao on 2017/6/6 11:28
 */
public interface Subject {
    /**
     * 添加观察者
     * @param observer
     */
    void addObserver( Observer observer );

    /**
     * 删除观察者
     * @param observer
     */
    void deleteObserver( Observer observer );

    /**
     * 通知所有的观察者
     */
    void notifyAllObservers();

    /**
     * 自己的操作
     */
    void operator();
}
