package com.pattern.service.chainOfResponsibility.case2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/14.
 */
public class Student extends AbstractPerson implements Person{
    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Override
    public void baoshu() {
        logger.info(name + ":\t我是" + num + "号");

        if(getNextPerson() != null){
            getNextPerson().baoshu();
        }else{
            logger.info(name + ":\t报数完毕");
        }
    }

    //便于区分，定义学生的姓名和号码
    private String name;
    private int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
