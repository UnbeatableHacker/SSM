/**
 * Project Name:LearnAOP
 * File Name:Pet.java
 * Package Name:cn.java.annotation
 * Date:2020年2月20日下午12:23:12
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: 宠物类 <br/>
 * Date: 2020年2月20日 下午12:23:12 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
@Component
public class Pet {
    @Autowired
    // @Resource(name="") 在不同包下有相同类时，可以用name指定需要的是哪个
    private Person person;

    /**
     * <bean id="pet" class=""> <property name="person" ref="person"> </bean>
     */

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Pet [person=" + person + "]";
    }

}
