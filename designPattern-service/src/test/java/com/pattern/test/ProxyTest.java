package com.pattern.test;

import com.pattern.service.proxy.dbquery.DBQueryProxy;
import com.pattern.service.proxy.dbquery.IDBQuery;
import org.junit.Test;

/**
 * 代理模式，测试类
 * Created by xuliangxiao on 2016/12/1.
 */
public class ProxyTest {

    @Test
    public void procyTest(){
        IDBQuery idbQuery = new DBQueryProxy();
        System.out.println( idbQuery.queryData() );

        System.out.println("");
    }

}
