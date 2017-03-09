package com.pattern.service.strategy.travel;

/**
 * Created by xuliangxiao on 2016/11/4.
 */
public interface Travel {
    /**
     * @param distance 距离
     * @return 用时，单位：小时
     */
    public double timeConsuming(double distance);

}
