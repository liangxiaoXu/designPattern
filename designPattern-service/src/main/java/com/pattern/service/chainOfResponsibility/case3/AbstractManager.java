package com.pattern.service.chainOfResponsibility.case3;

/**
 * Created by xuliangxiao on 2016/10/15.
 */
public abstract class AbstractManager {

    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
