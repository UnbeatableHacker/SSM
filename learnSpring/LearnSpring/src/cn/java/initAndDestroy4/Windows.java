/**
 * Project Name:LearnSpring
 * File Name:Windows.java
 * Package Name:cn.java.initAndDestroy4
 * Date:2020年2月17日下午6:24:51
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.initAndDestroy4;
/**
 * Description:	   <br/>
 * Date:     2020年2月17日 下午6:24:51 <br/>
 * @author   songXZ
 * @version  
 * @see 	 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Windows {

    public static void main(String[] args) {
        // 1. 开启spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取对象
        Mouse mouse = (Mouse) context.getBean("Mouse");
        mouse.action();
        // 3。 关闭spring容器
        ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext) context;
        c.close();
    }

}
