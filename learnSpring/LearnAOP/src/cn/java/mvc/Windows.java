/**
 * Project Name:LearnAOP
 * File Name:Windows.java
 * Package Name:cn.java.mvc
 * Date:2020年2月20日下午2:40:48
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 2020年2月20日 下午2:40:48 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Windows {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        AddCaipinSevlet addSevlet = (AddCaipinSevlet) context.getBean("addCaipinSevlet");
        addSevlet.doPost();
    }
}
