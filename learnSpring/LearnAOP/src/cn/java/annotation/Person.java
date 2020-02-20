/**
 * Project Name:LearnAOP
 * File Name:Person.java
 * Package Name:cn.java.annotation
 * Date:2020年2月19日下午8:11:40
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.annotation;

import org.springframework.stereotype.Component;

/**
 * Description: <br/>
 * Date: 2020年2月19日 下午8:11:40 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
// @Component(value = "person") // <bean id="person">
@Component("person")
public class Person {
    private String username;

    private String gender;

    public void study() {
        System.out.println("Person........study........人具有学习能力");
    }

    @Override
    public String toString() {
        return "Person [username=" + username + ", gender=" + gender + "]";
    }

}
