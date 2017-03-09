package com.pattern.service.chainOfResponsibility.case1;

/**
 * 提供get 和 set Handler的方法
 * Created by xuliangxiao on 2016/10/14.
 */
public abstract class Abstracthandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
