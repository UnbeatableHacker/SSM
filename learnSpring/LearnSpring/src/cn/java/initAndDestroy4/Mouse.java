/**
 * Project Name:LearnSpring
 * File Name:Mouse.java
 * Package Name:cn.java.initAndDestroy4
 * Date:2020年2月17日下午6:22:05
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.initAndDestroy4;

/**
 * Description: <br/>
 * Date: 2020年2月17日 下午6:22:05 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Mouse {

    public Mouse() {
        System.out.println("一只老鼠mouse诞生了");
    }

    public void init() {
        System.out.println("Mouse.........init");
    }

    public void destory() {
        System.out.println("Mouse............destory");
    }

    public void action() {
        System.out.println("Mouse...........action");
    }

}
