/**
 * Project Name:LearnSpring
 * File Name:Penguin.java
 * Package Name:cn.java.di5
 * Date:2020年2月17日下午8:54:06
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.di5;

/**
 * Description: 企鹅<br/>
 * Date: 2020年2月17日 下午8:54:06 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Penguin {
    private String name;

    private String gender;

    private Integer age;

    private Master master;

    public Penguin() {
        System.out.println("Penguin..........无参构造");
    }

    public Penguin(String name, String gender, Integer age) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("Penguin..........有参构造1");
    }

    public Penguin(Integer age, String gender, String name) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("Penguin..........有参构造2");
    }

    public Penguin(String name, String gender, Integer age, Master master) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.master = master;
    }

    @Override
    public String toString() {
        return "Penguin [name=" + name + ", gender=" + gender + ", age=" + age + ", master=" + master + "]";
    }

}
