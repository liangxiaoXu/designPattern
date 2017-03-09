package com.pattern.service.strategy.travel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/11/4.
 */
public class Subway extends AbstractVehicle implements Travel{
    private Logger logger = LoggerFactory.getLogger(Subway.class);

    public Subway(){
        super.setName("地铁");
        super.setSpeed(100);
    }


    @Override
    public double timeConsuming(double distance) {
        logger.info(this.getName() + "运行中");
        return distance / this.getSpeed();
    }

}
