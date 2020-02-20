/**
 * Project Name:LearnSpring
 * File Name:Window.java
 * Package Name:cn.java.singleton2
 * Date:2020年2月16日下午8:47:22
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.singleton2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: Spring的单例与多例<br/>
 * Date: 2020年2月16日 下午8:47:22 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Duck duck1 = (Duck) context.getBean("Duck");
        Duck duck2 = (Duck) context.getBean("Duck");
        System.out.println(duck1);
        System.out.println(duck2);

    }
}
