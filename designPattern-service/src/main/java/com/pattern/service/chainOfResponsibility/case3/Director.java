package com.pattern.service.chainOfResponsibility.case3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/15.
 */
public class Director extends AbstractManager implements Manager{
    private static final Logger logger = LoggerFactory.getLogger(Director.class);

    public void check(Student student){
        if( student.isDanger() ){//主任检查学生是否携带凶器
            logger.info("主任：" + student.getName()+"携带了凶器，赶出学校！");
        }else{
            logger.info("主任:" + student.getName() + "通过了我的检查！");
            if(getManager() != null){
                getManager().check(student);
            }
        }
    }
}
