package com.pattern.service.builder;

/**
 * Created by xuliangxiao on 2017/6/20 16:23
 */
public class TestBuilderPeople {
    public static void main(String[] args) {
        /**
         * 构造函数放一些非空的内容，其他的参数调用方法进行构造
         */
        People p = new People.Builder(1,"小明",10).buildAddress("北京市").buildPhone("13621098267").build();
        System.out.println(p.toString());

    }
}
