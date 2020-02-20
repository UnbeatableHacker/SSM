/**
 * Project Name:LearnAOP
 * File Name:Windows.java
 * Package Name:cn.java.annotation
 * Date:2020年2月20日下午12:03:34
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 2020年2月20日 下午12:03:34 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Windows {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        Person person = (Person) context.getBean("person");
        Pet pet = (Pet) context.getBean("pet");
        person.study();
        System.out.println(pet);
    }
}
