/**
 * Project Name:LearnSpring
 * File Name:person.java
 * Package Name:cn.java.di5
 * Date:2020年2月18日上午8:34:29
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.di5;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Description: <br/>
 * Date: 2020年2月18日 上午8:34:29 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Person {

    private String personName;

    private Integer age;

    private List list;

    private Set set;

    private Map map;

    private Properties properties;

    public Person() {
        System.out.println("Person......无参构造");

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person [personName=" + personName + ", age=" + age + ", list=" + list + ", set=" + set + ", map=" + map
                + ", properties=" + properties + "]";
    }

}
