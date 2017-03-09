package com.pattern.service.chainOfResponsibility.case3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/15.
 */
public class Teacher extends AbstractManager implements Manager{
    private static final Logger logger = LoggerFactory.getLogger(Teacher.class);

    public void check(Student student){
        if(student.isHairIsLang()){
            logger.info("老师:" + student.getName()+"是长头发，赶出学校！");
        }else{
            logger.info("老师:" + student.getName() + "通过了我的检查，请知悉");
            if(getManager() != null){
                getManager().check(student);
            }
        }
    }
}
