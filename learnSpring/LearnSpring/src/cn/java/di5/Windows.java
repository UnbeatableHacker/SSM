/**
 * Project Name:LearnSpring
 * File Name:Windows.java
 * Package Name:cn.java.di5
 * Date:2020年2月17日下午8:58:02
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 2020年2月17日 下午8:58:02 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Windows {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("Person");
        System.out.println(person);
    }
}
