package com.pattern.service.strategy.travel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自行车
 * Created by xuliangxiao on 2016/11/4.
 */
public class Bicycle extends AbstractVehicle implements Travel{
    private Logger logger = LoggerFactory.getLogger(Bicycle.class);

    public Bicycle(){
        super.setName("自行车");
        super.setSpeed(40);
    }


    @Override
    public double timeConsuming(double distance) {
        logger.info(this.getName() + "运行中");
        return distance / this.getSpeed();
    }
    
}
