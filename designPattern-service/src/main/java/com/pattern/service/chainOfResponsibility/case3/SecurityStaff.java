package com.pattern.service.chainOfResponsibility.case3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/15.
 */
public class SecurityStaff extends AbstractManager implements Manager{
    private static final Logger logger = LoggerFactory.getLogger(SecurityStaff.class);

    public void check(Student student){
        if(!"学生".equals(student.getOccupation())){
            logger.info("保安:" + student.getName()+"不是学生，不允许进入学校！");
        }else{
            logger.info("保安:" + student.getName() + "通过了我的检查，请知悉");
            if(getManager() != null){
                getManager().check(student);
            }
        }
    }
}
