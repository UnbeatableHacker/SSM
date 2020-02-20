/**
 * Project Name:LearnAOP
 * File Name:Windows.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月19日上午10:25:26
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 2020年2月19日 上午10:25:26 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Windows {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppDaoImpl app = (AppDaoImpl) context.getBean("appDaoImpl");
        app.zhuanMoney();
    }
}
