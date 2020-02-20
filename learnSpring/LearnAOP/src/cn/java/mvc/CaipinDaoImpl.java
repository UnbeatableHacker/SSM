/**
 * Project Name:LearnAOP
 * File Name:CaipinDaoImpl.java
 * Package Name:cn.java.mvc
 * Date:2020年2月20日下午2:29:46
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.mvc;

import org.springframework.stereotype.Component;

/**
 * Description: 菜品dao层<br/>
 * Date: 2020年2月20日 下午2:29:46 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
@Component
public class CaipinDaoImpl implements CaipinDao {

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.mvc.CaipinDao#addCaipin()
     */
    @Override
    public void addCaipin() {
        System.out.println("添加成功");
    }
}
