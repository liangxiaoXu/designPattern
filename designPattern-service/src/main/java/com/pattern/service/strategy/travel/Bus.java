package com.pattern.service.strategy.travel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 公交
 * Created by xuliangxiao on 2016/11/4.
 */
public class Bus extends AbstractVehicle implements Travel{
    private Logger logger = LoggerFactory.getLogger(Bus.class);
    public Bus(){
        super.setName("公交");
        super.setSpeed(60);
    }


    @Override
    public double timeConsuming(double distance) {
        logger.info(this.getName() + "运行中");
        return distance / this.getSpeed();
    }

}
