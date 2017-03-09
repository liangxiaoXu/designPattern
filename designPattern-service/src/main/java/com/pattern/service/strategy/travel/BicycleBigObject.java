package com.pattern.service.strategy.travel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自行车
 * Created by xuliangxiao on 2016/11/4.
 */
public class BicycleBigObject extends AbstractVehicle implements Travel{
    private Logger logger = LoggerFactory.getLogger(BicycleBigObject.class);

    private byte[] data ;

    public BicycleBigObject(){
        super.setName("自行车");
        super.setSpeed(40);
        this.data = new byte[1024 * 1024 * 50];//1MB
    }


    @Override
    public double timeConsuming(double distance) {
        logger.info(this.getName() + "运行中");
        return distance / this.getSpeed();
    }
    
}
