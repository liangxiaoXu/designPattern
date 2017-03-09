package com.pattern.test;

import com.pattern.service.strategy.travel.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略模式测试类
 * Created by xuliangxiao on 2016/11/4.
 */
public class StrategyTest {
    private static final Logger logger = LoggerFactory.getLogger(StrategyTest.class);

    private static final Travel travel = new BicycleBigObject();//选择自行车出行
    @Test
    public void testTravel(){
        double instance = 200;
//        Travel travel = new Subway();//选择地铁出行
//        Travel travel = new Bus();//选择公交车出行
//        Travel travel = new Bicycle();//选择自行车出行


//        Travel travel = new BicycleBigObject();//大对象
        
        double timeConsuming = travel.timeConsuming(instance);
        logger.info("到达终点！距离:{}km, 耗时:{}小时", instance, timeConsuming);

    }

    @Test
    public void test(){
        long startTimeStampt = System.currentTimeMillis();
        for(int i=0;i<500;i++){
            testTravel();
        }
        long endTimeStampt = System.currentTimeMillis();
//        logger.info("耗时:" + (endTimeStampt - startTimeStampt)/1000 +"秒");
        logger.info("耗时:" + (endTimeStampt - startTimeStampt) +"毫秒");
        //次数        new对象时间 静态对象执行时间
        //100000次    20秒        18秒
        //500000次   88/87秒     89/93秒
        //50次       39毫秒        40秒

        //大对象
        //500次 1MB      439毫秒        372秒
        //500次 5MB      1096毫秒       294秒
        //500次 20MB     3165毫秒      323秒
        //500次 50MB     11528毫秒     351秒

    }

}
