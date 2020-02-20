/**
 * Project Name:LearnSpring
 * File Name:Window.java
 * Package Name:cn.java.Test
 * Date:2020年2月16日下午3:52:00
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 2020年2月16日 下午3:52:00 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Window {
    public static void main(String[] args) {
        // 启动框架
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取spring容器中的某一个创建好的对象
        Dog dog1 = (Dog) context.getBean("Dog");
        dog1.ation();
    }
}
