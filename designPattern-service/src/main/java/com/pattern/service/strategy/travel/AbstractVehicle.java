
package com.pattern.service.strategy.travel;

/**
 * 交通工具抽象类
 * 抽象出公共的属性
 * Created by xuliangxiao on 2016/11/4.
 */
public abstract class AbstractVehicle {

    private String name;
    private double speed;

    public AbstractVehicle() {
    }

    public AbstractVehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}