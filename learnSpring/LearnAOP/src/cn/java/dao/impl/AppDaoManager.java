/**
 * Project Name:LearnAOP
 * File Name:AppDaoManager.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月19日上午10:06:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

/**
 * Description: 代理类 <br/>
 * Date: 2020年2月19日 上午10:06:54 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class AppDaoManager {

    private Security security;

    private ClearResource clearResource;

    private AppLog applog;

    private AppDaoImpl appDaoImpl;

    public AppDaoManager(Security security, ClearResource clearResource, AppLog applog, AppDaoImpl appDaoImpl) {
        super();
        this.security = security;
        this.clearResource = clearResource;
        this.applog = applog;
        this.appDaoImpl = appDaoImpl;
    }

    public void moneyZhuan() {
        // 1. 安全检测
        security.isSecurity();
        // 2. 核心方法
        appDaoImpl.zhuanMoney();
        // 3. 清除数据
        clearResource.clear();
        // 4. 日志
        applog.log();
    }

    public void moneySelect() {

    }

    public void touzi() {

    }
}
