/**
 * Project Name:LearnAOP
 * File Name:Login.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月19日下午2:50:36
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Description: 登录 <br/>
 * Date: 2020年2月19日 下午2:50:36 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Login {

    private String username = "admin";

    private String password = "123456";

    public void isLogin(ProceedingJoinPoint point) throws Throwable {
        if ("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功");
            point.proceed();// 放行。放行后才能继续执行核心方法，对其他切面没影响
        } else {
            System.out.println("登录失败");
        }
    }

}
