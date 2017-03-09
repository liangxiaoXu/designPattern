package com.pattern.service.flyweight.car;

/**
 * Created by xuliangxiao on 2016/11/23.
 */
public class Car {
    ICarFlyweight carFlyweight;
    String name, color;
    int power;//功率
    public Car(ICarFlyweight carFlyweight, String name, String color, int power) {
        this.carFlyweight = carFlyweight;
        this.name = name;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {

        return "Car{" +
                "length='" + carFlyweight.getLength() + '\'' +
                "，width='" + carFlyweight.getWidth() + '\'' +
                "，height='" + carFlyweight.getHeight() + '\'' +
                "，name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

}
