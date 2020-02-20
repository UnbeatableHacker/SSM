/**
 * Project Name:LearnSpring
 * File Name:Windows.java
 * Package Name:cn.java.lazy3
 * Date:2020年2月17日下午4:20:55
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.lazy3;
/**
 * Description:	   <br/>
 * Date:     2020年2月17日 下午4:20:55 <br/>
 * @author   songXZ
 * @version  
 * @see 	 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Windows {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("要创建对象了");
        Pig gig = (Pig) context.getBean("Pig");
    }
}
