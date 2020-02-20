/**
 * Project Name:LearnAOP
 * File Name:AppDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月19日上午10:06:36
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

/**
 * Description: app核心类 <br/>
 * Date: 2020年2月19日 上午10:06:36 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class AppDaoImpl {

    public void zhuanMoney() {
        System.out.println("转账成功");
    }

    public void selectMoney() {
        System.out.println("您的余额为100万");
    }

    public void invest() {
        System.out.println("恭喜您，投资失败");
    }

}
