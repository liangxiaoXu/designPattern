package com.pattern.service.flyweight.car;

/**
 * Created by xuliangxiao on 2016/11/23.
 */
public class CarFlyweight implements ICarFlyweight{
    private double length;
    private double width;
    private double height;

    public CarFlyweight(String key){

        if("奥迪A4".equals(key)){
            this.length = 4.63;
            this.width = 1.77;
            this.height = 1.45;
        }else if("奥迪A6".equals(key)){
            this.length = 5.12;
            this.width = 1.82;
            this.height = 1.47;
        }

    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

}
