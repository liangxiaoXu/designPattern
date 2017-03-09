package com.pattern.test;

import com.pattern.service.flyweight.car.Car;
import com.pattern.service.flyweight.car.CarFlyweight;
import com.pattern.service.flyweight.car.CarFlyweightFactory;
import com.pattern.service.flyweight.car.ICarFlyweight;
import org.junit.Test;

/**
 * 享元模式测试类
 *
 * 此例子中，如果系统中需要创建100辆奥迪A6汽车和100辆奥迪A4汽车，那么最终只会产生2个CarFlyweight对象
 *
 * Created by xuliangxiao on 2016/11/23.
 */
public class FlyWeightTest {

    @Test
    public void makeCar(){
        String brand_A6 = "奥迪A6";
        ICarFlyweight carFlyweight_A6 = CarFlyweightFactory.getInstance().getCarFlyweight(brand_A6);
        Car car_A6_1 = new Car(carFlyweight_A6, "奥迪A6", "黑色", 160);
        Car car_A6_2 = new Car(carFlyweight_A6, "奥迪A6", "白色", 160);
        System.out.println(car_A6_1);
        System.out.println(car_A6_2);

        String brand_A4 = "奥迪A4";
        ICarFlyweight carFlyweight_A4 = CarFlyweightFactory.getInstance().getCarFlyweight(brand_A4);
        Car car_A4_1 = new Car(carFlyweight_A4, "奥迪A4", "黑色", 140);
        Car car_A4_2 = new Car(carFlyweight_A4, "奥迪A4", "白色", 140);
        System.out.println(car_A4_1);
        System.out.println(car_A4_2);




    }

}
