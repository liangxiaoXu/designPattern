package com.pattern.service.proxy.dbquery;

/**
 * Created by xuliangxiao on 2016/12/1.
 */
public class DBQueryProxy implements IDBQuery{
    private DBQuery dbQuery = null;

    @Override
    public String queryData() {
        if(dbQuery == null){
            dbQuery = new DBQuery();    //真正需要使用时候才进行初始化
        }
        //执行真实类的处理方法前后，可以加上其他的逻辑
        brforeProxy();
        String data = dbQuery.queryData();
        afterProxy();
        return data;
    }

    private void brforeProxy(){
        System.out.println("brforeProxy");
    }

    private void afterProxy(){
        System.out.println("afterProxy");
    }

}
