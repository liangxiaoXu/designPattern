package com.pattern.test;

import com.pattern.service.chainOfResponsibility.case1.MyHandler;
import com.pattern.service.chainOfResponsibility.case2.Student;
import com.pattern.service.chainOfResponsibility.case3.Director;
import com.pattern.service.chainOfResponsibility.case3.SecurityStaff;
import com.pattern.service.chainOfResponsibility.case3.Teacher;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuliangxiao on 2016/10/14.
 */
public class ChainOfResponsibilityTest {
    private static final Logger logger = LoggerFactory.getLogger(ChainOfResponsibilityTest.class);

    /**
     * 例子
     */
    @Test
    public void testCase1(){
        MyHandler handler1 = new MyHandler("handler1");
        MyHandler handler2 = new MyHandler("handler2");
        MyHandler handler3 = new MyHandler("handler3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);


        //验证责任链模式循环调用，如果没有退出，则最终会导致StackOverflowError

//        handler1.setHandler(handler2);
//        handler2.setHandler(handler3);
//        handler3.setHandler(handler1);

        handler1.operator();

    }

    /**
     * 报数
     */
    @Test
    public void case2(){
        //组装责任链
        //先站好队形，学生1的后面是学生2,学生2的后面是学生3,依次类推
        Student student1 = new Student("学生1", 1);
        Student student2 = new Student("学生2", 2);
        Student student3 = new Student("学生3", 3);
        Student student4 = new Student("学生4", 4);
        Student student5 = new Student("学生5", 5);

//        student1.setNextPerson(student2);
//        student2.setNextPerson(student3);
//        student3.setNextPerson(student4);
//        student4.setNextPerson(student5);

//        logger.info("老师下达命令：开始报数!");
//        student1.baoshu();




        //第二天，学生2和学生5的位置站错了
        student1.setNextPerson(student5);
        student5.setNextPerson(student3);
        student3.setNextPerson(student4);
        student4.setNextPerson(student2);
        logger.info("老师下达命令：开始报数!");
        student1.baoshu();
    }

    /**
     * 学生进入学校
     */
    @Test
    public void case3(){
        //组装责任链
        SecurityStaff securityStaff = new SecurityStaff();
        Teacher teacher = new Teacher();
        Director director = new Director();
        securityStaff.setManager(teacher);
        teacher.setManager(director);

        //小明的家长请求进入校园
        logger.info("小明的家长请求进入校园");
        com.pattern.service.chainOfResponsibility.case3.Student jiazhang =
                new com.pattern.service.chainOfResponsibility.case3.Student("小明的家长","家长",true,true);
        securityStaff.check(jiazhang);

        logger.info("---------------华丽丽的分隔线-----------------------\n");

        //长头发的张三进入校园
        logger.info("5分钟后，长头发的张三进入校园");
        com.pattern.service.chainOfResponsibility.case3.Student zhangsan =
                new com.pattern.service.chainOfResponsibility.case3.Student("张三","学生",true,true);
        securityStaff.check(zhangsan);
        logger.info("---------------华丽丽的分隔线-----------------------\n");

        //短头发，但是携带凶器的李四进入校园
        logger.info("5分钟后，短头发，携带凶器的李四进入校园");
        com.pattern.service.chainOfResponsibility.case3.Student lisi =
                new com.pattern.service.chainOfResponsibility.case3.Student("李四","学生",false,true);
        securityStaff.check(lisi);
        logger.info("---------------华丽丽的分隔线-----------------------\n");


        //短头发，没有携带凶器的王五进入校园
        logger.info("5分钟后，短头发，没有携带凶器的王五进入校园");
        com.pattern.service.chainOfResponsibility.case3.Student wangwu =
                new com.pattern.service.chainOfResponsibility.case3.Student("王五","学生",false,false);
        securityStaff.check(wangwu);
        logger.info("---------------华丽丽的分隔线-----------------------\n");

    }
}
