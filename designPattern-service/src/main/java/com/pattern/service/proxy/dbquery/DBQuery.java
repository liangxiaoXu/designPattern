package com.pattern.service.proxy.dbquery;

/**
 * Created by xuliangxiao on 2016/12/1.
 */
public class DBQuery implements IDBQuery{

    //此类存储了数据库连接需要的用户名、密码等涉及到安全的信息，故使用代理，不对客户端公布
//    private String url;
//    private String userName;
//    private String passWord;

    /**
     * 进行数据库连接初始化操作，比较耗时
     */
    public DBQuery(){
        System.out.println("数据库连接初始化中...");
        try {
            Thread.sleep( 2000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接初始化完成");
    }

    @Override
    public String queryData() {
        return "{\"id\":1,\"name\":\"小明\"}";
    }

}
