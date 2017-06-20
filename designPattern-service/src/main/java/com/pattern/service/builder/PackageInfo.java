package com.pattern.service.builder;

/**
 * 使用内部类构造javabean
 * 1、如果使用了构造方法构建函数，那么可能需要提供多个构造方法。
 * 2、如果先使用默认的无参的构造方法（此时外部类的对象已经被创建出来了），然后再不停的调用set，这样可能会导致对象状态不一致
 *
 * 优点：在内部类还没有完全构造完成之前，外部类的对象是不会被创建的；
 *
 * Created by xuliangxiao on 2017/6/20 16:15
 */
public class PackageInfo {
}
