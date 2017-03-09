package com.pattern.service.chainOfResponsibility.case1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/14.
 */
public class MyHandler extends Abstracthandler implements Handler{
    private static final Logger logger = LoggerFactory.getLogger(MyHandler.class);
    @Override
    public void operator() {
        logger.info(name + "处理结束，等待下一个责任人处理。");
        if(this.getHandler() != null){
            this.getHandler().operator();
        }else{
            logger.info(name + "之后没有责任人，此流程结束");
        }
    }

    //为了测试时便于区分，给没有个handler提供自己的名称
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
