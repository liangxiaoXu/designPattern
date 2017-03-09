package com.pattern.service.flyweight.car;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * 单例类 内部维护享元集合
 * Created by xuliangxiao on 2016/11/23.
 */
public class CarFlyweightFactory {

    private Map<String, ICarFlyweight> map;

    private CarFlyweightFactory(){
        map = new HashMap<String, ICarFlyweight>();
    }

    //内部类加载时才会创建实例
    private static class CarFlyweightFactoryHolder{
        private static CarFlyweightFactory CarFlyweightInstance = new CarFlyweightFactory();
    }

    public static CarFlyweightFactory getInstance(){
        return CarFlyweightFactoryHolder.CarFlyweightInstance;
    }

    public synchronized ICarFlyweight getCarFlyweight(String key){
        ICarFlyweight carFlyweight = map.get( key );
        if(carFlyweight == null){
            carFlyweight = new CarFlyweight( key );
            map.put(key, carFlyweight );
        }
        return carFlyweight;
    }

}
