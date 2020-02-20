/**
 * Project Name:LearnSpring
 * File Name:Master.java
 * Package Name:cn.java.di5
 * Date:2020年2月17日下午9:51:22
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.di5;

/**
 * Description: 主人<br/>
 * Date: 2020年2月17日 下午9:51:22 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Master {

    private String masterName;

    private String gender;

    public Master() {

        super();
        // Auto-generated constructor stub

    }

    public Master(String masterName, String gender) {
        super();
        this.masterName = masterName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Master [masterName=" + masterName + ", gender=" + gender + "]";
    }

}
