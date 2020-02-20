/**
 * Project Name:LearnAOP
 * File Name:AddCaipinSevlet.java
 * Package Name:cn.java.mvc
 * Date:2020年2月20日下午2:31:39
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: 菜品控制层<br/>
 * Date: 2020年2月20日 下午2:31:39 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
@Component("addCaipinSevlet")
public class AddCaipinSevlet {
    @Autowired
    private CaipinService caipinService;

    public void doGet() {
        caipinService.saveCaipin();
    }

    public void doPost() {
        doGet();
    }
}
